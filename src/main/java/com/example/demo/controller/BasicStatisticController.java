package com.example.demo.controller;

import com.example.demo.model.Options;
import com.example.demo.service.BasicSatisticService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicStatisticController {

    private final BasicSatisticService basicSatisticService;

    public BasicStatisticController(BasicSatisticService basicSatisticService) {
        this.basicSatisticService = basicSatisticService;
    }

    @GetMapping("selected")
    public int getTimesOptionSelected(@RequestParam String answer){
        return basicSatisticService.getTimesOptionSelected(answer);
    }

    @GetMapping("mostSelected")
    public Options getMostSelectedOptionFromQuestion(@RequestParam Long question_id){
        return basicSatisticService.getMostSelectedOptionFromQuestion(question_id);
    }
}
