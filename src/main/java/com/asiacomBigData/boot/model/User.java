package com.asiacomBigData.boot.model;

public class User {

    private Long   id;
    private String name;
    private Integer age;
    private String password;

    public User(String name, Integer age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}