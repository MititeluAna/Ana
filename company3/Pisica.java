package com.company;

public class Pisica extends Vertebrate  {
    private String tipHranCopil;
    private int nrMembre;

    public Pisica(String orgDeSimt, String prezent,String tipHranCopil,int nrMembre){
        super(orgDeSimt,prezent);
        this.tipHranCopil = tipHranCopil;
        this.nrMembre = nrMembre;

    }

    public String getTipHranCopil() {
        return tipHranCopil;
    }

    public void setTipHranCopilrancopil(String tipHranCopil) {
        this.tipHranCopil = tipHranCopil;
    }

    public int getNrMembre() {
        return nrMembre;
    }

    public void setNrMembre(int nrMembre) {
        this.nrMembre = nrMembre;
    }

    @Override
    public String toString(){
        return super.toString() +
                " tipHranCopil='" + tipHranCopil + '\'' +
                ",nrMembre=" + nrMembre +
                '}';
    }

    @Override
    public void sunet() {
        System.out.println("Miau-Miau");
   }

    @Override
    public void clasa() {
        System.out.println("Mamifere");
    }
}

