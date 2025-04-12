package com.loharchive.lordlog.search;

import com.loharchive.lordlog.common.enums.ArtifactType;
import com.loharchive.lordlog.common.enums.SkillType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

public class SearchResultDto {
    //캐릭터 정보
    private Long id;
    private String cname;
    private Long element_id;
    private Long job_id;
    private String img_url;

    //아티팩트 정보
    private String aname;
    @Enumerated(EnumType.STRING)
    private ArtifactType atype;

    //스킬 정보
    private String sname;
    @Enumerated(EnumType.STRING)
    private SkillType stype;
    private int slot;

}
