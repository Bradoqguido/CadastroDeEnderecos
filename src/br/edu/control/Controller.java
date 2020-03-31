package br.edu.control;

import br.edu.models.BairroModel;
import br.edu.models.EnderecoModel;
import br.edu.models.EstadoModel;
import br.edu.models.MunicipioModel;

import java.util.ArrayList;

public class Controller {
    private ArrayList<BairroModel> bairros = new ArrayList<>();
    private ArrayList<EnderecoModel> enderecos = new ArrayList<>();
    private ArrayList<EstadoModel> estados = new ArrayList<>();
    private ArrayList<MunicipioModel> municipios = new ArrayList<>();

    public Controller() {}

    public boolean verificaSeTemBairro() {
        return bairros.isEmpty();
    }

    public boolean verificaSeTemEndereco() {
        return enderecos.isEmpty();
    }

    public boolean verificaSeTemEstado() {
        return estados.isEmpty();
    }

    public boolean verificaSeTemMunicipio() {
        return municipios.isEmpty();
    }

    public void cadastrarBairro (BairroModel bairro) {
        this.bairros.add(bairro);
    }

    public void cadastrarEndereco (EnderecoModel endereco) {
        this.enderecos.add(endereco);
    }

    public void cadastrarEstado (EstadoModel estado) {
        this.estados.add(estado);
    }

    public void cadastrarMunicipio (MunicipioModel municipio) {
        this.municipios.add(municipio);
    }


    public void removerBairro (BairroModel bairro) {
        this.bairros.remove(bairro);
    }

    public void removerEndereco (EnderecoModel endereco) {
        this.enderecos.remove(endereco);
    }

    public void removerEstado (EstadoModel estado) {
        this.estados.remove(estado);
    }

    public void removerMunicipio (MunicipioModel municipio) {
        this.municipios.remove(municipio);
    }

    // alterar

    public boolean consultarBairro (BairroModel bairro) {
        return this.bairros.contains(bairro);
    }

    public boolean consultarEndereco (EnderecoModel endereco) {
        return this.enderecos.contains(endereco);
    }

    public boolean consultarEstado (EstadoModel estado) {
        return this.estados.contains(estado);
    }

    public boolean consultarMunicipio (MunicipioModel municipio) {
        return this.municipios.contains(municipio);
    }
}
