package com.epam.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

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

        Criteria criteria = session.createCriteria(Account.class);
        List<Account> accounts = criteria.list();
        System.out.println(accounts);
    }
}
