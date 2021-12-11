package com.kirill_king.lession5;

public class Student {
    private String name; //crete a metod
    private int grades;  //crete a metod
    private int student_id;   //crete a metod
    public Student(String name, int grades, int student_id){ // create to we can add thing to us metod
        this.name = name;
        this.grades = grades;
        this.student_id = student_id;
    }
    public void info(){   // we are create variable for print
        System.out.println("my name is"+ name);
        System.out.println("my grades are "+ grades);
        System.out.println("my student id is"+ student_id);
    }
    public static void main(String[] args){  // we call a metod
        Student student = new Student("ky",10,654589);
        student.info();
    }
}
