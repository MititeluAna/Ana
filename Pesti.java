package com.company;

public class Pesti extends Vertebrate {
    private String miscare;
    private String corpcu;

    public Pesti(String orgdesimt,String prezent,String miscare,String corpcu){
        super(orgdesimt,prezent);
        this.miscare = miscare;
        this.corpcu = corpcu;
    }

    public String getMiscare() {
        return miscare;
    }

    public void setMiscare(String miscare) {
        this.miscare = miscare;
    }

    public String getCorpcu() {
        return corpcu;
    }

    public void setCorpcu(String corpcu) {
        this.corpcu = corpcu;
    }
    @Override
    public String toString(){
        return super.toString() +
                " miscare='" + miscare + '\'' +
                ",corpcu='" + corpcu + '\'' +
                '}';
    }
}

