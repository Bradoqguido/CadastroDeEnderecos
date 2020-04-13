package br.edu.models;

import br.edu.abstracts.BairroAbstract;

public class BairroModel extends BairroAbstract {
    private String bairro = "";
    private String municipio = "";
    private String estado = "";

    public BairroModel() {}

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

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
