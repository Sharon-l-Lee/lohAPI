package com.loharchive.lordlog.artifacts;

import com.loharchive.lordlog.search.SearchArtifactsDto;
import com.loharchive.lordlog.search.SearchRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArtifactsMapper {
    List<SearchArtifactsDto> searchArtifacts(SearchRequestDto searchRequestDto);
}
