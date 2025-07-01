package com.loharchive.lordlog.rerun;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
public class RerunScheduler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rerunPredictCycle;
    private int rerunCharaCount;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp create_time;

    public RerunScheduler() {}

    public RerunScheduler(int rerunPredictCycle, int rerunCharaCount) {
        this.rerunPredictCycle = rerunPredictCycle;
        this.rerunCharaCount = rerunCharaCount;
    }
}
