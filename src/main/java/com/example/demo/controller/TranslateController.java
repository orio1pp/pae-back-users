package com.example.demo.controller;

import com.example.demo.DTOs.OptionsDTO;
import com.example.demo.DTOs.QuestionDTO;
import com.example.demo.DTOs.QuestionaryDTO;
import com.example.demo.service.TranslateService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TranslateController {
    private final TranslateService translateService;

    public TranslateController(TranslateService translateService) {
        this.translateService = translateService;
    }

    @PostMapping("save/translate/questionary")
    public void saveTranslationQuestionary(@RequestBody QuestionaryDTO questionaryDTO){

    }

    @PostMapping("save/translate/question")
    public void saveTranslationQuestion(@RequestBody QuestionDTO questionDTO){

    }

    @PostMapping("save/translate/option")
    public void saveTranslationOption(@RequestBody OptionsDTO optionsDTO){
        
    }



}
