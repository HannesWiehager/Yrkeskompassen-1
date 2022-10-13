package com.example.Yrkeskompassen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class KompassController {
    @Autowired
    QuestionRepository repository;
    @Autowired
    ProfessionRepository professionRepository;

    @Autowired
    KompassService service;


    @GetMapping("/")
    public String home(HttpSession session) {
        List<Traits> traitsList = new ArrayList<>();
        session.setAttribute("traitsList", traitsList);
        return "home";
    }
    @GetMapping("/start")
    public String start(HttpSession session) {
        List<Traits> traitsList = new ArrayList<>();
        session.setAttribute("traitsList", traitsList);
        return "redirect:/" + 1l;
    }
    @GetMapping("/{id}")
    public String current (@PathVariable Long id, Model model, HttpSession session){

        Questions question = repository.findById(id).get();

        List<Questions> q = (List)repository.findAll();

        model.addAttribute("questionSize", q.size());

        model.addAttribute("currentQuestion", id);

        session.setAttribute("question", question);

        List<Traits> traits = new ArrayList<>();
        session.setAttribute("traits", traits);

        return "Start";

    }

    @PostMapping("/{id}")
    public String next (@PathVariable Long id, Model model, @RequestParam boolean action, HttpSession session) {

        model.getAttribute("currentQuestion");

        session.getAttribute("question");
        session.getAttribute("traits");

        session.getAttribute("traitsList");
        List <Traits> traitsList = (List)session.getAttribute("traitsList");

        if (action) {
            Questions currentQuestion = (Questions) session.getAttribute("question");
            currentQuestion.setAnswer(true);
            repository.save(currentQuestion);

            traitsList = service.addPointsOrNewTrait(traitsList, currentQuestion);
        }

        List<String> matchedList = new ArrayList<>();

        if (id == 10) {
            // kolla traitsList mot professionRepo
            List<Profession> professionList =(List)professionRepository.findAll();

            matchedList = service.matchTraitsAndProfession(professionList, traitsList);

            model.addAttribute("matchedList", matchedList);
            return "result";
        }

        return "redirect:/" + (id + 1l);
    }

    @GetMapping("/result")
    public String resultPage(Model model, HttpSession session) {
        model.getAttribute("matchedList");
        session.getAttribute("traitsList");

        return "result";
    }
}
