/*package com.example.Yrkeskompassen;

import javax.persistence.*;
import java.util.List;


@Entity


public class Yrke {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long ID;

    private String yrkestitel;
    //@ManyToMany
    private List<Egenskaper> egenskaperList;

    public Yrke() {
    }

    public Yrke(String yrkestitel, List<Egenskaper> egenskaperList,Long ID) {
        this.yrkestitel = yrkestitel;
        this.egenskaperList = egenskaperList;
        this.ID = ID;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getYrkestitel() {
        return yrkestitel;
    }

    public void setYrkestitel(String yrkestitel) {
        this.yrkestitel = yrkestitel;
    }

    public List<Egenskaper> getEgenskaperList() {
        return egenskaperList;
    }

    public void setEgenskaperList(List<Egenskaper> egenskaperList) {
        this.egenskaperList = egenskaperList;
    }
}
*/