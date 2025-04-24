package com.loharchive.lordlog.artifacts;

import com.loharchive.lordlog.search.SearchArtifactsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ArtifactsMapper {
    List<SearchArtifactsDto> searchArtifacts(Map<String,Object> params);
}
