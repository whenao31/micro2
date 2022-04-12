package co.com.sofka.micro2.service;

import co.com.sofka.micro2.model.UserDto;
import reactor.core.publisher.Mono;

public interface IUserService {
    Mono<UserDto> findById(String id, String navigator);
}
