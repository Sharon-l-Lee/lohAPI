package com.loharchive.lordlog.search;

import com.loharchive.lordlog.artifacts.ArtifactsMapper;
import com.loharchive.lordlog.characters.CharactersMapper;
import com.loharchive.lordlog.skills.SkillsMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class SearchService {
    private final CharactersMapper  charactersMapper;
    private final SkillsMapper skillsMapper;
    private final ArtifactsMapper artifactsMapper;

    public SearchService(CharactersMapper charactersMapper, SkillsMapper skillsMapper, ArtifactsMapper artifactsMapper) {
        this.charactersMapper = charactersMapper;
        this.skillsMapper = skillsMapper;
        this.artifactsMapper = artifactsMapper;
    }

    public SearchResultDto searchService(String keywords){
        Map<String, Object> params = new HashMap<>();
        String[] strArr = keywords.split("\\s");
        for (String str : strArr){
            log.debug("검색어 {}" , str);
            params.put("keywords", Arrays.asList(str));
        }
        List<SearchCharactersDto> characterResult  = charactersMapper.searchCharacter(params);
        List<SearchSkillsDto> skillResult = skillsMapper.searchSkills(params);
        List<SearchArtifactsDto> artifactResult = artifactsMapper.searchArtifacts(params);

        return new SearchResultDto(characterResult,skillResult,artifactResult);
    }

    public SearchCharacterDetailDto searchCharacterDetail(int idx){
        log.debug("idx:{}", idx);
        return charactersMapper.searchCharacterDetail(idx);
    }

}
