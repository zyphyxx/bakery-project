package com.zpx.bakery.dto;

import com.zpx.bakery.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class MyUser {

    private Long id;
    private String name;
    private Integer age;

    public MyUser (User user){
        this.id = user.getId();
        this.name = user.getName();
        this.age = user.getAge();
    }
}
