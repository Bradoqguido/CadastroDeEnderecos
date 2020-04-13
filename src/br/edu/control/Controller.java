package br.edu.control;

import br.edu.models.BairroModel;
import br.edu.models.EnderecoModel;
import br.edu.models.EstadoModel;
import br.edu.models.MunicipioModel;

import java.util.ArrayList;

public class Controller {
    private ArrayList<EnderecoModel> enderecos = new ArrayList<>();
    private ArrayList<BairroModel> bairros = new ArrayList<>();
    private ArrayList<MunicipioModel> municipios = new ArrayList<>();
    private ArrayList<EstadoModel> estados = new ArrayList<>();

    public Controller() { }

    public void popularComDadosFixos() {
        criarRegistrosEstado();
        criarRegistrosMunicipio();
        criarRegistrosBairro();
        criarRegistrosEndereco();
    }

    // Verificar se tem dados
    public boolean verificaSeTemEndereco() {
        return enderecos.isEmpty();
    }

    public boolean verificaSeTemBairro() {
        return bairros.isEmpty();
    }

    public boolean verificaSeTemMunicipio() {
        return municipios.isEmpty();
    }

    public boolean verificaSeTemEstado() {
        return estados.isEmpty();
    }

    // Cadastro
    public void cadastrarEndereco (EnderecoModel endereco) {
        this.enderecos.add(endereco);
    }

    public void cadastrarBairro (BairroModel bairro) {
        this.bairros.add(bairro);
    }

    public void cadastrarMunicipio (MunicipioModel municipio) {
        this.municipios.add(municipio);
    }

    public void cadastrarEstado (EstadoModel estado) {
        this.estados.add(estado);
    }

    // Remover
    public void removerEndereco (EnderecoModel endereco) {
        this.enderecos.remove(endereco);
    }

    public void removerBairro (BairroModel bairro) {
        this.bairros.remove(bairro);
    }

    public void removerMunicipio (MunicipioModel municipio) {
        this.municipios.remove(municipio);
    }

    public void removerEstado (EstadoModel estado) {
        this.estados.remove(estado);
    }

    // criar funcoes alterar

    // Consultar
    public boolean consultarEndereco (EnderecoModel endereco) {
        return this.enderecos.contains(endereco);
    }

    public boolean consultarBairro (BairroModel bairro) {
        return this.bairros.contains(bairro);
    }

    public boolean consultarMunicipio (MunicipioModel municipio) {
        return this.municipios.contains(municipio);
    }

    public boolean consultarEstado (EstadoModel estado) {
        return this.estados.contains(estado);
    }

    // Listar/Retorna lista
    public ArrayList<String> getListaNumeroEnderecoPorLogradouro (String logradouro) {
        ArrayList<String> listaNumeroLogradouros = new ArrayList<>();
        listaNumeroLogradouros.add("Selecione o número");
        for (EnderecoModel logradouroo : this.enderecos) {
            if (logradouroo.getLogradouro().equals(logradouro)) {
                listaNumeroLogradouros.add(logradouroo.getNumero());
            }
        }
        return listaNumeroLogradouros;
    }

    public ArrayList<String> getListaLogradouroPorBairro (String bairro) {
        ArrayList<String> listaLogradouros = new ArrayList<>();
        listaLogradouros.add("Selecione o logradouro");
        for (EnderecoModel logradouro : this.enderecos) {
            if (logradouro.getBairro().equals(bairro)) {
                listaLogradouros.add(logradouro.getLogradouro());
            }
        }
        return listaLogradouros;
    }

    public ArrayList<String> getListaBairro () {
        ArrayList<String> listaBairros = new ArrayList<>();
        listaBairros.add("Selecione o bairro");
        for (BairroModel bairro : this.bairros) {
            listaBairros.add(bairro.getBairro());
        }
        return listaBairros;
    }

    public ArrayList<String> getListaBairroPorMunicipio (String municipio) {
        ArrayList<String> listaBairros = new ArrayList<>();
        listaBairros.add("Selecione o bairro");
        for (BairroModel bairro : this.bairros) {
            if (bairro.getMunicipio().equals(municipio)) {
                listaBairros.add(bairro.getBairro());
            }
        }
        return listaBairros;
    }

    public ArrayList<String> getListaMunicipio () {
        ArrayList<String> listaMunicipios = new ArrayList<>();
        listaMunicipios.add("Selecione o municipio");
        for (MunicipioModel municipio : this.municipios) {
            listaMunicipios.add(municipio.getMunicipio());
        }
        return listaMunicipios;
    }

    public ArrayList<String> getListaMunicipioPorEstado (String estado) {
        ArrayList<String> listaMunicipios = new ArrayList<>();
        listaMunicipios.add("Selecione o municipio");
        for (MunicipioModel municipio : this.municipios) {
            if (municipio.getEstado().equals(estado)) {
                listaMunicipios.add(municipio.getMunicipio());
            }
        }
        return listaMunicipios;
    }

    public ArrayList<String> getListaEstado () {
        ArrayList<String> listaEstados = new ArrayList<>();
        listaEstados.add("Selecione o estado");
        for (EstadoModel estado : this.estados) {
            listaEstados.add(estado.getEstado());
        }
        return listaEstados;
    }

    public boolean verificaSeEinicioDaLista(String itemSelecionado) {
        return itemSelecionado.contains("Selecione");
    }

    private void criarRegistrosEndereco() {
        EnderecoModel hospitalACCamargo = new EnderecoModel();
        hospitalACCamargo.setEstado("São Paulo");
        hospitalACCamargo.setMunicipio("São Paulo");
        hospitalACCamargo.setBairro("Liberdade");
        hospitalACCamargo.setLogradouro("R. Prof. Antônio Prudente");
        hospitalACCamargo.setNumero("211");
        cadastrarEndereco(hospitalACCamargo);

        EnderecoModel paoDeAcucar = new EnderecoModel();
        paoDeAcucar.setEstado("Rio de Janeiro");
        paoDeAcucar.setMunicipio("Rio de Janeiro");
        paoDeAcucar.setBairro("Copacabana");
        paoDeAcucar.setLogradouro("Rua Pompeu Loureiro");
        paoDeAcucar.setNumero("15");
        cadastrarEndereco(paoDeAcucar);

        EnderecoModel estadioMunicipalDeCascavel = new EnderecoModel();
        estadioMunicipalDeCascavel.setEstado("Paraná");
        estadioMunicipalDeCascavel.setMunicipio("Cascavel");
        estadioMunicipalDeCascavel.setBairro("Esmeralda");
        estadioMunicipalDeCascavel.setLogradouro("Av. Tito Muffato");
        estadioMunicipalDeCascavel.setNumero("300");
        cadastrarEndereco(estadioMunicipalDeCascavel);

        EnderecoModel hospitalSantaIzabel  = new EnderecoModel();
        hospitalSantaIzabel.setEstado("Bahia");
        hospitalSantaIzabel.setMunicipio("Salvador");
        hospitalSantaIzabel.setBairro("Nazaré");
        hospitalSantaIzabel.setLogradouro("Praça Conselheiro Almeida Couto");
        hospitalSantaIzabel.setNumero("500");
        cadastrarEndereco(hospitalSantaIzabel);

        EnderecoModel nutripaoPadariaEConfeitaria = new EnderecoModel();
        nutripaoPadariaEConfeitaria.setEstado("Rio Grande do Sul");
        nutripaoPadariaEConfeitaria.setMunicipio("Porto Alegre");
        nutripaoPadariaEConfeitaria.setBairro("Cristal");
        nutripaoPadariaEConfeitaria.setLogradouro("R. Dr. Campos Velho");
        nutripaoPadariaEConfeitaria.setNumero("1526");
        cadastrarEndereco(nutripaoPadariaEConfeitaria);
    }

    private void criarRegistrosBairro() {
        BairroModel liberdade = new BairroModel();
        liberdade.setEstado("São Paulo");
        liberdade.setMunicipio("São Paulo");
        liberdade.setBairro("Liberdade");
        cadastrarBairro(liberdade);

        BairroModel copacabana = new BairroModel();
        copacabana.setEstado("Rio de Janeiro");
        copacabana.setMunicipio("Rio de Janeiro");
        copacabana.setBairro("Copacabana");
        cadastrarBairro(copacabana);

        BairroModel cascavel = new BairroModel();
        cascavel.setEstado("Paraná");
        cascavel.setMunicipio("Cascavel");
        cascavel.setBairro("Esmeralda");
        cadastrarBairro(cascavel);

        BairroModel nazare  = new BairroModel();
        nazare.setEstado("Bahia");
        nazare.setMunicipio("Salvador");
        nazare.setBairro("Nazaré");
        cadastrarBairro(nazare);

        BairroModel cristal = new BairroModel();
        cristal.setEstado("Rio Grande do Sul");
        cristal.setMunicipio("Porto Alegre");
        cristal.setBairro("Cristal");
        cadastrarBairro(cristal);
    }

    private void criarRegistrosMunicipio() {
        MunicipioModel saoPaulo = new MunicipioModel();
        saoPaulo.setEstado("São Paulo");
        saoPaulo.setMunicipio("São Paulo");
        cadastrarMunicipio(saoPaulo);

        MunicipioModel rioDeJaneiro = new MunicipioModel();
        rioDeJaneiro.setEstado("Rio de Janeiro");
        rioDeJaneiro.setMunicipio("Rio de Janeiro");
        cadastrarMunicipio(rioDeJaneiro);

        MunicipioModel cascavel = new MunicipioModel();
        cascavel.setEstado("Paraná");
        cascavel.setMunicipio("Cascavel");
        cadastrarMunicipio(cascavel);

        MunicipioModel salvador = new MunicipioModel();
        salvador.setEstado("Bahia");
        salvador.setMunicipio("Salvador");
        cadastrarMunicipio(salvador);

        MunicipioModel portoAlegre = new MunicipioModel();
        portoAlegre.setEstado("Rio Grande do Sul");
        portoAlegre.setMunicipio("Porto Alegre");
        cadastrarMunicipio(portoAlegre);
    }

    private void criarRegistrosEstado() {
        EstadoModel rioDeJaneiro = new EstadoModel();
        rioDeJaneiro.setEstado("Rio de Janeiro");
        cadastrarEstado(rioDeJaneiro);

        EstadoModel saoPaulo = new EstadoModel();
        saoPaulo.setEstado("São Paulo");
        cadastrarEstado(saoPaulo);

        EstadoModel parana = new EstadoModel();
        parana.setEstado("Paraná");
        cadastrarEstado(parana);

        EstadoModel bahia = new EstadoModel();
        bahia.setEstado("Bahia");
        cadastrarEstado(bahia);

        EstadoModel rioGrandeDoSul = new EstadoModel();
        rioGrandeDoSul.setEstado("Rio Grande do Sul");
        cadastrarEstado(rioGrandeDoSul);
    }
}
