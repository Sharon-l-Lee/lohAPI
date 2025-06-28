package com.loharchive.lordlog.search;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping("/search")
    public SearchResultDto search(@RequestBody SearchRequestDto searchRequestDto) {
        return searchService.searchService(searchRequestDto);

    }

    public SearchCharacterDetailDto searchDetail(@RequestParam int idx){
        return searchService.searchCharacterDetail(idx);
    }

}
