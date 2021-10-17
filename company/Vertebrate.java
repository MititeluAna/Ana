package com.company;

public class Vertebrate {
    private String orgDeSimt;
    private String prezent;

    public Vertebrate(String orgDeSimt,String prezent){
    this.orgDeSimt = orgDeSimt;
    this.prezent = prezent;
    }

    public String getOrgDeSimt() {
        return orgDeSimt;
    }

    public void setOrgDeSimt(String orgDeSimt) {
        this.orgDeSimt = orgDeSimt;
    }

    public String getPrezent() {
        return prezent;
    }

    public void setPrezent(String prezent) {
        this.prezent = prezent;
    }
    @Override
    public String toString(){
        return "Vertebrate{" +
                "organdesimt='" + orgDeSimt + '\'' +
                ",prezent='" + prezent + '\'' +
                ',';
    }
}

