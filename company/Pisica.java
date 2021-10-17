package com.company;

public class Pisica {
    private String rasa;
    private int varsta ;
    private String culBlan;

    public Pisica(String rasa,int varsta,String culBlan){
        this.rasa = rasa;
        this.varsta = varsta;
        this.culBlan = culBlan;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getCulBlan() {
        return culBlan;
    }

    public void setCulBlan(String culBlan) {
        this.culBlan = culBlan;
    }
    @Override
    public String toString(){
        return "Seoma{" +
                "rasa='" + rasa + '\'' +
                ",varsta=" + varsta +
                ",culblan='" + culBlan+ '\'' +
                '}';
    }
}
