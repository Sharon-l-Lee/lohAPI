package com.loharchive.lordlog.characters;

import com.loharchive.lordlog.common.enums.AcquisitionMethodType;
import com.loharchive.lordlog.common.enums.SummonType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Builder
@Slf4j
public class CharacterInfoDto {

    private String cname;
    private String cname_en;
    private String age;
    private Long height;
    private LocalDate birth;
    private String zodiac;
    private String voice;
    private String voice_jp;
    private Long element_id;
    private Long job_id;
    private String element_name;
    private String job_name;
    private Long race_id;
    private String important_value;
    private String favorite_food;
    private LocalDate release_date;
    private String img_url;
    private String description;
    private String mbti;
    @Enumerated(EnumType.STRING)
    private AcquisitionMethodType acquisitionMethodType;
    @Enumerated(EnumType.STRING)
    private SummonType summonType;

    public static CharacterInfoDto from(Characters character, String element_name, String job_name) {
        return CharacterInfoDto.builder()
                .cname(character.getCname())
                .cname_en(character.getCname_en())
                .age(character.getAge())
                .height(character.getHeight())
                .birth(character.getBirth())
                .zodiac(character.getZodiac())
                .voice(character.getVoice())
                .voice_jp(character.getVoice_jp())
                .element_id(character.getElement_id())
                .job_id(character.getJob_id())
                .element_name(element_name)
                .job_name(job_name)
                .race_id(character.getRace_id())
                .important_value(character.getImportant_value())
                .favorite_food(character.getFavorite_food())
                .release_date(character.getRelease_date())
                .img_url(character.getImg_url())
                .description(character.getDescription())
                .mbti(character.getMbti())
                .acquisitionMethodType(character.getAcquisition_method())
                .summonType(character.getSummon_type())
                .build();
    }
}
