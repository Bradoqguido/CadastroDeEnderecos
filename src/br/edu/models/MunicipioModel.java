package br.edu.models;

import br.edu.abstracts.MunicipioAbstract;

public class MunicipioModel extends MunicipioAbstract {

    private String estado = "";
    private String municipio = "";

    public MunicipioModel() {}

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
