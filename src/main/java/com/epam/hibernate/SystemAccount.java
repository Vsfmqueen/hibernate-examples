package com.epam.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Vera_Sidarovich on 7/21/2014.
 */
@Entity
@Table(name = "system_account")
public class SystemAccount extends Account {
    @Id
    private Long id;
    private String owner;

    @Override
    public String toString() {
        return super.toString() + "SystemAccount{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                '}';
    }
}
