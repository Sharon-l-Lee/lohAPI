package com.loharchive.lordlog.skills;

import com.loharchive.lordlog.search.SearchRequestDto;
import com.loharchive.lordlog.search.SearchSkillsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkillsMapper {
    List<SearchSkillsDto> searchSkills(SearchRequestDto searchRequestDto);
}
