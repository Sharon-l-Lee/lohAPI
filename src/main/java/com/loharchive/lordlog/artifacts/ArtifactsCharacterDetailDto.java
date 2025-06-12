package com.loharchive.lordlog.artifacts;

import com.loharchive.lordlog.common.enums.ArtifactType;
import com.loharchive.lordlog.skills.Skills;
import com.loharchive.lordlog.skills.SkillsCharacterDetailDto;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ArtifactsCharacterDetailDto {

    private String name;
    @Enumerated(EnumType.STRING)
    private ArtifactType type;
    private String a_desc;
    private String a_desc_2;
    private String a_desc_3;
    private String a_desc_4;
    private String a_desc_5;
    private String a_desc_6;
    private String img_url;


    public static ArtifactsCharacterDetailDto fromEntity(Artifacts artifacts){
        return ArtifactsCharacterDetailDto.builder()
                .name(artifacts.getName())
                .type(artifacts.getType())
                .a_desc(artifacts.getA_desc())
                .a_desc_2(artifacts.getA_desc_2())
                .a_desc_3(artifacts.getA_desc_3())
                .a_desc_4(artifacts.getA_desc_4())
                .a_desc_5(artifacts.getA_desc_5())
                .a_desc_6(artifacts.getA_desc_6())
                .img_url(artifacts.getImg_url())
                .build();


    }
}
