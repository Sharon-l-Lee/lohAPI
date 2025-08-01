package com.loharchive.lordlog.rerun;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class RerunCharacterListDto {
    private Long id;
    private LocalDate rerun_start_date;
    private LocalDate rerun_end_date;
    private Long c_id;
    private String cname;
}
