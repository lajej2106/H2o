package com.H2o.campagnerejetsnondomestique.campagneprelevement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampagnePrelevementRepository extends JpaRepository<CampagnePrelevement, Long> {

}
