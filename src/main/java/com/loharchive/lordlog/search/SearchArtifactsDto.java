package com.loharchive.lordlog.search;

import com.loharchive.lordlog.common.enums.ArtifactType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchArtifactsDto {

    private Long aid;
    private String aname;
    @Enumerated(EnumType.STRING)
    private ArtifactType atype;
    private String a_desc;
    private String img_url;
    private String cf_url;
    private Long c_id;
    private String cname;
}
