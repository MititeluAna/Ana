package com.company;

public abstract class Vertebrate implements Abc {
    private String orgDeSimt;
    private String estePrezenta;

    public Vertebrate(String orgDeSimt,String estePrezenta){
        this.orgDeSimt = orgDeSimt;
        this.estePrezenta = estePrezenta;
    }

    public String getOrgDeSimt() {
        return orgDeSimt;
    }

    public void setOrgDeSimt(String orgDeSimt) {
        this.orgDeSimt = orgDeSimt;
    }

    public String getEstePrezenta() {
        return estePrezenta;
    }

    public void setEstePrezenta(String estePrezenta) {
        this.estePrezenta = estePrezenta;
    }

    @Override
    public String toString(){
        return "Vertebrate{" +
                "organdesimt='" + orgDeSimt + '\'' +
                ",esteprezenta='" + estePrezenta + '\'' +
                ',';
    }

    @Override
    public void increngatura() {
        System.out.println("Vertebrate");
    }

    public abstract void clasa();
    public abstract void sunet();
}
