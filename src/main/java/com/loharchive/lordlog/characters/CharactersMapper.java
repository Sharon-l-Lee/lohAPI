package com.loharchive.lordlog.characters;


import com.loharchive.lordlog.search.SearchCharacterDetailDto;
import com.loharchive.lordlog.search.SearchCharactersDto;
import com.loharchive.lordlog.search.SearchRerunDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CharactersMapper {
    List<SearchCharactersDto> searchCharacter(Map<String, Object> keywords);

    SearchCharacterDetailDto searchCharacterDetail(int idx);

    List<SearchRerunDto> rerunCharacterList(String keywords);
}
