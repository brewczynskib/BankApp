package App.bankapplication.Controllers;

import App.bankapplication.Data.Client;
import App.bankapplication.Repositories.ClientRep;
import App.bankapplication.Forms.LoginForm;
import App.bankapplication.Services.AccountService;
import App.bankapplication.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private ClientRep clientRep;
    @Autowired
    private ClientService clientService;
    @Autowired
    private AccountService accountService;


    public UserController(ClientRep clientRep , ClientService clientService)
    {
        this.clientService = clientService;
        this.clientRep = clientRep;
    }



    @PostMapping(value ="/create-new-user" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody LoginForm loginForm , BindingResult result)
    {

        if(result.hasErrors()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            clientRep.save(Client.ClientFactory(
                    loginForm.getLogin(),
                    loginForm.getPassword(),
                    accountService.generateAccountNumber()));
        }
    }

    public
    @PostMapping(value="/log-in" , consumes = MediaType.APPLICATION_JSON_VALUE)
    String logInClient(@RequestBody LoginForm loginForm , BindingResult bindingResult) throws Exception {
        if(!bindingResult.hasErrors())
        {
            boolean check = clientService.checkClient(loginForm.getLogin(),loginForm.getPassword());
            if(check) return "OK";
            else return "NOT OK";
        }
        else throw new Exception();
    }

//    public @ResponseBody
//    @GetMapping(value = "/get-all-clients" , produces = MediaType.APPLICATION_JSON_VALUE)
//    List<Client> getAllClients()
//    {
//        this.clientService.fillClients();
//        var clients = this.clientRep.findAll();
//        return clients;
//    }
//
//    public @PostMapping(value = "/create-client")
//    void saveClients()
//    {
//     clientService.fillClients();
//    }

}
