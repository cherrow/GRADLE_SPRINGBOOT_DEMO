package com.cherrow.spring.service;

import com.cherrow.spring.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public String sayHello(){
        User user = new User("cherrow", 23);
        log.info("create new user with name: "+ user.getName()+", age: "+ user.getAge());
        return user.introduceSelf();
    }

    public User createUser(String name, int age){
        log.info("create new user with name: "+ name+", age: "+ age);
        return new User(name, age);
    }
}
