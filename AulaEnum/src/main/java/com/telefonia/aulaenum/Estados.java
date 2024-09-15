package com.telefonia.aulaenum;

public enum Estados {

    Sao_paulo("SP", "São Paulo"),
    Bahia("Ba", "Bahia");

    private Estados(String Sigla, String Estado) {
        this.Sigla = Sigla;
        this.Estado = Estado;
    }

    private Estados() {
    }
    
    
    private String Sigla;
    private String Estado;

    public String getSigla() {
        return Sigla;
    }


    public String getEstado() {
        return Estado;
    }

}
