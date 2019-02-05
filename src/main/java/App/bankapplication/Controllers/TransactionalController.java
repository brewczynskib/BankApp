package App.bankapplication.Controllers;

        import App.bankapplication.Data.Client;
        import App.bankapplication.Data.Transactions;
        import App.bankapplication.Forms.TransactionsForm;
        import App.bankapplication.Repositories.ClientRep;
        import App.bankapplication.Repositories.TransactionsRep;
        import App.bankapplication.Services.TransactionsService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.Date;


@RestController
public class TransactionalController {

    @Autowired
    TransactionsService transactionalService;
    @Autowired
    ClientRep clientRep;
    @Autowired
    TransactionsRep transactionsRep;


    @PostMapping (value = "/send-money")
    public void SendMoney(@RequestBody TransactionsForm transactionForm, String who, Date date)
    {
        Client from = clientRep.findClientByAaccountNumber(who);
        Client to = clientRep.findClientByAaccountNumber(transactionForm.getAccountNumber());
        // generate transaction code
        String transactionCode = transactionalService.generateTransactionCode(to);
        // save transaction in db
        transactionsRep.save(Transactions.transactionsFactory(transactionForm.getDate(),from,transactionForm.getAmount(),transactionCode));
        // delete amount from client account
        from.setMoney(from.getMoney()-transactionForm.getAmount());
        // send money to "to" ??

    }
}
