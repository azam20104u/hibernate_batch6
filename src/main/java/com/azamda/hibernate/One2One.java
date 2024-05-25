package com.azamda.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class One2One {
    public static void main(String[] args) {
        Session session = SessionGet.getSession();
        Transaction beginTransaction = session.beginTransaction();

        // CountryDTO country = new CountryDTO();
        // country.setCname("India");

        // PMDTO pmd = new PMDTO();
        // pmd.setPname("Modi");

        // country.setPmdto(pmd);

        // session.persist(country);

        
        beginTransaction.commit();
        System.out.println(" Country and PM has been persisted");
        session.close();
    }
}
