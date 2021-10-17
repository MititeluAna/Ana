package com.company;

public class Pasari extends Vertebrate {
    private String medDeAct;
    private String gura;

    public Pasari(String orgDeSimt, String prezent, String medDeAct, String gura) {
        super(orgDeSimt, prezent);
        this.medDeAct = medDeAct;
        this.gura = gura;
    }

    public String getMedDeAct() {
        return medDeAct;
    }

    public void setMedDeAct(String medDeAct) {
        this.medDeAct = medDeAct;
    }

    public String getGura() {
        return gura;
    }

    public void setGura(String gura) {
        this.gura = gura;
    }

    @Override
    public String toString() {
        return super.toString() +
                " mediudeactivare ='" + medDeAct + '\'' +
                ",gura='" + gura + '\'' +
                '}';
    }
}
