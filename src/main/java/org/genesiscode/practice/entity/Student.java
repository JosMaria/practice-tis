package org.genesiscode.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private Long id;

    @Column(name = "my_name", nullable = false)
    private String name;
    private String lastName;
    //private LocalDate birth;

    public Student(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Student() {
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
    /*public LocalDate getBirth() {
        return birth;
    }*/

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //public void setBirth(LocalDate birth) {
    //    this.birth = birth;
    //}
}
