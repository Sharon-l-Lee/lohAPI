package com.loharchive.lordlog.rerun;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Slf4j
@RequiredArgsConstructor
public class RerunCharacterDetailDto {

    private Long id;
    private LocalDate rerun_start_date;
    private LocalDate rerun_end_date;

    public RerunCharacterDetailDto(Long id, LocalDate rerun_start_date, LocalDate rerun_end_date) {
        this.id = id;
        this.rerun_start_date = rerun_start_date;
        this.rerun_end_date = rerun_end_date;
    }

    public static RerunCharacterDetailDto fromEntity(Rerun rerun) {
        return new RerunCharacterDetailDto(rerun.getId(), rerun.getRerun_start_date(),rerun.getRerun_end_date());
    }

}
