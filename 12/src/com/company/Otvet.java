package com.company;

public class Otvet {
    String vashOtvet;
    public Otvet(String c){
        this.vashOtvet=c;
    }
    boolean check(String a){
        if(a.equals(vashOtvet)){
            return true;
        }else{
            return false;

        }
    }

}
