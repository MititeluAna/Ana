package com.company;

public class Parinte {
    private String nume;
    private String prenume;
    private String limDeVorb;
    private String strUndeLoc;


    public Parinte(String nume,String prenume,String limDeVorb,String strUndeLoc){
        this.nume=nume;
        this.prenume=prenume;
        this.limDeVorb = limDeVorb;
        this.strUndeLoc=strUndeLoc;
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
        return limDeVorb;
    }

    public void setLimDeVorb(String limDeVorb) {
        this.limDeVorb = limDeVorb;
    }

    public String getStrundeloc() {
        return strUndeLoc;
    }

    public void setStrUndeLoc(String strUndeLoc) {
        this.strUndeLoc = strUndeLoc;
    }

    @Override
    public String toString(){
            return "Copil{" +
                "nume='" + nume + '\'' +
                ",prenume='" + prenume + '\'' +
                ",limdevorb='" + limDeVorb + '\'' +
                ",strundeloc='" + strUndeLoc + '\'' +
                ',';
    }
}


