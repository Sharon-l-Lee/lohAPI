package com.loharchive.lordlog.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public enum SkillType {
    AC("액티브"), //액티브
    PS("패시브"), //페시브
    PO("잠재"), //잠재력
    CM("커맨더");//커맨더

    @Getter
    private final String skillType;
}
