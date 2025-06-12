package com.loharchive.lordlog.characters;

import com.loharchive.lordlog.artifacts.ArtifactsCharacterDetailDto;
import com.loharchive.lordlog.artifacts.ArtifactsService;
import com.loharchive.lordlog.search.SearchCharactersDto;
import com.loharchive.lordlog.skills.SkillsCharacterDetailDto;
import com.loharchive.lordlog.skills.SkillsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class CharactersService {
    private final CharactersMapper charactersMapper;

    @Autowired
    private CharactersRepository charactersRepository;
    @Autowired
    private SkillsService skillsService;

    @Autowired
    private ArtifactsService artifactsService;

    public CharactersService(CharactersMapper charactersMapper) {
        this.charactersMapper = charactersMapper;
    }

    public List<SearchCharactersDto> searchCharacter(String keyword) {
        Map<String, Object> params = new HashMap<>();
        log.debug("캐릭터 검색어: {}", keyword);
        String[] strArr = keyword.split("\\s");
        for(String s : strArr){
            log.debug("캐릭터 검색어 arr: {}", s);
            params.put("keywords", Arrays.asList(s));
        }
        return charactersMapper.searchCharacter(params);
    }

    public CharacterDetailDto detailCharacter(Long id){
        List<Object[]> detailResult = charactersRepository.findCharactersDetailById(id);
        Object[] row = detailResult.get(0);
        log.debug("행 반환: {}", row);
        Characters c = (Characters) row[0];
        String element_name = (String) row[1];
        String job_name = (String) row[2];

        List<SkillsCharacterDetailDto> skillList = skillsService.getCharacterSkills(id);
        List<ArtifactsCharacterDetailDto> artifactList= artifactsService.getCharacterArtifacts(id);
        log.debug("캐릭터 서비스 스킬리스트 {}", skillList);
        log.debug("캐릭터 서비스 아펙리스트 {}", artifactList);
        CharacterInfoDto info = CharacterInfoDto.from(c, element_name, job_name);
        CharacterDetailDto result = CharacterDetailDto.builder()
                .characterInfo(info)
                .skillList(skillList)
                .artifactList(artifactList)
                .build();
        return result;
    }

}
