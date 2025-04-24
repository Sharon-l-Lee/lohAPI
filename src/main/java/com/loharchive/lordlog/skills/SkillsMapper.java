package com.loharchive.lordlog.skills;

import com.loharchive.lordlog.search.SearchSkillsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SkillsMapper {
    List<SearchSkillsDto> searchSkills(Map<String, Object> params);
}
