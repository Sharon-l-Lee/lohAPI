package com.loharchive.lordlog.rerun;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface RerunMapper {

    List<RerunCharacterSearchDto> rerunCharacterSearch(RerunSearchRequestDto data);
    List<RerunCharacterListDto> charactersRerunList(String keywords);
    List<RerunCharacterListDto> rerunListById(@Param("idx") List<Long> id);
}
