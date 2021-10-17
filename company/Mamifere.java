package com.company;

public class Mamifere extends Vertebrate{
    private String tipHranCopil;
    private int nrMembre;

    public Mamifere(String orgDeSimt, String prezent,String tipHranCopil,int nrMembre){
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
}
