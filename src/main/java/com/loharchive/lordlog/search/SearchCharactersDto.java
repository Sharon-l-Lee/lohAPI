package com.loharchive.lordlog.search;


import com.loharchive.lordlog.common.enums.AcquisitionMethodType;
import com.loharchive.lordlog.common.enums.SummonType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SearchCharactersDto {

    private Long id;
    private String cname;
    private String cname_en;
    private Long element_id;
    private String element_name;
    private Long job_id;
    private String job_name;
    private String img_url;
    private String cf_url;
    private Date release_date;
    private Long age;
    private Long height;
    @Enumerated(EnumType.STRING)
    private AcquisitionMethodType acquisition_method;
    @Enumerated(EnumType.STRING)
    private SummonType summon_type;
}
