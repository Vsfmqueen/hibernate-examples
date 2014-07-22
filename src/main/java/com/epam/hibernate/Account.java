package com.epam.hibernate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Vera_Sidarovich on 7/21/2014.
 */
@Entity(name = "account")
@DiscriminatorColumn(name = "account_type", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Account implements Serializable {
    @Id
    private Long id;
    @Column(name = "login")
    private String login;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
