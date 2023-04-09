package ma.enset.Ebankaccountservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.Ebankaccountservice.enums.AccountType;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount
{
    @Id
    private String id;
    private Date createDate;
    private double balance;
    private String currency;
    private AccountType type;

}



