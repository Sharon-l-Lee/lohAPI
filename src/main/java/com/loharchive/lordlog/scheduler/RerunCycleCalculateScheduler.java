package com.loharchive.lordlog.scheduler;

import com.loharchive.lordlog.rerun.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Component
public class RerunCycleCalculateScheduler {
    //복각이 진행되는 보름마다 주기 업데이트

    private final RerunMapper rerunMapper;
    private final RerunSchedulerRepository rerunSchedulerRepository;

    public RerunCycleCalculateScheduler(RerunMapper rerunMapper, RerunSchedulerRepository rerunSchedulerRepository){
        this.rerunMapper = rerunMapper;
        this.rerunSchedulerRepository = rerunSchedulerRepository;
    }

    @Scheduled(cron = "0 0 1 1,16 * *")
    public RerunScheduler rerunCycleCalculate(){
        List<RerunCycleSchedulerDto> rerunList= rerunMapper.rerunGapDayCalculate();
        int countAll = rerunList.stream().mapToInt(RerunCycleSchedulerDto::getCount_gap).max().orElse(0);
        int rerunCount = rerunList.stream().map(RerunCycleSchedulerDto::getGap_day).reduce(0, Integer::sum);
        int result = rerunCount/countAll;

        RerunCycleSchedulerInsertDto rerunCycleSchedulerInsertDto = new RerunCycleSchedulerInsertDto();
        rerunCycleSchedulerInsertDto.setRerunCharaCount(countAll);
        rerunCycleSchedulerInsertDto.setRerunPredictCycle(result);

        RerunScheduler scheduler = rerunCycleSchedulerInsertDto.toEntity();

//        log.debug("countAll {}", countAll);
//        log.debug("result {}", result);

         return rerunSchedulerRepository.save(scheduler);


    }
}
