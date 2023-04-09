package com.example.demo.service;

import com.example.demo.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.demo.Utils.ConstantsUtils.*;

@Service
public class BasicSatisticService {
    private final AnswerService answerService;
    private final QuestionService questionService;

    public BasicSatisticService(AnswerService answerService, QuestionService questionService) {
        this.answerService = answerService;
        this.questionService = questionService;
    }
    public int getTimesOptionSelected(String answer) {
        return getNumTimesOptionSelected(answer);
    }

    public Options getMostSelectedOptionFromQuestion(Long question_id) {
        Question question = questionService.getQuestionById(question_id);
        List<Options> optionsList = question.getOptionsList();
        return getMostSelectedOption(optionsList, question.getType());
    }

    private Options getMostSelectedOption(List<Options>optionsList, String type){
        int total = 0;
        Options finalOption = new Options();
        for(Options option: optionsList){
            int timesOptionSelected = getNumTimes(type, option);
            if(timesOptionSelected>total){
                total = timesOptionSelected;
                finalOption = option;
            }
        }
        return finalOption;
    }
    private int getNumTimes(String type, Options option){
        switch (type){
            case CHECKBOX_TYPE:
                return getNumTimesCheckBox((CheckBox) option);
            case TEXT_TYPE:
                return 0;
            case RADIOBUTTON_TYPE:
                return getNumTimesCheckRadio((RadioButton) option);
            case SPINNER_TYPE:
                return getNumTimesCheckSpinner((Spinner) option);
        }
        return 0;
    }

    private int getNumTimesCheckBox(CheckBox checkBox){
        return getTimesOptionSelected(checkBox.getOptions());
    }

    private int getNumTimesCheckRadio(RadioButton radioButton){
        return getTimesOptionSelected(radioButton.getOptions());
    }

    private int getNumTimesCheckSpinner(Spinner spinner){
        return getTimesOptionSelected(spinner.getOptions());
    }

    private int getNumTimesOptionSelected(String answer){
        return answerService.getTimesOptionSelected(answer);
    }

}
