package co.com.sofka.micro2.controller;

import co.com.sofka.micro2.model.UserDto;
import co.com.sofka.micro2.service.implement.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class UserDtoController {

    @Autowired
    private UserService userService;

    @GetMapping("/userandnav/{id}")
    private ResponseEntity<Mono<UserDto>> addNavToUser(@PathVariable("id")String id, @RequestHeader Map<String,String> headers){
        System.out.println(headers.get("user-agent"));
        return new ResponseEntity<Mono<UserDto>>(userService.findById(id, headers.get("user-agent")), HttpStatus.OK);
    }
}
