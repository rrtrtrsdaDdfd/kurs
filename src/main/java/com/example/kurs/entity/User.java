package com.example.kurs.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "user_table")
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "amount")
    private int amount;
    @Column(name = "data")
    private LocalDate data;
    @Column(name = "mss")
    private String mss;

    public User() {
    }

    public User(String name, int amount, LocalDate data, String mss) {
        this.name = name;
        this.amount = amount;
        this.data = data;
        this.mss = mss;
    }
}
