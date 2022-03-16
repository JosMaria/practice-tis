package org.genesiscode.practice.entity;

import java.time.LocalDate;

public class Student {

    private Long id;
    private String name;
    private String lastName;
    private LocalDate birth;
    public Student(Long id, String name, String lastName, LocalDate birth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birth = birth;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getBirth() {
        return birth;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
}
