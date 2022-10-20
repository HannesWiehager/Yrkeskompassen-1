package com.example.Yrkeskompassen;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class KompassService {

    public List<Profession> matchTraitsAndProfession(List<Profession> professionList, List<Traits> traitsList) {
        List<Profession> matchedList = new ArrayList<>();
        for (Profession profession : professionList) {
            for (int j = 0; j < traitsList.size(); j++) {
                if (traitsList.get(j).getTrait().equals(profession.getTRAIT1()) && traitsList.get(j).getPoints() >= profession.getPOINTS1()) {
                    for (Traits traits : traitsList) {
                        if (traits.getTrait().equals(profession.getTRAIT2()) && traits.getPoints() >= profession.getPOINTS2()) {
                            matchedList.add(profession);
                        }
                    }
                }
            }
        }
        return matchedList;
    }

    public List<Traits> addPointsOrNewTrait(List<Traits> traitsList, Questions question) {
        boolean isTrue = true;

        for (Traits traits : traitsList) {
            if (traits.getTrait().equals(question.getTraits().getTrait())) {
                traits.setPoints(traits.getPoints() + 1);
                isTrue = false;
            }
        }

        if (isTrue) {
            Traits traitTest = new Traits();
            traitTest.setTrait(question.getTraits().getTrait());
            traitTest.setPoints(1);
            traitsList.add(traitTest);
        }
        return traitsList;
    }

    public List<Traits> traitsFromMatchedProfessions (List<Traits> traitsList, List<Profession> professionList){
        Set<Traits> traitsSet = new HashSet<>();
        for(Traits t : traitsList) {
            for(Profession p: professionList) {
                   if(t.getTrait().equals(p.getTRAIT1()) || (t.getTrait().equals(p.getTRAIT2()))) {
                         traitsSet.add(t);
                }
            }
        }
        List<Traits> matchedTraits = new ArrayList<>(traitsSet);

        Collections.sort(matchedTraits, new SortTraits().reversed());
        return matchedTraits;
    }
}

