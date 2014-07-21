package com.epam.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by Vera_Sidarovich on 7/21/2014.
 */
public class Launcher {
    public static void main(String... args) {
        Configuration configuration = new Configuration();
        configuration.configure("hb-сonfig.xml");

        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
        Session session = sessionFactory.openSession();

        Account account = ((Account) session.get(UserAccount.class, new Long(1L)));
        System.out.println(account);


    }
}
