package com.example.Yrkeskompassen;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity

public class Traits {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long TRAITSID;
    private String trait;
    @Transient
    private int points;

    @OneToMany (mappedBy="traits", cascade = CascadeType.ALL)
    private List<Questions> questionsList = new ArrayList<>();

    public Traits() {
    }

    public Traits(Long TRAITSID, String trait, int points) {
        this.TRAITSID = TRAITSID;
        this.trait = trait;
        this.points = points;
    }

    public Long getTRAITSID() {
        return TRAITSID;
    }

    public void setTRAITSID(Long TRAITSID) {
        this.TRAITSID = TRAITSID;
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<Questions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Questions> questionsList) {
        this.questionsList = questionsList;
    }


    /* public List<Yrke> getYrkeList() {
        return yrkeList;
    }

    public void setYrkeList(List<Yrke> yrkeList) {
        this.yrkeList = yrkeList;
    }

public enum Egenskaper {

        EXTROVERT,
        INTROVERT,
        LAGSPELARE,
        SJÄLVSTÄNDIG,
        NYFIKENHET,
        NOGGRANNHET,
        FLEXIBEL,

*/
}
