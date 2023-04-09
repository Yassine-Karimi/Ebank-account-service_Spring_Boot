package ma.enset.Ebankaccountservice.repositories;

import ma.enset.Ebankaccountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
    

}
