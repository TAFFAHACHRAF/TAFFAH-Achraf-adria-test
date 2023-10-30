package taffah.enset.billingservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import taffah.enset.billingservice.entities.Wallet;
import taffah.enset.billingservice.repositories.WalletRepository;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
//@EnableConfigurationProperties(ConfigParams.class)
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(WalletRepository walletRepository){
		return args -> {
			Wallet wallet=Wallet.builder().solde(8487.54).devise(87451).created(new Date()).id(UUID.randomUUID().toString()).build();
			System.out.println();
			walletRepository.save(wallet);
		};
	}
}
