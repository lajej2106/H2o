package com.H2o.campagne_rejets_non_domestique.campagne_prelevement.element.parametre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametreRepository extends JpaRepository<Parametre, Long> {

}
