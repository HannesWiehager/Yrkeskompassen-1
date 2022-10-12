package com.example.Yrkeskompassen;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long USER_ID;

    @ManyToMany (mappedBy = "users")
    List<Traits> userTraits;

    public User() {
    }

    public User(List<Traits> userTraits) {

        this.userTraits = userTraits;
    }

    public Long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public List<Traits> getUserTraits() {
        return userTraits;
    }

    public void setUserTraits(List<Traits> userTraits) {
        this.userTraits = userTraits;
    }
}