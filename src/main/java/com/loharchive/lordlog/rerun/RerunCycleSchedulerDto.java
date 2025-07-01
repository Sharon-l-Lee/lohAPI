package com.loharchive.lordlog.rerun;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RerunCycleSchedulerDto {
    private LocalDate rerun_start_date;
    private LocalDate rerun_end_date;
    private LocalDate prev_date;
    private int gap_day;
    private int count_gap;
}
