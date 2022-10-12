package com.example.Yrkeskompassen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class KompassController {
    @Autowired
    QuestionRepository repository;
    @Autowired
    UserRepository userRepository;

    /*@GetMapping("/")
    public String start(HttpSession session) {
        session.setAttribute("counter", 1);
        return "redirect:/current";
    }*/
    @GetMapping("/{id}")
    public String current (@PathVariable Long id, Model model, HttpSession session){

        //List<Questions> questionList = (List)repository.findAll();
        //model.addAttribute("questionList",questionList);

        //int counter = (Integer) session.getAttribute("counter");
        Questions question = repository.findById(id).get();

        model.addAttribute("currentQuestion", id);


        session.setAttribute("question", question);

        List<Traits> traits = new ArrayList<>();
        session.setAttribute("traits", traits);

        return "Start";

    }

    /*@GetMapping("/increment")
    public String increment(HttpSession session) {
        session.setAttribute("counter", ((Integer) session.getAttribute("counter")) + 1);
        System.out.println(session.getAttribute("counter"));
        return "redirect:/current";
    }*/
    @PostMapping("/{id}")
    public String next (Model model, @RequestParam boolean action, HttpSession session) {

        model.getAttribute("currentQuestion");
        session.getAttribute("question");
        session.getAttribute("traits");

        if (action){
            System.out.println("true");
            Questions test = (Questions)session.getAttribute("question");
            test.setAnswer(true);
            repository.save(test);
        }else{
            System.out.println("false");
        }

        return "Start";
    }



}
