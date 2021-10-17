package com.company;

public class Copil extends Parinte{
    private String culochi;
    private String animpref;

    public Copil(String nume,String prenume,String limdevorb,String strundeloc,String culochi,String animpref){
        super(nume, prenume, limdevorb, strundeloc);
        this.culochi = culochi;
        this.animpref = animpref;
    }

    public String getCulochi() {
        return culochi;
    }

    public void setCulochi(String culochi) {
        this.culochi = culochi;
    }

    public String getAnimpref() {
        return animpref;
    }

    public void setAnimpref(String animpref) {
        this.animpref = animpref;
    }

    @Override
    public String toString(){
        return super.toString() +
                "culochi='" + culochi + '\'' +
                ",animpref='" + animpref + '\'' +
                '}';
    }
}


