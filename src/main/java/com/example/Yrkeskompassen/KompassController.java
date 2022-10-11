package com.example.Yrkeskompassen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class KompassController {
    @Autowired
    QuestionRepository repository;

    @GetMapping("/")
    public String Start (Model model){

        List<Questions> questionList = (List)repository.findAll();
        model.addAttribute("questionList",questionList);
        return "Start";

    }


}
