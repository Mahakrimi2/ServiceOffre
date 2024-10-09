package com.SAOP.tp2_Soap.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  code ;
    private String intitulé;
    private String spécialité;
    private String société;
    private int nbpostes;
    private String pays;




    public Offre(String intitulé, String spécialité, String société, int nbpostes, String pays) {
        this.intitulé = intitulé;
        this.spécialité=spécialité;
        this.société=société;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }

}
