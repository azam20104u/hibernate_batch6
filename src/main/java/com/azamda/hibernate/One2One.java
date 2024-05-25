package com.azamda.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class One2One {
    public static void main(String[] args) {
        Session session = SessionGet.getSession();
        Transaction beginTransaction = session.beginTransaction();

        CountryDTO country = new CountryDTO();
        country.setCname("India");

        PMDTO pmd = new PMDTO();
        pmd.setPname("Modi");

        country.setPmdto(pmd);

        session.persist(country);

        // CountryDTO countryDTO = session.get(CountryDTO.class, 1);
        // PMDTO pmdto = countryDTO.getPmdto();
        // System.out.println(countryDTO);
        // System.out.println(pmdto);
        // CountryDTO countryDTO = session.get(CountryDTO.class, 1);
        // session.remove(countryDTO);

        // CountryDTO countryDTO = session.get(CountryDTO.class, 1);
        // countryDTO.setCname("USA");
        // countryDTO.getPmdto().setPname("Baidan");
        // session.persist(countryDTO);
        beginTransaction.commit();
        System.out.println(" Country and PM has been persisted");
        session.close();
    }
}
