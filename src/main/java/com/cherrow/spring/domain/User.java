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

    public String introduceSelf(){
        return "Hello, my name is "+ name + ", I'm "+ age +" years old";
    }
}
