package com.loharchive.lordlog.common.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@RequiredArgsConstructor
@Getter
public enum AcquisitionMethodType {
    //자동영입
    STORY("스토리","AUTO"),
    //상시
    GOLD("골드", "ALWAYS"),
    CRYS("크리스탈","ALWAYS"),
    FAME("명성","ALWAYS"),
    FEDE("연합포인트","ALWAYS"),
    FATE("운명의 결속","ALWAYS"),
    //이벤트
    INVI("친구초대" ,"LIMITED"),
    EVET("이벤트","LIMITED"),
    //과금
    PACK("패키지","UNDETERMINE"),
    SUMM("소환","LIMITED");


    private final String label;
    private final String category;

    @Override
    public String toString() {
        return label;
    }
}
