package com.H2o.campagne_rejets_non_domestique.campagne_prelevement.element.parametre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParametreService {

    private final ParametreRepository parametreRepository;

    @Autowired
    public ParametreService(ParametreRepository parametreRepository) {
        this.parametreRepository = parametreRepository;
    }

    public List<Parametre> getAllParametre() {
        return parametreRepository.findAll();
    }

    public Parametre getParametreById(Long idParametre) {
        return parametreRepository.getReferenceById(idParametre);
    }

    public void addNewParametre(Parametre parametre) {
        parametreRepository.save(parametre);
    }
}
