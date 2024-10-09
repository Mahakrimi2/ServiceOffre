package com.SAOP.tp2_Soap.controllers;

import com.SAOP.tp2_Soap.entities.Offre;
import com.SAOP.tp2_Soap.repositories.OffreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Offres")
public class RestOffres {

    @Autowired
    OffreRepo offreRepo;
    @GetMapping
    public List<Offre> getAll() {
        return offreRepo.findAll();
    }

    @GetMapping("/{code}")
    public Offre getbyid(@PathVariable Long code ) {

        return offreRepo.findById(code).get();
    }

    @PostMapping("/create")
    public ResponseEntity<String> saveoffre(@RequestBody Offre newoffre) {
        offreRepo.save(newoffre);
        return ResponseEntity.ok("Offre saved");
    }
    @DeleteMapping("/{code}")
    public ResponseEntity<String> deleteoffre(@PathVariable Long code) {
        offreRepo.deleteById(code);
        return ResponseEntity.ok("Offre deleted");
    }

}
