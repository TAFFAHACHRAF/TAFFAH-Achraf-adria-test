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
public class Wallet {
    @Id
    private String id;
    private double solde;
    private Date created;
    private double devise;
    /*private String source;
    private String destination;
    private double montanty;
    private WalletEtat etat;*/
}
