package com.loharchive.lordlog.artifacts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArtifactsRepository extends JpaRepository<Artifacts, Long> {
    @Query("SELECT a FROM Artifacts a " +
            "JOIN a.characters c " +
            "WHERE a.characters.id = :cid " +
            "ORDER BY " +
            "CASE a.type " +
            "WHEN com.loharchive.lordlog.common.enums.ArtifactType.NM THEN 1 " +
            "WHEN com.loharchive.lordlog.common.enums.ArtifactType.NB THEN 2 " +
            "WHEN com.loharchive.lordlog.common.enums.ArtifactType.RL THEN 3 " +
            "ELSE 4 END")
    List<Artifacts> findArtifactsByCharacters_Id(Long cid);
}
