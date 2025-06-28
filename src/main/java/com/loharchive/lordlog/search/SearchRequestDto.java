package com.loharchive.lordlog.search;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SearchRequestDto {
    private List<String> keywords = new ArrayList<>();
    private List<Integer> elements;
    private List<Integer> jobs;
    private List<String> acquisitions;
    private List<String> summons;
}
