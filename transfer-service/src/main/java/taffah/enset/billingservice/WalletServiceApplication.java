package taffah.enset.billingservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import taffah.enset.billingservice.entities.Transfer;
import taffah.enset.billingservice.repositories.TransferRepository;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
//@EnableConfigurationProperties(ConfigParams.class)
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(TransferRepository transferRepository){
		return args -> {
			Transfer transfer=Transfer.builder().id(UUID.randomUUID().toString()).destination("zeygfyzegf").created(new Date()).build();
			System.out.println();
			transferRepository.save(transfer);
		};
	}
}
