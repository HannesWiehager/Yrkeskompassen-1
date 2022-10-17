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

    public Traits getTraits() {
        return traits;
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

}
