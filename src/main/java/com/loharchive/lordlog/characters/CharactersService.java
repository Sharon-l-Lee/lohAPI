package com.loharchive.lordlog.characters;

import com.loharchive.lordlog.search.SearchCharacterDetailDto;
import com.loharchive.lordlog.search.SearchCharactersDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class CharactersService {
    private final CharactersMapper charactersMapper;

    public CharactersService(CharactersMapper charactersMapper) {
        this.charactersMapper = charactersMapper;
    }

    public List<SearchCharactersDto> searchCharacter(String keyword) {
        Map<String, Object> params = new HashMap<>();
        log.debug("캐릭터 검색어: {}", keyword);
        String[] strArr = keyword.split("\\s");
        for(String s : strArr){
            log.debug("캐릭터 검색어 arr: {}", s);
            params.put("keywords", Arrays.asList(s));
        }
        return charactersMapper.searchCharacter(params);
    }


}
