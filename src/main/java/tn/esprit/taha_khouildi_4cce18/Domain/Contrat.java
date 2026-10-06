package tn.esprit.taha_khouildi_4cce18.Domain;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class Contrat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;

    @OneToOne
    @JoinColumn(name = "id_reservation", unique = true)
    private Reservation reservation;

    @OneToOne(mappedBy = "contrat", cascade = CascadeType.ALL)
    private Paiement paiement;
}
