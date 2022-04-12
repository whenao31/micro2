package co.com.sofka.micro2.service.implement;

import co.com.sofka.micro2.model.UserDto;
import co.com.sofka.micro2.repository.UserRepository;
import co.com.sofka.micro2.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepo;

    ModelMapper modelMapper= new ModelMapper();

    @Override
    public Mono<UserDto> findById(String id, String navigator) {
        return this.userRepo.findById(id)
                .flatMap(user -> {
                    UserDto userDto = modelMapper.map(user, UserDto.class);
                    userDto.setNavigator(navigator);
                    System.out.println(userDto);
                    return Mono.just(userDto);
                });
    }
}
