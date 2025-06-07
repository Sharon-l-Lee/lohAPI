package com.loharchive.lordlog.admin.contact;

import com.loharchive.lordlog.characters.Characters;
import com.loharchive.lordlog.common.enums.ContactType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;


@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private ContactType type;
    @Lob
    private String contents;

    private String file_id;
    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp create_datetime;
}
