package com.loharchive.lordlog.search;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class SearchRerunDto {

    private Long id;
    private String cname;
    private String cname_en;
    private String element_name;
    private String job_name;
    private String img_url;
    private Date release_date;
    private Date rerun_start_date;
    private Date rerun_end_date;

}
