package com.company;

public class Vopros {
    String vopros;
    String otvet;
    public  Vopros(String q, String w){
        this.otvet=w;
        this.vopros=q;
    }
    public void zadat(){
        System.out.println(vopros);
    }
}
