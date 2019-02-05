package App.bankapplication.Services;

import App.bankapplication.API.Transactions;
import App.bankapplication.Data.Client;
import org.springframework.stereotype.Service;

@Service
public class TransactionsService implements Transactions {


    @Override
    public void sendMoney(Client client) {

    }

    @Override
    public void takeMoney(Client c) {

    }


    //find out how to store informations about transactions
    @Override
    public String generateTransactionCode(Client to ) {
        return new String(to.getAccountNumber());
    }
}
