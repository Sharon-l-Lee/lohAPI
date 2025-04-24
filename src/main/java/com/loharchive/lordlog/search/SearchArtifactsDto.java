package com.loharchive.lordlog.search;

import com.loharchive.lordlog.common.enums.ArtifactType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchArtifactsDto {

    private String aname;
    @Enumerated(EnumType.STRING)
    private ArtifactType atype;
    private int c_id;
}
