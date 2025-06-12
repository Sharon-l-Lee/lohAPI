package com.loharchive.lordlog.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AcquisitionMethodType {

    GOLD("골드"),
    CRYS("크리스탈"),
    FAME("명성"),
    FEDE("연합포인트"),
    INVI("친구초대"),
    PACK("패키지"),
    FATE("운명의 결속"),
    STORY("스토리"),
    EVET("이벤트"),
    SUMM("소환");


    private final String AcquisitionMethodType;
}
