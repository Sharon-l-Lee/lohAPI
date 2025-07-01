package com.loharchive.lordlog.rerun;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RerunCycleSchedulerInsertDto {
    private int rerunCharaCount;
    private int rerunPredictCycle;

    public RerunScheduler toEntity(){
       return new RerunScheduler(rerunCharaCount, rerunPredictCycle);
    }


}
