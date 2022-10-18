package com.H2o.campagne_rejets_non_domestique.campagne_prelevement.element;

import com.H2o.campagne_rejets_non_domestique.campagne_prelevement.CampagnePrelevement;
import com.H2o.campagne_rejets_non_domestique.campagne_prelevement.element.parametre.Parametre;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Element")
@NoArgsConstructor
@Getter
@Setter
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parametre_id")
    private Parametre parametre;

    private Long resultat;
    private Long limiteQuantitative;
    boolean isCofrac;

}
