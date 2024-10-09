package com.SAOP.tp2_Soap.repositories;

import com.SAOP.tp2_Soap.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffreRepo extends JpaRepository<Offre,Long> {
}
