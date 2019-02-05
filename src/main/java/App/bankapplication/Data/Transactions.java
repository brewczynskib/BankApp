package App.bankapplication.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Transactions {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @NotNull
    private Date date;

    @NotBlank
    @NotNull
    private Client clientId;

    @NotNull
    @NotBlank
    private String transactionCode;

    @NotBlank
    @NotNull
    private double amount;


    private Transactions() {}

    public static Transactions transactionsFactory(Date date, Client clientId,double amount ,String transactionCode)
    {
        var t = new Transactions();
        t.setDate(date);
        t.setClientId(clientId);
        t.setTransactionCode(transactionCode);
        return t;
    }



    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }
}
