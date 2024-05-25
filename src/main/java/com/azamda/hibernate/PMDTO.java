package com.azamda.hibernate;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class PMDTO {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name="auto",strategy = "increment")
    @GeneratedValue(generator="auto")
    private int pid;
    private String pname;
    
}
