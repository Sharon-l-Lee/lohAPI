package com.loharchive.lordlog.search;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SearchCharactersDto {

    private Long id;
    private String cname;
    private Long element_id;
    private String element_name;
    private Long job_id;
    private String job_name;
    private String img_url;
    private Date release_date;
}
