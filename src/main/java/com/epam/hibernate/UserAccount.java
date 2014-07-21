package com.epam.hibernate;

import javax.persistence.*;

/**
 * Created by Vera_Sidarovich on 7/21/2014.
 */
@Entity
@Table(name = "user_account")
@AttributeOverride(name = "login", column = @Column(name = "user_name"))
public class UserAccount extends Account {
    @Id
    private Long id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return super.toString() + "UserAccount{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
