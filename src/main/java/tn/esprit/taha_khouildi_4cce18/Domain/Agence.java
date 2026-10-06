package tn.esprit.taha_khouildi_4cce18.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "agence")
    @Builder.Default
    private List<Employe> employes = new ArrayList<>();

    @OneToMany(mappedBy = "agence")
    @Builder.Default
    private List<Vehicule> vehicules = new ArrayList<>();

}
