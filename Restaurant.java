package com.company;

public class Restaurant {
    private String director;
    private int nrang;
    private String locatia;
    private String tipmancare = "mexicana";

    public Restaurant(String director,int nrang,String locatia){
        this.director = director;
        this.nrang = nrang;
        this.locatia = locatia;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNrang() {
        return nrang;
    }

    public void setNrang(int nrang) {
        this.nrang = nrang;
    }

    public String getTipmancare() {
        return tipmancare;
    }

    public void setTipmancare(String tipmancare) {
        this.tipmancare = tipmancare;
    }

    @Override
    public String toString(){
        return "Salat{" +
                "director='" + director + '\'' +
                ",nrang=" + nrang +
                ",locatia='" + locatia + '\'' +
                ",tipmancare='" + tipmancare + '\'' +
                '}';
    }
}
