package br.edu.models;

import br.edu.abstracts.EstadoAbstract;

public class EstadoModel extends EstadoAbstract {
    private String estado = "";

    public EstadoModel() {}

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
