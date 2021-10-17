package com.company;

public class Pisica {
    private String rasa;
    private int varsta ;
    private String culblan;

    public Pisica(String rasa,int varsta,String culblan){
        this.rasa = rasa;
        this.varsta = varsta;
        this.culblan = culblan;
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

    public String getCulblan() {
        return culblan;
    }

    public void setCulblan(String culblan) {
        this.culblan = culblan;
    }
    @Override
    public String toString(){
        return "Seoma{" +
                "rasa='" + rasa + '\'' +
                ",varsta=" + varsta +
                ",culblan='" + culblan+ '\'' +
                '}';
    }
}
