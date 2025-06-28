package com.loharchive.lordlog.common.controller;

import com.loharchive.lordlog.common.enums.AcquisitionMethodType;
import com.loharchive.lordlog.common.enums.SummonType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnumDto {
    private String Label;
    private String value;
    private String category;

    private EnumDto(String label, String value, String category) {
        this.Label = label;
        this.value = value;
        this.category = category;
    }

//    public static EnumDto fromEnum(Enum<?> e){
//        return new EnumDto(e.toString(), e.name());
//    }
        public static EnumDto fromEnum(AcquisitionMethodType e){
            return new EnumDto(e.getLabel(), e.name(), e.getCategory());
        }

        public static EnumDto fromEnum(SummonType e){
            return new EnumDto(e.getLabel(), e.name(), e.getCategory());
        }
}
