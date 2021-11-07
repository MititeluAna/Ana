package com.company;

public class Main {

    public static void main(String[] args) {
        Pisica p1 = new Pisica("ochi","coloana vertebrala","alaptare",4);
        Cocos c1 = new Cocos("ochi","coloana vertebrala","pene","cioc");
        System.out.println(p1.toString());
        System.out.println(c1.toString());
        Vertebrate pisica = new Pisica("ochi","coloana vertebrala","alaptare",4);
        pisica.sunet();
        Vertebrate cocos = new Cocos("ochi","coloana vertebrala","pene","cioc");
        cocos.sunet();
        pisica.increngatura();
        cocos.increngatura();
        pisica.clasa();
        cocos.clasa();
    }
}
