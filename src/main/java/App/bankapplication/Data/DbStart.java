//package App.bankapplication.Data;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.stereotype.Component;
//
//@Component
//@ConditionalOnProperty(name = "bank_application.db.recreate" ,havingValue = "true")
//public class DbStart implements CommandLineRunner {
//
//    @Autowired
//    private ClientRep clientRep;
//
//
//    public DbStart(ClientRep clientRep)
//    {
//        this.clientRep = clientRep;
//    }
//
//
//    @Override
//    public void run(String... args) throws Exception
//    {
//
//        var client = Client.ClientFactory("bartosz", "bb");
//        this.clientRep.save(client);
//    }
//}
