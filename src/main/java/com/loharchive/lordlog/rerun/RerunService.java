package com.loharchive.lordlog.rerun;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class RerunService {

    private final RerunMapper rerunMapper;
    private final RerunRepository rerunRepository;
    private final RerunSchedulerRepository rerunSchedulerRepository;

    public RerunService(RerunMapper rerunMapper, RerunRepository rerunRepository, RerunSchedulerRepository rerunSchedulerRepository) {
        this.rerunMapper = rerunMapper;
        this.rerunRepository = rerunRepository;
        this.rerunSchedulerRepository = rerunSchedulerRepository;
    }

    public RerunCharacterResultDto rerunCharacterSearch(RerunSearchRequestDto data){
        if(data.getAcquisitions() !=null && data.getAcquisitions().contains("SUMM")){
            data.setSummonTypeFilter(true);
        }
        List<RerunCharacterSearchDto> characters = rerunMapper.rerunCharacterSearch((data));
        int cycleCalculate = rerunSchedulerRepository.findTopByOrderByIdDesc();
        // 조회된 캐릭터 기준으로 복각 가져오기
        List<Long> idx = characters.stream().map(RerunCharacterSearchDto::getCid).toList();
        if(!idx.isEmpty()){
            List<RerunCharacterListDto> reruns = rerunMapper.rerunListById(idx);
            return new RerunCharacterResultDto(characters,reruns,cycleCalculate);
        }else{
            return new RerunCharacterResultDto(characters,null, cycleCalculate);
        }
    }
    public int rerunCycleCalculate(){
        List<RerunCycleSchedulerDto> rerunList= rerunMapper.rerunGapDayCalculate();
        int countAll = rerunList.stream().mapToInt(RerunCycleSchedulerDto::getCount_gap).max().orElse(0);
        int result = rerunList.stream().map(RerunCycleSchedulerDto::getGap_day).reduce(0, Integer::sum);

        log.debug("countAll {}", countAll);
        log.debug("result {}", result);

        return result/countAll;
    }



}
