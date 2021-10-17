package com.company;

public class Registru {
    private String elev;
    private String disciplina ="matematica";
    private int nota;

    public Registru(String elev, int nota) {
        this.elev = elev;
        this.nota = nota;
    }

    public String getElev() {
        return elev;
    }

    public void setElev(String elev) {
        this.elev = elev;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Registru Fi{"+
                "elev='" + elev + '\''+
                ",disciplina='" + disciplina + '\''+
                ",nota=" + nota +
                '}';
    }
}
