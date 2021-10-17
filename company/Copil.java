package com.company;

public class Copil extends Parinte{
    private String culOchi;
    private String animPref;

    public Copil(String nume,String prenume,String limdevorb,String strundeloc,String culOchi,String animPref){
        super(nume, prenume, limdevorb, strundeloc);
        this.culOchi = culOchi;
        this.animPref = animPref;
    }

    public String getCulochi() {
        return culOchi;
    }

    public void setCulOchi(String culOchi) {
        this.culOchi = culOchi;
    }

    public String getAnimPref() {
        return animPref;
    }

    public void setAnimPref(String animPref) {
        this.animPref = animPref;
    }

    @Override
    public String toString(){
        return super.toString() +
                "culoareaochilor='" + culOchi + '\'' +
                ",animalulpreferat='" + animPref + '\'' +
                '}';
    }
}


