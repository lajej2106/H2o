package com.H2o.campagnerejetsnondomestique.element;

import com.H2o.campagnerejetsnondomestique.parametre.Parametre;
import com.H2o.enumeration.Unite;
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
    @SequenceGenerator(name = "element_sequence",
            sequenceName = "element_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "element_sequence"
    )

    Long id;
    @ManyToOne
    @JoinColumn(name = "parametre_id")
    Parametre parametre;
    Long resultat;
    Long limiteQuantitative;
    boolean isCofrac;

}
