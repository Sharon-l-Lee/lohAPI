package com.loharchive.lordlog.characters;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class CharactersController {

    @Autowired
    private CharactersService charactersService;

    @GetMapping("/detail")
    public CharacterDetailDto getCharacterDetail(@RequestParam Long idx){
        return charactersService.detailCharacter(idx);
    }

}
