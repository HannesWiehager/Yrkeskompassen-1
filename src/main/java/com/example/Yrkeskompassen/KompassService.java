package com.example.Yrkeskompassen;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KompassService {

    public List<String> matchTraitsAndProfession(List<Profession> professionList, List<Traits> list1) {
        List<String> matchedList = new ArrayList<>();
        for (int i = 0; i < professionList.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(j).getTrait().equals(professionList.get(i).getTRAIT1()) && list1.get(j).getPoints() >= professionList.get(i).getPOINTS1()) {
                    for (int k = 0; k < list1.size(); k++) {
                        if (list1.get(k).getTrait().equals(professionList.get(i).getTRAIT2()) && list1.get(k).getPoints() >= professionList.get(i).getPOINTS2()) {
                            matchedList.add(professionList.get(i).getTitle());
                        }
                    }
                }
            }
        }
        return matchedList;
    }

    public List<Traits> addPointsOrNewTrait(List<Traits> list1, Questions test) {
        boolean isTrue= true;

        for (int i = 0; i < list1.size(); i++) {
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
        return list1;
    }
}

