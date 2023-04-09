package com.example.demo.service;

import com.example.demo.DTOs.OptionsDTO;
import com.example.demo.model.*;
import com.example.demo.repository.CheckBoxRepository;
import com.example.demo.repository.RadioButtonRepository;
import com.example.demo.repository.SpinnerRepository;
import com.example.demo.repository.TextRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.demo.Utils.ConstantsUtils.*;

@Service
public class OptionsService {
    private final RadioButtonRepository radioButtonRepository;
    private final CheckBoxRepository checkBoxRepository;

    private final TextRepository textRepository;

    private final SpinnerRepository spinnerRepository;

    public OptionsService(RadioButtonRepository radioButtonRepository, CheckBoxRepository checkBoxRepository, TextRepository textRepository, SpinnerRepository spinnerRepository) {
        this.radioButtonRepository = radioButtonRepository;
        this.checkBoxRepository = checkBoxRepository;
        this.textRepository = textRepository;
        this.spinnerRepository = spinnerRepository;
    }
    public List<Options> insertOptions(List<OptionsDTO> optionsList, String type) {
        List<Options> options = new ArrayList<Options>();
        for(OptionsDTO option : optionsList){
            switch (type){
                case CHECKBOX_TYPE:
                    CheckBox checkBox = new CheckBox(option.getText());
                    options.add(checkBox);
                    break;
                case RADIOBUTTON_TYPE:
                    RadioButton radioButton = new RadioButton(option.getText());
                    options.add(radioButton);
                    break;
                case TEXT_TYPE:
                    Text text = new Text();
                    options.add(text);
                    break;
                case SPINNER_TYPE:
                    Spinner spinner = new Spinner();
                    options.add(spinner);
                    break;
            }
        }
        return options;
    }
}
