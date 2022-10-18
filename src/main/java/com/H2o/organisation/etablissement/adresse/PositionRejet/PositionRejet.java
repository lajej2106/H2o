package com.H2o.organisation.etablissement.adresse.PositionRejet;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PositionRejet")
@NoArgsConstructor
@Getter
@Setter
public class PositionRejet {

    @Id
    @SequenceGenerator(name = "postion_rejet_sequence",
            sequenceName = "postion_rejet_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "postion_rejet_sequence"
    )
    private Long id;
    private Float longitude;
    private Float latitude;
    private Float altitude;

}
