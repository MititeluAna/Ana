package com.company;

public class Main {

    public static void main(String[] args) {
    Copil c1 = new Copil("Bou","Ion","romana","Aleco Ruso","caprui","pisica");
    System.out.println(c1.toString());
    Restaurant Salat = new Restaurant("Anatol Muntean",120,"Kiev");
    System.out.println(Salat.toString());
    Salat.setTipMancare("japoneza");
    System.out.println(Salat.toString());
    Pisica Seoma = new Pisica("birmaneza",2,"alba");
    System.out.println(Seoma.toString());
    Seoma.setRasa("asian");
    System.out.println(Seoma.toString());
    Pesti Caras = new Pesti("ochi","coloana vertebrala","inot","solzi");
    System.out.println(Caras.toString());
    Pasari Randunica = new Pasari("ochi","coloana vertebrala","aerian","cioc");
    System.out.println(Randunica.toString());
    Mamifere Leu = new Mamifere("ochi","coloana vertebrala","alaptare",4);
    System.out.println(Leu.toString());


    }
}
