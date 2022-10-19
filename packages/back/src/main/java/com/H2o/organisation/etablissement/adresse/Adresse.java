package com.H2o.organisation.etablissement.adresse;

import com.H2o.organisation.etablissement.adresse.PositionRejet.PositionRejet;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Adresse")
@NoArgsConstructor
@Getter
@Setter
public class Adresse {

    @Id
    @SequenceGenerator(name = "adresse_sequence",
            sequenceName = "adresse_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "adresse_sequence"
    )
    private Long id;
    private String numero;
    private String rue;
    private Integer codePostal;
    private String ville;
    private String region;
    private String pays;

    @OneToOne
    @JoinColumn(name = "position_rejet_id")
    private PositionRejet positionRejet;
}
