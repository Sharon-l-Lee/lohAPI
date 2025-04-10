package com.loharchive.lordlog.skill;


import com.loharchive.lordlog.characters.Characters;
import com.loharchive.lordlog.common.enums.SkillType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private SkillType type;
    private int cooldown;
    private int slot;
    private String s_desc;
    private String s_desc_2;
    private String s_desc_3;
    private String s_desc_4;
    private String s_desc_5;
    private String s_desc_6;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="c_id")
    private Characters characters;

}
