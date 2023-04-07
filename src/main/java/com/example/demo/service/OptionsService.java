package com.example.demo.service;

import com.example.demo.DTOs.OptionsDTO;
import com.example.demo.model.CheckBox;
import com.example.demo.model.Options;
import com.example.demo.model.RadioButton;
import com.example.demo.model.Text;
import com.example.demo.repository.CheckBoxRepository;
import com.example.demo.repository.RadioButtonRepository;
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

    public OptionsService(RadioButtonRepository radioButtonRepository, CheckBoxRepository checkBoxRepository, TextRepository textRepository) {
        this.radioButtonRepository = radioButtonRepository;
        this.checkBoxRepository = checkBoxRepository;
        this.textRepository = textRepository;
    }
    public List<Options> insertOptions(List<OptionsDTO> optionsList, String type) {
        List<Options> options = new ArrayList<Options>();
        for(OptionsDTO option : optionsList){
            switch (type){
                case CHECKBOX_TYPE:
                    CheckBox checkBox = new CheckBox(option.getText());
                    checkBoxRepository.save(checkBox);
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
            }
        }
        return options;
    }
}
