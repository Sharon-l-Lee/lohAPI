package com.loharchive.lordlog.characters;


import com.loharchive.lordlog.artifacts.Artifacts;
import com.loharchive.lordlog.common.enums.AcquisitionMethodType;
import com.loharchive.lordlog.common.enums.SummonType;
import com.loharchive.lordlog.rerun.Rerun;
import com.loharchive.lordlog.skills.Skills;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    private Long race_id;
    private String important_value;
    private String favorite_food;
    private LocalDate release_date;
    private String img_url;
    private String cf_url;
    private String description;
    private String mbti;

    private boolean delete_flag;

    //획득방법
    @Enumerated(EnumType.STRING)
    private AcquisitionMethodType acquisition_method;

    @Enumerated(EnumType.STRING)
    private SummonType summon_type;


    @OneToMany(mappedBy = "characters", cascade =CascadeType.MERGE)
    private List<Skills> skills = new ArrayList<>();

    @OneToMany(mappedBy = "characters", cascade =CascadeType.MERGE)
    private List<Artifacts> artifacts = new ArrayList<>();

    @OneToMany(mappedBy = "characters", cascade =CascadeType.MERGE)
    private List<Rerun> reruns = new ArrayList<>();

}
