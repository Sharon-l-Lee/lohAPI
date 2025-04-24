package com.loharchive.lordlog.artifacts;

import com.loharchive.lordlog.characters.Characters;
import com.loharchive.lordlog.common.enums.ArtifactType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Artifacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Enumerated(EnumType.STRING)
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
