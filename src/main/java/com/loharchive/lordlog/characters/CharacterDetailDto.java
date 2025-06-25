package com.loharchive.lordlog.characters;

import com.loharchive.lordlog.admin.contact.Contact;
import com.loharchive.lordlog.admin.contact.ContactRegisterDto;
import com.loharchive.lordlog.artifacts.ArtifactsCharacterDetailDto;
import com.loharchive.lordlog.rerun.RerunCharacterDetailDto;
import com.loharchive.lordlog.search.SearchArtifactsDto;
import com.loharchive.lordlog.search.SearchSkillsDto;
import com.loharchive.lordlog.skills.SkillsCharacterDetailDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Getter
@Setter
@Slf4j
@Builder
public class CharacterDetailDto {
    private CharacterInfoDto characterInfo;
    private List<SkillsCharacterDetailDto> skillList;
    private List<ArtifactsCharacterDetailDto> artifactList;
    private List<RerunCharacterDetailDto> rerunList;

}
