package com.loharchive.lordlog.characters;


import com.loharchive.lordlog.search.SearchCharacterDetailDto;
import com.loharchive.lordlog.search.SearchCharactersDto;
import com.loharchive.lordlog.search.SearchRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CharactersMapper {
    List<SearchCharactersDto> searchCharacter(SearchRequestDto searchRequestDto);

    SearchCharacterDetailDto searchCharacterDetail(int idx);

//    List<SearchRerunDto> rerunCharacterSearch(String keywords);
}
