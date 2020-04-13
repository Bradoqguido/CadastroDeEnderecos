package br.edu.abstracts;

public abstract class MunicipioAbstract extends EstadoAbstract {
    protected String municipio = "";

    public abstract String getMunicipio();

    public abstract void setMunicipio(String municipio);
}
