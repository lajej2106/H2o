package com.H2o.campagne_rejets_non_domestique.campagne_prelevement.element.parametre;

import com.H2o.enumeration.Unite;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Parametre")
@NoArgsConstructor
@Getter
@Setter
public class Parametre {

    @Id
    @SequenceGenerator(name = "parametre_sequence",
            sequenceName = "parametre_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "parametre_sequence"
    )
    private Long id;

    private String nom;
    private Enum<Unite> unite;
    private String description;
}
