package com.example;
public class calculadora {
    int a;
    int b;
    public calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int sumar(){
        return a + b;
    }
    public int restar(){
        return a-b;
    }
}