package com.H2o.campagne_rejets_non_domestique.campagne_prelevement;

import com.H2o.campagne_rejets_non_domestique.campagne_prelevement.element.Element;
import com.H2o.enumeration.MethodePrelevement;
import com.H2o.enumeration.Unite;
import com.H2o.organisation.etablissement.adresse.Adresse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CampagnePrelevement")
@NoArgsConstructor
@Getter
@Setter
public class CampagnePrelevement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date datePrelevement;
    private Enum<MethodePrelevement> methodePrelevementEnum;
    private boolean isCofrac;
    private Integer debit;
    private Enum<Unite> uniteDebit;

    @OneToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Element> elements;
}
