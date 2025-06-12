package com.loharchive.lordlog.element;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Element {

    @Id
    private Long id;
    private String name;
}
