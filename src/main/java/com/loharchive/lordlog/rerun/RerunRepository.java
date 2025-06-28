package com.loharchive.lordlog.rerun;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RerunRepository extends JpaRepository<Rerun,Long> {
    int countBy();
}
