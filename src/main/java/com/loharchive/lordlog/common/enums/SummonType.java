package com.loharchive.lordlog.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum SummonType {

    AL("인연소환", "ALWAYS_SUMM"),
    CT("계약소환", "ALWAYS_SUMM"),
    RR("운명소환", "LIMITED_SUMM"),
    COL("콜라보", "LIMITED_SUMM");

    @Getter
    private final String label;
    private final String category;

    @Override
    public String toString() {
        return label;
    }
}
