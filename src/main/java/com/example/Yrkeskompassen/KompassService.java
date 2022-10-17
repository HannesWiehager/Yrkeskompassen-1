package com.example.Yrkeskompassen;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KompassService {

    public List<Profession> matchTraitsAndProfession(List<Profession> professionList, List<Traits> list1) {
        List<Profession> matchedList = new ArrayList<>();
        for (Profession profession : professionList) {
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(j).getTrait().equals(profession.getTRAIT1()) && list1.get(j).getPoints() >= profession.getPOINTS1()) {
                    for (Traits traits : list1) {
                        if (traits.getTrait().equals(profession.getTRAIT2()) && traits.getPoints() >= profession.getPOINTS2()) {
                            matchedList.add(profession);
                        }
                    }
                }
            }
        }
        return matchedList;
    }

    public List<Traits> addPointsOrNewTrait(List<Traits> list1, Questions test) {
        boolean isTrue= true;

        for (Traits traits : list1) {
            if (traits.getTrait().equals(test.getTraits().getTrait())) {
                traits.setPoints(traits.getPoints() + 1);
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

