/*package com.example.Yrkeskompassen;

import javax.persistence.*;
import java.util.List;

@Entity

public class Egenskaper {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long ID;
    private String egenskap;
    private int poäng;

    //@ManyToMany
    private List<Yrke> yrkeList;

    public Egenskaper() {
    }

    public Egenskaper(Long ID, String egenskap, int poäng, List<Yrke> yrkeList) {
        this.ID = ID;
        this.egenskap = egenskap;
        this.poäng = poäng;
        this.yrkeList = yrkeList;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getEgenskap() {
        return egenskap;
    }

    public void setEgenskap(String egenskap) {
        this.egenskap = egenskap;
    }

    public int getPoäng() {
        return poäng;
    }

    public void setPoäng(int poäng) {
        this.poäng = poäng;
    }

    public List<Yrke> getYrkeList() {
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


}
*/