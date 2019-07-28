package com.cherrow.spring.service;

import com.cherrow.spring.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserService.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void should_get_expected_string_when_say_hello() {
        assertEquals("Hello, my name is cherrow, I'm 23 years old",
                userService.sayHello());
    }

    @Test
    public void should_get_expected_user_giving_params() {
        User user = new User("test", 1);
        assertEquals(user, userService.createUser("test", 1));
    }
}