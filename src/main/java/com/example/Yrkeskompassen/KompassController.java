package com.example.Yrkeskompassen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.*;


@Controller
public class KompassController {
    @Autowired
    QuestionRepository repository;
    @Autowired
    ProfessionRepository professionRepository;

    @Autowired
    KompassService service;


    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/start")
    public String start(HttpSession session) {
        List<Questions> q = (List)repository.findAll();
        List<Traits> traitsList = new ArrayList<>();
        session.setAttribute("traitsList", traitsList);

        Boolean[] booleanList = new Boolean[q.size()];
        session.setAttribute("booleanList", booleanList);

        return "redirect:/question/" + 1l;
    }
    @GetMapping("/question/{id}")
    public String current (@PathVariable Long id, Model model, HttpSession session){

        Questions question = repository.findById(id).get();

        List<Questions> q = (List)repository.findAll();


        model.addAttribute("questionSize", q.size());

        model.addAttribute("currentQuestion", id);

        session.setAttribute("question", question);


        return "Start";

    }

    @PostMapping("/result/{id}")
    public String next (@PathVariable Long id, Model model, @RequestParam (required = false) Boolean action, HttpSession session) {
        if (action == null){
            return "redirect:/question/" + (id);
        }
        model.getAttribute("currentQuestion");

        session.getAttribute("question");

        session.getAttribute("traitsList");

        session.getAttribute("booleanList");

        List <Traits> traitsList = (List)session.getAttribute("traitsList");
        List<Questions> qs = (List)repository.findAll();
        Boolean[] booleanList = (Boolean[]) session.getAttribute("booleanList");

        if (action) {
         //   Questions currentQuestion = (Questions) session.getAttribute("question");
           // repository.save(currentQuestion);

           // traitsList = service.addPointsOrNewTrait(traitsList, currentQuestion);

            booleanList[(int) (id-1)]=true;
        }else {
            booleanList[(int) (id-1)]=false;
        }

        List<Profession> matchedList = new ArrayList<>();

        if (id == qs.size()) {
            // kolla traitsList mot professionRepo
            List<Profession> professionList =(List)professionRepository.findAll();

            for (int i = 0; i < booleanList.length; i++) {
                if (booleanList[i]){
                    traitsList = service.addPointsOrNewTrait(traitsList, qs.get(i));

                }

            }

            Collections.sort(traitsList, new SortTraits().reversed());
            matchedList = service.matchTraitsAndProfession(professionList, traitsList);
            model.addAttribute("matchedList", matchedList);

            return "result";
        }



        return "redirect:/question/" + (id + 1l);
    }

    @GetMapping("/result/{id}")
    public String resultPage(Model model, HttpSession session, Long id) {
        model.getAttribute("matchedList");
        session.getAttribute("traitsList");

        return "result";
    }
}
