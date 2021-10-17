package com.company;

public class Vertebrate {
    private String orgdesimt;
    private String prezent;

    public Vertebrate(String orgdesimt,String prezent){
    this.orgdesimt = orgdesimt;
    this.prezent = prezent;
    }

    public String getOrgdesimt() {
        return orgdesimt;
    }

    public void setOrgdesimt(String orgdesimt) {
        this.orgdesimt = orgdesimt;
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
                "organdesimt='" + orgdesimt + '\'' +
                ",prezent='" + prezent + '\'' +
                ',';
    }
}

