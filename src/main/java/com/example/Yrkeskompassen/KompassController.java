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

    @GetMapping("/")
    public String start(HttpSession session) {
        List<Traits> traitsList = new ArrayList<>();
        session.setAttribute("traitsList", traitsList);
        return "redirect:/" + 1l;
    }
    @GetMapping("/{id}")
    public String current (@PathVariable Long id, Model model, HttpSession session){

        Questions question = repository.findById(id).get();

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

        if (action) {
            Questions test = (Questions) session.getAttribute("question");
            test.setAnswer(true);
            repository.save(test);

            List <Traits> list1 = (List)session.getAttribute("traitsList");

            boolean isTrue= true;

            for (int i =0; i < list1.size(); i++) {
                if (list1.get(i).getTrait().equals(test.getTraits().getTrait())) {
                    list1.get(i).setPoints(list1.get(i).getPoints() + 1);
                    isTrue = false;
                }
            }

            if (isTrue) {
                Traits traitTest = new Traits();
                traitTest.setTrait(test.getTraits().getTrait());
                traitTest.setPoints(1);
                list1.add(traitTest);
            }

            for (int i =0; i < list1.size(); i++) {
                System.out.println(list1.get(i).getTrait() + list1.get(i).getPoints());
            }
        }

        if (id == 5) {
            // kolla traitsList mot professionRepo
            return "test";
        }
        return "redirect:/" + (id + 1l);
    }
}
