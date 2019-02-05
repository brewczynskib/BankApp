package App.bankapplication.Forms;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TransactionsForm {

    private String accountNumber;

    private String name;

    private String surName;

    private double amount;

    private Date date;


    public void setDate(Date date) {
        this.date = date;
    }



    public Date getDate() {
        return date;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
