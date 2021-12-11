package com.kirill_king.lession5;

public class User {
    private String name;
    private int id;
    private int age;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public void info(){
        System.out.println("my id:"+ id);
        System.out.println("my name:"+ name);
        System.out.println("my age"+ age);
    }
}
