package com.loharchive.lordlog.search;

import com.loharchive.lordlog.common.enums.SkillType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchSkillsDto {

    private String sname;
    @Enumerated(EnumType.STRING)
    private SkillType stype;
    private int slot;
    private int c_id;
}
