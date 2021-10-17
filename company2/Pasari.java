package com.company;

public class Pasari extends Vertebrate {
    private String meddeact;
    private String gura;

    public Pasari(String orgdesimt, String prezent, String meddeact, String gura) {
        super(orgdesimt, prezent);
        this.meddeact = meddeact;
        this.gura = gura;
    }

    public String getMeddeact() {
        return meddeact;
    }

    public void setMeddeact(String meddeact) {
        this.meddeact = meddeact;
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
                " mediudeactivare ='" + meddeact + '\'' +
                ",gura='" + gura + '\'' +
                '}';
    }
}
