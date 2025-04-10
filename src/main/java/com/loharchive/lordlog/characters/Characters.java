package com.loharchive.lordlog.characters;


import com.loharchive.lordlog.artifact.Artifact;
import com.loharchive.lordlog.rerun.Rerun;
import com.loharchive.lordlog.skill.Skill;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cname;
    private String cname_en;
    private Date birth;
    private String zodiac;
    private String voice;
    private String voice_jp;
    private Long element_id;
    private Long job_id;
    private Long race_id;
    private String important_value;
    private String favorite_food;
    private Date release_date;
    private String img_url;

    private boolean delete_flag;

    @OneToMany(mappedBy = "characters", cascade =CascadeType.MERGE)
    private List<Skill> skills = new ArrayList<>();

    @OneToMany(mappedBy = "characters", cascade =CascadeType.MERGE)
    private List<Artifact> artifacts = new ArrayList<>();

    @OneToMany(mappedBy = "characters", cascade =CascadeType.MERGE)
    private List<Rerun> rerunDate = new ArrayList<>();

}
