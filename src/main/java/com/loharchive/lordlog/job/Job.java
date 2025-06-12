package com.loharchive.lordlog.job;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Job {
    @Id
    private Long id;
    private String name;
}
