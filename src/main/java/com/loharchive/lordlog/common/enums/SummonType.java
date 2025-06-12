package com.loharchive.lordlog.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum SummonType {

    AL("상시"),
    CT("계약"),
    RR("복각형"),
    COL("콜라보");

    private final String SummonType;
}
