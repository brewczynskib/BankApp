package App.bankapplication.Repositories;

import App.bankapplication.Data.Transactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRep extends CrudRepository<Transactions , Long> {


}
