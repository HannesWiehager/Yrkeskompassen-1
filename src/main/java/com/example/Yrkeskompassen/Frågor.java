package com.example.Yrkeskompassen;

import javax.persistence.*;
import java.util.List;
@Entity

public class Frågor {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long ID;
    private String fråga;
    //@OneToOne
   // private List<Egenskaper> egenskapspoäng;

    public Frågor() {
    }

    public Frågor(Long ID, String fråga) {
        this.ID = ID;
        this.fråga = fråga;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFråga() {
        return fråga;
    }

    public void setFråga(String fråga) {
        this.fråga = fråga;
    }

  /*  public List<Egenskaper> getEgenskapspoäng() {
        return egenskapspoäng;
    }

    public void setEgenskapspoäng(List<Egenskaper> egenskapspoäng) {
        this.egenskapspoäng = egenskapspoäng;

    }
    public Frågor(Long ID, String fråga, List<Egenskaper> egenskapspoäng) {
        this.ID = ID;
        this.fråga = fråga;
        this.egenskapspoäng = egenskapspoäng;
    }*/
}
