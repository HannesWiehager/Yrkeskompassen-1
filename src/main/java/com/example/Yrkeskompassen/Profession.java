package com.example.Yrkeskompassen;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Profession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String title;

    private String TRAIT1;

    private String TRAIT2;

    private String DESCRIPTION;

    private int POINTS1;
    private int POINTS2;

    public Profession() {
    }

    public Profession(Long ID, String title, String TRAIT1, String TRAIT2, String DESCRIPTION, int POINTS1, int POINTS2) {
        this.ID = ID;
        this.title = title;
        this.TRAIT1 = TRAIT1;
        this.TRAIT2 = TRAIT2;
        this.DESCRIPTION = DESCRIPTION;
        this.POINTS1 = POINTS1;
        this.POINTS2 = POINTS2;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTRAIT1() {
        return TRAIT1;
    }

    public void setTRAIT1(String TRAIT1) {
        this.TRAIT1 = TRAIT1;
    }

    public String getTRAIT2() {
        return TRAIT2;
    }

    public void setTRAIT2(String TRAIT2) {
        this.TRAIT2 = TRAIT2;
    }

    public int getPOINTS1() {
        return POINTS1;
    }

    public void setPOINTS1(int POINTS1) {
        this.POINTS1 = POINTS1;
    }

    public int getPOINTS2() {
        return POINTS2;
    }

    public void setPOINTS2(int POINTS2) {
        this.POINTS2 = POINTS2;
    }
}
