package com.company;

public class Pravilnost {
    double a;
    double b;
    double c;
    public Pravilnost(){
        this.a=0;
        this.b=0;
        this.c=0;


    }
    public void plus(){
        this.c+=1;
    }
    void calculate(){
        System.out.println("Правильно вы олтветили на: "+a+"\n"+" Неправидьно вы ответили на "+b+"\n"+"процент правильных ответов "+(a/c*100));
    }
}
