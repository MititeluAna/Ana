package com.company;

public class Restaurant {
    private String director;
    private int nrAng;
    private String locatia;
    private String tipMancare = "mexicana";

    public Restaurant(String director,int nrAng,String locatia){
        this.director = director;
        this.nrAng = nrAng;
        this.locatia = locatia;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNrAng() {
        return nrAng;
    }

    public void setNrAng(int nrAng) {
        this.nrAng = nrAng;
    }

    public String getTipMancare() {
        return tipMancare;
    }

    public void setTipMancare(String tipMancare) {
        this.tipMancare = tipMancare;
    }

    @Override
    public String toString(){
        return "Salat{" +
                "director='" + director + '\'' +
                ",nrang=" + nrAng +
                ",locatia='" + locatia + '\'' +
                ",tipmancare='" + tipMancare + '\'' +
                '}';
    }
}
