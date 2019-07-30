package com.cherrow.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Objects;

@Getter
@AllArgsConstructor
public class User {
    private String name;
    private int age;

    public String introduceSelf() {
        return "Hello, my name is " + name + ", I'm " + age + " years old";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            return name.equals(user.getName()) && age == user.getAge();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
