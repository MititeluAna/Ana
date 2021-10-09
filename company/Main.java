package com.company;

public class Main {
        public static void main(String[] args) {
            Registru Fi = new Registru("Mititelu Ana", "matematica", 9);
           System.out.println(Fi.toString());
           Fi.setDisciplina("fizica");
           Fi.setNota(8);
           System.out.println(Fi.toString());
        }
    }
