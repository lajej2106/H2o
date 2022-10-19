package com.H2o.campagne_rejets_non_domestique.campagne_prelevement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampagnePrelevementService {

    private final CampagnePrelevementRepository campagnePrelevementRepository;

    @Autowired
    public CampagnePrelevementService(CampagnePrelevementRepository campagnePrelevementRepository) {
        this.campagnePrelevementRepository = campagnePrelevementRepository;
    }

    public List<CampagnePrelevement> getCampagneByEtablissement() {
        // TODO: faire le find par adresse
        return campagnePrelevementRepository.findAll();
    }

    public void addNewCampagnePrelevement(CampagnePrelevement campagnePrelevement) {
        campagnePrelevementRepository.save(campagnePrelevement);
    }
}
