package com.kirill_king.lession2;

public class homeWork02 {
    public static void main(String[] args) {
        boolean answer = answer(10, 15);
        System.out.println(answer);

    }
        public static boolean answer(int a, int b) {
        return (10 <= a + b) && (a + b <= 20);
        }
}
