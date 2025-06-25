package com.loharchive.lordlog.search;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/search")
    public SearchResultDto search(@RequestParam String keywords) {
        return searchService.searchService(keywords);

    }

    public SearchCharacterDetailDto searchDetail(@RequestParam int idx){
        return searchService.searchCharacterDetail(idx);
    }

}
