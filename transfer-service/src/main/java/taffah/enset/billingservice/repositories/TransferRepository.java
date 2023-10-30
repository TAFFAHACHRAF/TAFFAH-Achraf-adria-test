package taffah.enset.billingservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import taffah.enset.billingservice.entities.Transfer;

@RepositoryRestResource
public interface TransferRepository extends JpaRepository<Transfer,String> {}

