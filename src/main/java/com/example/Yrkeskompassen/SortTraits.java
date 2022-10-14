package com.example.Yrkeskompassen;

import java.util.Comparator;

public class SortTraits implements Comparator<Traits> {

    public int compare(Traits a, Traits b) {
        return a.getPoints() - b.getPoints();
    }
}
