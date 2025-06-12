package com.loharchive.lordlog.skills;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SkillsService {
    @Autowired
    private SkillsRepository skillsRepository;

    public List<SkillsCharacterDetailDto> getCharacterSkills(Long cid){

        log.debug(" cid {}", cid);
        log.debug("skillsRepository {}", skillsRepository.findSkillsByCharacters_Id(cid));
        return skillsRepository.findSkillsByCharacters_Id(cid).stream()
                .map(SkillsCharacterDetailDto :: fromEntity)
                .toList();
    }
}
