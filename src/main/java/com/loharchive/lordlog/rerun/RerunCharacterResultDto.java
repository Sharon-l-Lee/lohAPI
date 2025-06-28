package com.loharchive.lordlog.rerun;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class RerunCharacterResultDto {
    private List<RerunCharacterSearchDto> characters;
    private List<RerunCharacterListDto> reruns;
    private int rerunPredict;

}
