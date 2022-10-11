package com.example.Yrkeskompassen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class KompassController {
    @Autowired
    QuestionRepository repository;

    @GetMapping("/")
    public String Start (Model model, HttpSession session){

        //List<Questions> questionList = (List)repository.findAll();
        //model.addAttribute("questionList",questionList);
        Long nextQuestion =0l;
        nextQuestion +=1l;
        Questions question = repository.findById(nextQuestion).get();
        session.setAttribute("question", question);
        List<Traits> traits = new ArrayList<>();
        session.setAttribute("traits", traits);
        return "Start";

    }
    @PostMapping("/")
    public String next (Model model, @RequestParam boolean action, HttpSession session) {
        session.getAttribute("question");
        session.getAttribute("traits");
        if (action){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        return "Start";
    }



}
