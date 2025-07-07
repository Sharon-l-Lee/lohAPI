package com.loharchive.lordlog.search;

import com.loharchive.lordlog.common.enums.SkillType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchSkillsDto {

    private Long sid;
    private String sname;
    @Enumerated(EnumType.STRING)
    private SkillType stype;
    private String s_desc;
    private String img_url;
    private String cf_url;
    private int slot;
    private Long c_id;
    private String cname;
}
