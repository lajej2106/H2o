package com.H2o.campagne_rejets_non_domestique.campagne_prelevement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "v1/campagne")
public class CampagnePrelevementRest {

    private final CampagnePrelevementService campagnePrelevementService;

    @Autowired
    public CampagnePrelevementRest(CampagnePrelevementService campagnePrelevementService) {
        this.campagnePrelevementService = campagnePrelevementService;
    }

    @GetMapping
    public List<CampagnePrelevement> getCampagneByAdresse() {
        return  campagnePrelevementService.getCampagneByEtablissement();
    }

    @PostMapping
    public void addNewCampagnePrelevement(@RequestBody CampagnePrelevement campagnePrelevement) {
        campagnePrelevementService.addNewCampagnePrelevement(campagnePrelevement);
    }
}
