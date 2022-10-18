package com.H2o.organisation.organisation;

import com.H2o.enumeration.TypeOrganisation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Organisation")
@NoArgsConstructor
@Getter
@Setter
public class Organisation {

    @Id
    @SequenceGenerator(name = "organisation_sequence",
            sequenceName = "organisation_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "organisation_sequence"
    )
    private Long id;
    String siret;
    String siegeSocial;
    String nom;
    Enum<TypeOrganisation> typeOrganisation;
}
