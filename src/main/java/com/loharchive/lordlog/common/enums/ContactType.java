package com.loharchive.lordlog.common.enums;

import lombok.Getter;

public enum ContactType {
    ER("오류제보"),
    FR("기능추가요청"),
    ET("기타");


    @Getter
    private final String contactType;

    ContactType(String contactType){
        this.contactType = contactType;

    }
}
