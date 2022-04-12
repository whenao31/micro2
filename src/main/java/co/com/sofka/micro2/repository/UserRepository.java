package co.com.sofka.micro2.repository;

import co.com.sofka.micro2.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
