package App.bankapplication.Services;

import App.bankapplication.API.Clients;
import App.bankapplication.Data.Client;
import App.bankapplication.Repositories.ClientRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements Clients {

    @Autowired
    ClientRep clientRep;
//    public void fillClients()
//    {
//        var c = Client.ClientFactory("bartek","b");
//        clientRep.save(c);
//    }

    public boolean checkClient(String log , String pasw)
    {
        Client d = clientRep.findClient(log , pasw);
        return d != null;
    }


}
