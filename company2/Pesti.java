package com.company;

public class Pesti extends Vertebrate {
    private String miscare;
    private String corpCu;

    public Pesti(String orgDeSimt,String prezent,String miscare,String corpCu){
        super(orgDeSimt,prezent);
        this.miscare = miscare;
        this.corpCu = corpCu;
    }

    public String getMiscare() {
        return miscare;
    }

    public void setMiscare(String miscare) {
        this.miscare = miscare;
    }

    public String getCorpCu() {
        return corpCu;
    }

    public void setCorpCu(String corpCu) {
        this.corpCu = corpCu;
    }
    @Override
    public String toString(){
        return super.toString() +
                " miscare='" + miscare + '\'' +
                ",corpcu='" + corpCu + '\'' +
                '}';
    }
}

