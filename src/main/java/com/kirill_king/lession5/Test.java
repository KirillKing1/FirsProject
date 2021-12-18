package com.kirill_king.lession5;

public class Test {
    public static void main(String[] args) {
//        User user = new User("ky",1,15);
//        user.info();
//        Cat cat = new Cat();
//        cat.color="White";
//        cat.age=1;
//        cat.name="Roxy";
//        System.out.println("name cat:"+cat.name);
//        System.out.println("cat collor:"+cat.color);
//        System.out.println("cat age:"+cat.age);
//        System.out.println(cat);
//        Cat cat1 = new Cat();
//        cat1.color="brown";
//        cat1.age=2;
//        cat1.name="boris";
//        System.out.println("name cat:"+cat1.name);
//        System.out.println("cat collor:"+cat1.color);
//        System.out.println("cat age:"+cat1.age);
//        cat = cat1;
//        System.out.println(cat.name);
//        Cat cat2;
//        cat2 = new Cat();
//        System.out.println(cat2);
        Cat cat0 = new Cat("boris","black",3);
//        Cat cat1 = cat0;
//        System.out.println(cat0);
//        System.out.println(cat1);
        Cat cat = new Cat("alex",10);
//        System.out.println(cat.getName());
//        cat.setColor("white");
//        System.out.println(cat.getColor());
//        cat.setColor("black");
//        System.out.println(cat.getColor());
        cat.eat(2);
        cat.info();

}
}
