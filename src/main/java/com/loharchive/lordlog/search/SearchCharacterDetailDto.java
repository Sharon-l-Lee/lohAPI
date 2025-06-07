package com.loharchive.lordlog.search;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SearchCharacterDetailDto {
    private Long id;
    private String cname;
    private String cname_en;
    private Long element_id;
    private String element_name;
    private Long job_id;
    private String job_name;
    private String img_url;
    private Date release_date;
    private Date birth;
    private String voice;
    private Long age;
    private Long height;
    private String important_value;
    private String favorite_food;

}
