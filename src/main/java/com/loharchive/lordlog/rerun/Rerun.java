package com.loharchive.lordlog.rerun;

import com.loharchive.lordlog.characters.Characters;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rerun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date rerun_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="c_id")
    private Characters characters;
}
