package com.loharchive.lordlog.rerun;

import com.loharchive.lordlog.search.SearchRerunDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class RerunController {


    private final RerunService rerunService;

    public RerunController(RerunService rerunService) {
        this.rerunService = rerunService;
    }

    @PostMapping("/rerunlist")
    public RerunCharacterResultDto rerunAll(@RequestBody RerunSearchRequestDto data){
        return rerunService.rerunCharacterSearch(data);
    }
}
