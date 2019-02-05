package App.bankapplication.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Accounts {


    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Client clientId;

    private double money = 0;

    private String accountNumber;

    private Accounts(){}

    public static Accounts accountFactory(String accountNumber)
    {
        Accounts acc = new Accounts();
        acc.setAccountNumber(accountNumber);
        return acc;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
