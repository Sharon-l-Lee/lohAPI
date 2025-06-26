package com.loharchive.lordlog.rerun;

import com.loharchive.lordlog.search.SearchRerunDto;
import com.sun.jdi.LongValue;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class RerunService {

    private final RerunMapper rerunMapper;

    public RerunService(RerunMapper rerunMapper) {
        this.rerunMapper = rerunMapper;
    }

    public RerunCharacterResultDto rerunCharacterSearch(RerunSearchRequestDto data){
        List<RerunCharacterSearchDto> characters = rerunMapper.rerunCharacterSearch((data));

        List<Long> idx = characters.stream().map(RerunCharacterSearchDto::getCid).toList();
        if(!idx.isEmpty()){
            List<RerunCharacterListDto> reruns = rerunMapper.rerunListById(idx);
            return new RerunCharacterResultDto(characters,reruns);
        }else{
            return new RerunCharacterResultDto(characters,null);
        }


//        log.debug("rerunList {}", reruns);
//        log.debug("request {}", request);



    }

}
