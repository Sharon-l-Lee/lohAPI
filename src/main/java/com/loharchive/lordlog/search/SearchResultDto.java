package com.loharchive.lordlog.search;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class SearchResultDto {
    private List<SearchCharactersDto> characters;
    private List<SearchSkillsDto> skills;
    private List<SearchArtifactsDto> artifacts;


}
