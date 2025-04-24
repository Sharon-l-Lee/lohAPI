package com.loharchive.lordlog.artifacts;

import com.loharchive.lordlog.search.SearchArtifactsDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ArtifactsController {
    private final ArtifactsService artifactsService;

    public ArtifactsController(ArtifactsService artifactsService){
        this.artifactsService = artifactsService;
    }

//    public List<SearchArtifactsDto> searchArtifacts(@Param keywords){
//
//    }
}
