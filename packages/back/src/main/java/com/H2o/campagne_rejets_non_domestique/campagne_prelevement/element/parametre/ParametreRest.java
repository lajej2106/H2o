package com.H2o.campagne_rejets_non_domestique.campagne_prelevement.element.parametre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "v1/parametre")
public class ParametreRest {

    private final ParametreService parametreService;

    @Autowired
    public ParametreRest(ParametreService parametreService) {
        this.parametreService = parametreService;
    }

    @GetMapping
    public List<Parametre> getAllParametre() {
        return parametreService.getAllParametre();
    }

    /*@GetMapping
    public Parametre getParametreById(@RequestAttribute Long parametreID) {
        return parametreService.getParametreById(parametreID);
    }*/


    @PostMapping
    public void addNewParametreService(@RequestBody Parametre parametre) {
        parametreService.addNewParametre(parametre);
    }
}
