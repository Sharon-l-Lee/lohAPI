package com.loharchive.lordlog.search;

import com.loharchive.lordlog.artifacts.ArtifactsMapper;
import com.loharchive.lordlog.characters.CharactersMapper;
import com.loharchive.lordlog.skills.SkillsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public SearchResultDto searchService(SearchRequestDto searchRequestDto){
        log.debug("dto{}", searchRequestDto.getKeywords());
        List<SearchCharactersDto> characterResult  = charactersMapper.searchCharacter(searchRequestDto);
        List<SearchSkillsDto> skillResult = skillsMapper.searchSkills(searchRequestDto);
        List<SearchArtifactsDto> artifactResult = artifactsMapper.searchArtifacts(searchRequestDto);

        return new SearchResultDto(characterResult,skillResult,artifactResult);
    }

    public SearchCharacterDetailDto searchCharacterDetail(int idx){
//        log.debug("idx:{}", idx);
        return charactersMapper.searchCharacterDetail(idx);
    }

}
