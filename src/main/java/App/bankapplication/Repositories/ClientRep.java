package App.bankapplication.Repositories;

import App.bankapplication.Data.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientRep extends CrudRepository<Client,Long> {

    @Query("Select c from Client c")
    List<Client> findAll();

    @Query("Select c from Client c where (c.login = :login and c.password = :password)")
    Client findClient(@Param("login") String login ,@Param("password") String password);

    @Query("Select c from Client c where c.accountNumber = :accountNumber")
            Client findClientByAaccountNumber(@Param("accountNumber") String accountNumber);
}
