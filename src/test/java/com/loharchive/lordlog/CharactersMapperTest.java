package com.loharchive.lordlog;


import com.loharchive.lordlog.characters.CharactersMapper;
import com.loharchive.lordlog.search.SearchCharactersDto;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.*;


@SpringBootTest
@MapperScan("com.archive.lordlog.characters")
@ActiveProfiles("test")
public class CharactersMapperTest {

    @Autowired
    CharactersMapper charactersMapper;

    @Test
    void characterTest(){

        String keyword = "나인 가디언";
        Map<String, Object> params = new HashMap<>();
        String[] strArr = keyword.split("\\s");
        for(String s : strArr){
            params.put("keywords", Arrays.asList(s));
        }
        List<SearchCharactersDto> result = charactersMapper.searchCharacter(params);
        assertThat(result).isNotEmpty();
        result.forEach(System.out::println);

    }
}
