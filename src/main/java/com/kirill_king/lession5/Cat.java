package com.kirill_king.lession5;

class Cat {
    private String name;
    private String color;
    private int age;
    private int weight;

    public Cat(String name, String color, int age) {  // Alt ins counstract
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = 5;
        System.out.println("this is counstruct class cat");
    }

    public Cat(String name,int weight) {
        this.name = name;
        this.color = "unknow";
        this.age = 1;
        this.weight = weight;
    }
    public void eat(int food){
        weight += food;

    }
    public void info(){
        System.out.println("name cat"+name);
        System.out.println("age cat"+age);
        System.out.println("color cat"+color);
        System.out.println("weight cat"+weight);
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        if (color == "white"){
            System.out.println("incorect collor");
        }
        else {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }
}

