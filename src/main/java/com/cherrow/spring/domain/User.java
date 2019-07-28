package com.cherrow.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
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
            User person = (User) obj;
            return name.equalsIgnoreCase(person.getName().trim())
                    && age == person.getAge();
        }
        return false;
    }
}
