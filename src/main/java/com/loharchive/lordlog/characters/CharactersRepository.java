package com.loharchive.lordlog.characters;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CharactersRepository extends JpaRepository<Characters, Long> {

    @Query("SELECT c, e.name, j.name FROM Characters c"+
            " left join Element e on c.element_id = e.id" +
            " left join Job j on c.job_id = j.id" +
            " left join fetch c.reruns" +
            " WHERE c.id = :id")

    List<Object[]> findCharactersDetailById(@Param("id") Long id);

}
