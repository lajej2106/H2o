package com.H2o.organisation.etablissement;

import com.H2o.organisation.etablissement.adresse.Adresse;
import com.H2o.organisation.organisation.Organisation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Etablissement")
@NoArgsConstructor
@Getter
@Setter
public class Etablissement {

    @Id
    @SequenceGenerator(name = "etablisement_sequence",
            sequenceName = "etablisement_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "etablisement_sequence"
    )
    private Long id;

    @ManyToOne
    @JoinColumn(name = "organisation_id")
    private Organisation organisation;

    private String Siret;
    private String nom;
    private String Secteur;

    @OneToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;
}
