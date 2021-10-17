package com.company;

public class Mamifere extends Vertebrate{
    private String tiphrancopil;
    private int nrmembre;

    public Mamifere(String orgdesimt, String prezent,String tiphrancopil,int nrmembre){
        super(orgdesimt,prezent);
        this.tiphrancopil = tiphrancopil;
        this.nrmembre = nrmembre;

    }

    public String getTiphrancopil() {
        return tiphrancopil;
    }

    public void setTiphrancopil(String tiphrancopil) {
        this.tiphrancopil = tiphrancopil;
    }

    public int getNrmembre() {
        return nrmembre;
    }

    public void setNrmembre(int nrmembre) {
        this.nrmembre = nrmembre;
    }
    @Override
    public String toString(){
        return super.toString() +
                " tiphranacopil='" + tiphrancopil + '\'' +
                ",nrmembre=" + nrmembre +
                '}';
    }
}
