package com.loharchive.lordlog.artifact;

import com.loharchive.lordlog.characters.Characters;
import com.loharchive.lordlog.common.enums.ArtifactType;
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
public class Artifact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private ArtifactType type;
    private String a_desc;
    private String a_desc_2;
    private String a_desc_3;
    private String a_desc_4;
    private String a_desc_5;
    private String a_desc_6;
    private boolean delete_flag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="c_id")
    private Characters characters;
}
