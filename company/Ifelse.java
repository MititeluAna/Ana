package com.company;


public class Ifelse {
    public static void ie(int x){
        if(x<0){
            System.out.println("Numarul este negativ");
        } else if(x==0){
            System.out.println("Numarul este egal cu 0");
        }else{
            System.out.println("Numarul este pozitiv");
        }
    }
    public static void whi(int a){
        while(a < 5 ){
            System.out.println(a);
            a++;
        }
    }
    public static void fr(){
        int[] numere = {6,1,9,4};
        int b;
       for(int i = 0 ;i <numere.length;i++){
           System.out.println(numere[i]);
       }

    }
    public static void main(String[] args) {
       ie(2);
        System.out.println("----------------");
       whi(3);
        System.out.println("----------------");
        fr();
    }
}
