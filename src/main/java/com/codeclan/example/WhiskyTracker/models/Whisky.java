package com.codeclan.example.WhiskyTracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name="whisky")
public class Whisky {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="whiskyid")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="year")
    private int year;

    @Column(name="age")
    private int age;

    @JsonIgnoreProperties
    @ManyToOne
    @JoinColumn(name="distilleryid", nullable = false)
    private Distillery distillery;


    public Whisky(String name, int year, int age, Distillery distillery) {
        this.name = name;
        this.year = year;
        this.age = age;
        this.distillery = distillery;
    }

    public Whisky() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Distillery getDistillery() {
        return distillery;
    }

    public void setDistillery(Distillery distillery) {
        this.distillery = distillery;
    }

}
