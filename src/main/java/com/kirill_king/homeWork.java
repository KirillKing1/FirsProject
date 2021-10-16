package com.kirill_king;

public class homeWork {
    public static void main(String[] args) {
printThreeWords();
checkSumSign();
printColor();
    }
    public static void printThreeWords(){
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }
    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("sum positive");
        }
        if (sum < 0) {
            System.out.println("sum negative");
        }
    }
    public static void printColor(){
           int value = 3;
           if (value <= 0){
               System.out.println("red");
           }
           if (value > 0 && value <= 100){
                System.out.println("yellow");
            }
           if (value > 100){
               System.out.println("green");
           }
        }
    }

