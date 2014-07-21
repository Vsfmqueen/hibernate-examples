package com.epam.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by Vera_Sidarovich on 7/21/2014.
 */
@MappedSuperclass
public abstract class Account implements Serializable {
    @Column(name = "login")
    private String login;

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                '}';
    }
}
