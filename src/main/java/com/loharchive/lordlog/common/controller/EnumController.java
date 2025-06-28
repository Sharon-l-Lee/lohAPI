package com.loharchive.lordlog.common.controller;

import com.loharchive.lordlog.common.enums.AcquisitionMethodType;
import com.loharchive.lordlog.common.enums.SummonType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/enums")
public class EnumController {

    @GetMapping("/acquisition-methods")
    public List<EnumDto> getAcquisitionMethodsType(){

        return Arrays.stream(AcquisitionMethodType.values())
                .map(EnumDto::fromEnum)
                .toList();
    }

    @GetMapping("/summon")
    public List<EnumDto> getSummonType(){
        return Arrays.stream(SummonType.values())
                .map(EnumDto::fromEnum)
                .toList();
    }
}
