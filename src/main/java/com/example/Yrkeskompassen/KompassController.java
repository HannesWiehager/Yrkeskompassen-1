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
    TraitsRepository traitsRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String start(HttpSession session) {
        List<Traits> traitsList = new ArrayList<>();
        session.setAttribute("traitsList", traitsList);
        return "redirect:/" + 1l;
    }
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
    public String next (@PathVariable Long id, Model model, @RequestParam boolean action, HttpSession session) {

        model.getAttribute("currentQuestion");

        session.getAttribute("question");
        session.getAttribute("traits");

        session.getAttribute("traitsList");

        if (action) {
            Questions test = (Questions) session.getAttribute("question");
            test.setAnswer(true);
            repository.save(test);

            //traitsRepository.save(test.getTraits());
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

            /*List<Traits> traitsSet = new ArrayList<>();

            Traits traitsTest = new Traits();
            traitsTest.setTrait(test.getTraits().getTrait());
            traitsTest.setTRAITSID(test.getTraits().getTRAITSID());
            traitsTest.setPoints(test.getTraits().getPoints());

            traitsSet.add(traitsTest);
            User test2 = new User();
            test2.setUserTraits(traitsSet);

            userRepository.save(test2);*/

        } else {
            System.out.println("false");
        }

        return "redirect:/" + (id + 1l);
    }



}
