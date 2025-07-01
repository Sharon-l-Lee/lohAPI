package com.loharchive.lordlog.rerun;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RerunSchedulerRepository extends JpaRepository<RerunScheduler, Long> {
    @Query("SELECT r.rerunPredictCycle FROM RerunScheduler r " +
            "WHERE r.id = (SELECT MAX(r2.id) FROM RerunScheduler r2)")
    int findTopByOrderByIdDesc();
}
