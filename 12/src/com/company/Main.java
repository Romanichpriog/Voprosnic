package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pravilnost ss = new Pravilnost();
        Vopros v1 =new Vopros("Земля плоская?","нет");
        Vopros v2 =new Vopros("Великобритания Королевтсво?","да");
        Vopros v3 =new Vopros("Обломова написал Толстой?","нет");
        Vopros v4 =new Vopros("пятница 13 всего лдитн раз в году?","нет");
        Vopros v5 =new Vopros("В сутках чучуть больше 24 часов?","нет");
        Vopros v6 =new Vopros("Северная ирландия и Ирландя одна страна?","нет");
        System.out.println("На все вопросы отвечайте да/не");
        v1.zadat();
        Otvet a1= new Otvet(s.next());
        if (a1.check(v1.otvet)==true){
            ss.plus();
            ss.a+=1;
        }else{
            ss.plus();
            ss.b+=1;
        }
        v2.zadat();
        Otvet a2= new Otvet(s.next());
        if (a2.check(v2.otvet)==true){
            ss.plus();
            ss.a+=1;
        }else{
            ss.plus();
            ss.b+=1;
        }
        v3.zadat();
        Otvet a3= new Otvet(s.next());
        if (a3.check(v3.otvet)==true){
            ss.plus();
            ss.a+=1;
        }else{
            ss.plus();
            ss.b+=1;
        }
        v4.zadat();
        Otvet a4= new Otvet(s.next());
        if (a4.check(v4.otvet)==true){
            ss.plus();
            ss.a+=1;
        }else{
            ss.plus();
            ss.b+=1;
        }
        v5.zadat();
        Otvet a5= new Otvet(s.next());
        if (a5.check(v5.otvet)==true){
            ss.plus();
            ss.a+=1;
        }else{
            ss.plus();
            ss.b+=1;
        }
        v6.zadat();
        Otvet a6= new Otvet(s.next());
        if (a6.check(v6.otvet)==true){
            ss.plus();
            ss.a+=1;
        }else{
            ss.plus();
            ss.b+=1;
        }
        ss.calculate();






    }

}
