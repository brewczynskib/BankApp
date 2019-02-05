package App.bankapplication.API;

import App.bankapplication.Data.Client;
import App.bankapplication.Data.Currency;

public interface Transactions
{
    void sendMoney(Client client);
    void takeMoney(Client c);
    //Add currency (Enum type) as a parameter
    String generateTransactionCode(Client to);
}
