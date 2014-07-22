package com.epam.hibernate;

import javax.persistence.*;

/**
 * Created by Vera_Sidarovich on 7/21/2014.
 */
@Entity
@DiscriminatorValue("user")
public class UserAccount extends Account {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return super.toString() + "UserAccount{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
