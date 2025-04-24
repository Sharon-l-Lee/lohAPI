package com.loharchive.lordlog.artifacts;

import com.loharchive.lordlog.search.SearchArtifactsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ArtifactsService {
    private final ArtifactsMapper artifactsMapper;

    public ArtifactsService(ArtifactsMapper artifactsMapper) {
        this.artifactsMapper = artifactsMapper;
    }

    public List<SearchArtifactsDto> searchArtifacts(String keywords){
        Map<String, Object> params = new HashMap<>();
        log.debug("아펙 검색어: {}", keywords);
        String[] strArr = keywords.split("\\s");
        for(String s : strArr){
            log.debug("아펙 검색어 arr: {}", s);
            params.put("keywords", Arrays.asList(s));
        }
        return artifactsMapper.searchArtifacts(params);

    }
}
