package com.example;
public class Main {
    public int sumar(int a, int b){
        return a + b;
    }
    public int restar(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        Main cal = new Main();
        System.out.println("Suma: " + cal.sumar(6,6));
        System.out.println("Resta :" + cal.restar(5, 3));
    }
}