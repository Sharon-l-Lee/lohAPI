package com.loharchive.lordlog.rerun;

import com.loharchive.lordlog.common.enums.AcquisitionMethodType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
public class RerunCharacterSearchDto {

    private Long id;
    private Long cid;
    private String cname;
    private String cname_en;
    @Enumerated(EnumType.STRING)
    private AcquisitionMethodType acquisition_method;
    private String element_name;
    private String job_name;
    private String img_url;
    private String cf_url;
    private LocalDate release_date;
    private LocalDate rerun_start_date;
    private LocalDate rerun_end_date;
}
