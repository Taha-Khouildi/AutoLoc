package tn.esprit.taha_khouildi_4cce18.Domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Vehicule {
    private Long idVehicule;
    private String immatticulation;
    private String marque;
    private String modele;
    private CategorieVehicule categorie;
    private double tarifJounalier;
    private StatutVehicule statut;
}
