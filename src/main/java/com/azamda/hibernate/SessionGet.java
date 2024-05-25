package com.azamda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionGet {
    static Session getSession(){
        Configuration conf = new Configuration();
        conf.configure();//Configuration xml file getting read by Configuration class
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        return session;
    }
}
