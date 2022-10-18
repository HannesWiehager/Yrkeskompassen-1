package com.example.Yrkeskompassen;

import javax.persistence.*;

@Entity

public class Questions {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long QUESTIONSID;
    private String question;
    @ManyToOne
   private Traits traits;

    public Questions() {
    }

    public Questions(Long QUESTIONSID, String question) {
        this.QUESTIONSID = QUESTIONSID;
        this.question = question;
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
}
