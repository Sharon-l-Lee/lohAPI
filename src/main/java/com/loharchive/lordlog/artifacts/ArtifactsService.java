package com.loharchive.lordlog.artifacts;

import com.loharchive.lordlog.search.SearchArtifactsDto;
import com.loharchive.lordlog.search.SearchRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ArtifactsService {
    private final ArtifactsMapper artifactsMapper;

    @Autowired
    private ArtifactsRepository artifactsRepository;

    public ArtifactsService(ArtifactsMapper artifactsMapper) {
        this.artifactsMapper = artifactsMapper;
    }

    public List<SearchArtifactsDto> searchArtifacts(SearchRequestDto searchRequestDto){
//        Map<String, Object> params = new HashMap<>();
//        log.debug("아펙 검색어: {}", keywords);
//        String[] strArr = keywords.split("\\s");
//        for(String s : strArr){
//            log.debug("아펙 검색어 arr: {}", s);
//            params.put("keywords", Arrays.asList(s));
//        }
        return artifactsMapper.searchArtifacts(searchRequestDto);

    }

    public List<ArtifactsCharacterDetailDto> getCharacterArtifacts(Long cid){
        log.debug("cid {}", cid);
        log.debug("artifactList {}", artifactsRepository.findArtifactsByCharacters_Id(cid));
        return artifactsRepository.findArtifactsByCharacters_Id(cid).stream()
                .map(ArtifactsCharacterDetailDto::fromEntity)
                .toList();


    }
}
