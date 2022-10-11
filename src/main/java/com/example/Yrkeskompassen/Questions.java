package com.example.Yrkeskompassen;

import javax.persistence.*;

@Entity

public class Questions {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long QUESTIONSID;
    private String question;
    private boolean answer;
    @ManyToOne
   private Traits traits;

    public Questions() {
    }

    public Questions(Long QUESTIONSID, String question, boolean answer) {
        this.QUESTIONSID = QUESTIONSID;
        this.question = question;
        this.answer = answer;
    }

    public Long getQUESTIONSID() {
        return QUESTIONSID;
    }

    public void setQUESTIONSID(Long QUESTIONSID) {
        this.QUESTIONSID = QUESTIONSID;
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
