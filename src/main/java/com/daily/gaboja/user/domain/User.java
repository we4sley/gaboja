package com.daily.gaboja.user.domain;

import com.daily.gaboja.user.constant.UserRole;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String profile;
    private String age;
    private String gender;
    private String email;
    private UserRole role;

    @Builder
    public User(String name, String email,String profile, String age, String gender, UserRole role){
        this.name = name;
        this.email = email;
        this.profile = profile;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }
}
