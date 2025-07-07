package com.loharchive.lordlog.common.enums;

import lombok.Getter;

public enum ContactType {
    ER("오류제보"),
    FR("기능추가요청"),
    DA("데이터수정"),
    ET("기타");


    @Getter
    private final String label;

    ContactType(String label){
        this.label = label;

    }
    @Override
    public String toString() {
        return label;
    }
}
