package App.bankapplication.Services;

import App.bankapplication.API.Accounts;
import org.springframework.stereotype.Service;


@Service
public class AccountService implements Accounts
{
    private String randomN;


    // TO CHANGE
    public String generateAccountNumber()
    {
        int n = (int) (Math.random() *  20);
        randomN = String.valueOf(n);
        return "000"+randomN+"22";
    }

}
