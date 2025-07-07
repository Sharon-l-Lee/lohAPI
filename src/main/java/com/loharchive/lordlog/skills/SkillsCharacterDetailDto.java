package com.loharchive.lordlog.skills;

import com.loharchive.lordlog.common.enums.SkillType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@Builder
public class SkillsCharacterDetailDto {

    private String name;
    @Enumerated(EnumType.STRING)
    private SkillType type;
    private Integer cooldown;
    private Integer slot;
    private String s_desc;
    private String s_desc_2;
    private String s_desc_3;
    private String s_desc_4;
    private String s_desc_5;
    private String s_desc_6;
    private String img_url;
    private String cf_url;


    public static SkillsCharacterDetailDto fromEntity(Skills skills){
        return SkillsCharacterDetailDto.builder()
                .name(skills.getName())
                .type(skills.getType())
                .cooldown(skills.getCooldown())
                .slot(skills.getSlot())
                .s_desc(skills.getS_desc())
                .s_desc_2(skills.getS_desc_2())
                .s_desc_3(skills.getS_desc_3())
                .s_desc_4(skills.getS_desc_4())
                .s_desc_5(skills.getS_desc_5())
                .s_desc_6(skills.getS_desc_6())
                .img_url(skills.getImg_url())
                .cf_url(skills.getCf_url())
                .build();


    }
}
