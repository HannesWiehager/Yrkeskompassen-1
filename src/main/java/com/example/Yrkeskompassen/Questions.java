package com.example.Yrkeskompassen;

import javax.persistence.*;

@Entity

public class Questions {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long ID;
    private String question;
    private boolean answer;
    //@OneToOne
   // private List<Egenskaper> egenskapspoäng;

    public Questions() {
    }

    public Questions(Long ID, String question) {
        this.ID = ID;
        this.question = question;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
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
