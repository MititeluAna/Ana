package com.company;

public class Parinte {
    private String nume;
    private String prenume;
    private String limdevorb;
    private String strundeloc;


    public Parinte(String nume,String prenume,String limdevorb,String strundeloc){
        this.nume=nume;
        this.prenume=prenume;
        this.limdevorb = limdevorb;
        this.strundeloc=strundeloc;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getLimdevorb() {
        return limdevorb;
    }

    public void setLimdevorb(String limdevorb) {
        this.limdevorb = limdevorb;
    }

    public String getStrundeloc() {
        return strundeloc;
    }

    public void setStrundeloc(String strundeloc) {
        this.strundeloc = strundeloc;
    }

    @Override
    public String toString(){
            return "Copil{" +
                "nume='" + nume + '\'' +
                ",prenume='" + prenume + '\'' +
                ",limdevorb='" + limdevorb + '\'' +
                ",strundeloc='" + strundeloc + '\'' +
                ',';
    }
}


