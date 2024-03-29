package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String password;
    private String first_name;
    private String last_name;
    private boolean active;
    private String roles; //ROLE_USER,ROLE_ADMIN
}