package com.loharchive.lordlog.rerun;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class RerunSearchRequestDto {
    private String keyword;
    private List<Integer> elements;
    private List<Integer> jobs;
    private List<String> acquisitions;
    private boolean summonTypeFilter;
}
