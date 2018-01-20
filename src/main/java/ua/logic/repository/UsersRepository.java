package ua.logic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.logic.entity.User;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersRepository extends CrudRepository<User, Long> {
}
