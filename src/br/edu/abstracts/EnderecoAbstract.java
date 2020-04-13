package br.edu.abstracts;

public abstract class EnderecoAbstract extends BairroAbstract{

    protected String logradouro = "";
    protected int numero = 0;

    public abstract String getLogradouro();

    public abstract void setLogradouro(String logradouro);

    public abstract int getNumero();

    public abstract void setNumero(int numero);
}
