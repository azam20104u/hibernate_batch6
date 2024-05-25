package com.azamda.hibernate;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class CountryDTO {

    @Id
    // @GeneratedValue(strategy=GenerationType.IDENTITY)
    @GenericGenerator(name="auto",strategy = "increment")
    @GeneratedValue(generator="auto")
    private Integer cid;
    private String cname;

    @OneToOne(cascade = CascadeType.ALL)
    private PMDTO pmdto;
}
