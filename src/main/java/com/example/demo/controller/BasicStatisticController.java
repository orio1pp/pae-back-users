package com.example.demo.controller;

import com.example.demo.service.BasicSatisticService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;

@RestController
public class BasicStatisticController {

    private final BasicSatisticService basicSatisticService;

    public BasicStatisticController(BasicSatisticService basicSatisticService) {
        this.basicSatisticService = basicSatisticService;
    }

    @GetMapping("selected")
    public Option getTimesOptionSelected(@RequestParam long option_id){
        return basicSatisticService.getTimesOptionSelected(option_id);
    }

    @GetMapping("mostSelected")
    public Option getMostSelectedOptionFromQuestion(@RequestParam long question_id){
        return basicSatisticService.getMostSelectedOptionFromQuestion(question_id);
    }
}
