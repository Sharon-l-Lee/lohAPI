package com.loharchive.lordlog.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ArtifactType {
    RL("렐릭"), //렐릭
    NB("노블"), //노블
    NM("노멀"); //일반

    @Getter
    private final String artifactType;
}
