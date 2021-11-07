package com.company;

public class Cocos extends Vertebrate {
    private String corpCu;
    private String formaGurii;

    public Cocos(String orgDeSimt, String prezent, String corpCu, String formaGurii) {
        super(orgDeSimt, prezent);
        this.corpCu = corpCu;
        this.formaGurii = formaGurii;
    }

    public String getCorpCu() {
        return corpCu;
    }

    public void setCorpCu(String corpCu) {
        this.corpCu = corpCu;
    }

    public String getFormaGurii() {
        return formaGurii;
    }

    public void setFormaGurii(String formaGurii) {
        this.formaGurii = formaGurii;
    }

    @Override
    public String toString() {
        return super.toString() +
                " corpcu ='" + corpCu + '\'' +
                ",formagurii ='" + formaGurii + '\'' +
                '}';
    }

    @Override
    public void sunet() {
        System.out.println("Cucurigu");
    }

    @Override
    public  void clasa() {
        System.out.println("Pasari");
    }
}

