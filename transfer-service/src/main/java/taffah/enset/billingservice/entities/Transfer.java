package taffah.enset.billingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import taffah.enset.billingservice.ennumerations.WalletEtat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transfer {
    @Id
    private String id;
    private Date created;
    private String source;
    private String destination;
    private double montant;
    private WalletEtat etat;
}
