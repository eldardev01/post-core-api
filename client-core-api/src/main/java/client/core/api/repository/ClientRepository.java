package client.core.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends CrudRepository<ClientEntity, Long> {

}
