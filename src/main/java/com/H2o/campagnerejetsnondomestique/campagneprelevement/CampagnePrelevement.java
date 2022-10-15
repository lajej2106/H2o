package com.H2o.campagnerejetsnondomestique.campagneprelevement;

import com.H2o.enumeration.MethodePrelevement;
import com.H2o.enumeration.Unite;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CampagnePrelevement")
@NoArgsConstructor
@Getter
@Setter
public class CampagnePrelevement {

    @Id
    @SequenceGenerator(name = "campagne_prelevement_sequence",
            sequenceName = "campagne_prelevement_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "campagne_prelevement_sequence"
    )

    private Long id;
    Date datePrelevement;
    Enum<MethodePrelevement> methodePrelevement;
    boolean isCofrac;
    Integer debit;
    Enum<Unite> uniteDebit;
}
