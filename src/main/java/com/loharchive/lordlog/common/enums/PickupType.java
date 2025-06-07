package com.loharchive.lordlog.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PickupType {
    PICKUP("픽업중"),
    UPCOMING("픽업 예정"),
    COMMON("상시"),
    NONE("방랑중");


    @Getter
    private final String pickupType;
}
