package br.edu.abstracts;

public abstract class EnderecoAbstract extends BairroAbstract{

    protected String logradouro = "";
    protected String numero = "";

    public abstract String getLogradouro();

    public abstract void setLogradouro(String logradouro);

    public abstract String getNumero();

    public abstract void setNumero(String numero);
}
