package com.loharchive.lordlog.skills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SkillsRepository extends JpaRepository<Skills, Long> {
    @Query("SELECT s FROM Skills s " +
            "JOIN s.characters c " +
            "WHERE s.characters.id = :cid " +
            "ORDER BY " +
            "CASE s.type " +
            "WHEN com.loharchive.lordlog.common.enums.SkillType.AC THEN 1 " +
            "WHEN com.loharchive.lordlog.common.enums.SkillType.PS THEN 2 " +
            "WHEN com.loharchive.lordlog.common.enums.SkillType.CM THEN 3 " +
            "WHEN com.loharchive.lordlog.common.enums.SkillType.PO THEN 4 " +
            "ELSE 5 END, " +
            "s.slot ASC")
    List<Skills> findSkillsByCharacters_Id(Long cid);
}
