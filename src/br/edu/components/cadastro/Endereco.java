package br.edu.components.cadastro;

import br.edu.control.Controller;
import br.edu.models.BairroModel;
import br.edu.models.EnderecoModel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Endereco extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panelCenter;
    private JPanel panelButtons;
    private JButton cadastrarButton;
    private JButton salvarEdiçãoButton;
    private JButton consultarButton;
    private JButton cancelarButton;
    private JButton excluirButton;
    private JPanel panelComboBox;
    private JComboBox comboBoxEstado;
    private JComboBox comboBoxMunicipio;
    private JComboBox comboBoxBairro;
    private JPanel panelFields;
    private JPanel panelFieldsNumero;
    private JComboBox comboBoxNumero;
    private JTextField textFieldNumero;
    private JComboBox comboBoxRua;
    private JPanel panelFieldsRua;
    private JTextField textFieldRua;
    private JPanel panelRua;
    private JPanel panelNumero;
    private JPanel panelComboBoxBairro;
    private JPanel panelComboBoxMunicipio;
    private JPanel panelComboBoxEstado;

    private Controller controller;
    private ArrayList<EnderecoModel> enderecos = new ArrayList<>();

    public Endereco(Controller controller) {
        setTitle("Cadastro de Endere\u00E7o");
        this.controller = controller;
        inicializarComponents();
        listeners();
    }

    private void inicializarComponents() {
        getContentPane().setLayout(new BorderLayout(0, 0));

        panelCenter = new JPanel(new BorderLayout(0,0));
            panelComboBox = new JPanel(new BorderLayout(0,0));
                panelComboBoxEstado = new JPanel();
                    panelComboBoxEstado.setBorder(new TitledBorder(null, "Selecione o Estado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                        comboBoxEstado = new JComboBox(controller.getListaEstado().toArray());
                    panelComboBoxEstado.add(comboBoxEstado);
                panelComboBox.add(panelComboBoxEstado, BorderLayout.WEST);

                panelComboBoxMunicipio = new JPanel();
                    panelComboBoxMunicipio.setBorder(new TitledBorder(null, "Selecione o Municipio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                        comboBoxMunicipio = new JComboBox();
                        comboBoxMunicipio.addItem("Selecione o estado");
                        comboBoxMunicipio.setEnabled(false);
                    panelComboBoxMunicipio.add(comboBoxMunicipio);
                panelComboBox.add(panelComboBoxMunicipio, BorderLayout.CENTER);

                panelComboBoxBairro = new JPanel();
                    panelComboBoxBairro.setBorder(new TitledBorder(null, "Selecione o Bairro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                        comboBoxBairro = new JComboBox();
                        comboBoxBairro.addItem("Selecione o municipio");
                        comboBoxBairro.setEnabled(false);
                    panelComboBoxBairro.add(comboBoxBairro);
                panelComboBox.add(panelComboBoxBairro, BorderLayout.EAST);
            panelCenter.add(panelComboBox, BorderLayout.NORTH);

            panelFields = new JPanel(new BorderLayout(0,0));
                panelFieldsRua = new JPanel(new BorderLayout(0,0));

                    comboBoxRua = new JComboBox();
                        comboBoxRua.setBorder(new TitledBorder(null, "Rua a editar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                        comboBoxRua.addItem("Selecione o bairro");
                        comboBoxRua.setEnabled(false);
                    panelFieldsRua.add(comboBoxRua, BorderLayout.NORTH);

                    panelRua = new JPanel();
                        panelRua.setBorder(new TitledBorder(null, "Digite o nome da Rua", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                        textFieldRua = new JTextField("");
                        textFieldRua.setColumns(25);
                    panelRua.add(textFieldRua);
                    panelFieldsRua.add(panelRua, BorderLayout.SOUTH);
                panelFields.add(panelFieldsRua, BorderLayout.CENTER);

                panelFieldsNumero = new JPanel(new BorderLayout(0,0));

                    comboBoxNumero = new JComboBox();
                    comboBoxNumero.setBorder(new TitledBorder(null, "Número a editar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                        comboBoxNumero.addItem("Selecione o logradouro");
                        comboBoxNumero.setEnabled(false);
                    panelFieldsNumero.add(comboBoxNumero, BorderLayout.NORTH);

                    panelNumero = new JPanel();
                        panelNumero.setBorder(new TitledBorder(null, "Digite o Número", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                        textFieldNumero = new JTextField("");
                        textFieldNumero.setColumns(8);
                    panelNumero.add(textFieldNumero);
                    panelFieldsNumero.add(panelNumero, BorderLayout.SOUTH);

                panelFields.add(panelFieldsNumero, BorderLayout.EAST);
            panelCenter.add(panelFields, BorderLayout.SOUTH);
        getContentPane().add(panelCenter, BorderLayout.CENTER);

        panelButtons = new JPanel(new FlowLayout());
            cadastrarButton = new JButton("Cadastrar");
            panelButtons.add(cadastrarButton);

            salvarEdiçãoButton = new JButton("Salvar Edi\u00E7ão");
            panelButtons.add(salvarEdiçãoButton);

            consultarButton = new JButton("Consultar");
            panelButtons.add(consultarButton);

            excluirButton = new JButton("Excluir");
            panelButtons.add(excluirButton);

            cancelarButton = new JButton("Cancelar");
            panelButtons.add(cancelarButton);
        getContentPane().add(panelButtons, BorderLayout.SOUTH);

        setSize(500, 230);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void listeners() {

        comboBoxEstado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String estado = comboBoxEstado.getSelectedItem().toString();
                if (!controller.verificaSeEinicioDaLista(estado)) {
                    ArrayList<String> municipios = controller.getListaMunicipioPorEstado(estado);
                    for (String municipio : municipios) {
                        comboBoxMunicipio.addItem(municipio);
                    }
                    comboBoxMunicipio.removeItemAt(0);
                    comboBoxMunicipio.setEnabled(true);
                }
            }
        });

        comboBoxMunicipio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String municipio = comboBoxMunicipio.getSelectedItem().toString();
                if (!controller.verificaSeEinicioDaLista(municipio)) {
                    ArrayList<String> bairros = controller.getListaBairroPorMunicipio(municipio);
                    for (String bairro : bairros) {
                        comboBoxBairro.addItem(bairro);
                    }
                    comboBoxBairro.removeItemAt(0);
                    comboBoxBairro.setEnabled(true);
                }
            }
        });

        comboBoxBairro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bairro = comboBoxBairro.getSelectedItem().toString();
                if (!controller.verificaSeEinicioDaLista(bairro)) {
                    ArrayList<String> logradouros = controller.getListaLogradouroPorBairro(bairro);
                    for (String logradouro : logradouros) {
                        comboBoxRua.addItem(logradouro);
                    }
                    comboBoxRua.removeItemAt(0);
                    comboBoxRua.setEnabled(true);
                }
            }
        });

        comboBoxRua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String logradouro = comboBoxRua.getSelectedItem().toString();
                if (!controller.verificaSeEinicioDaLista(logradouro)) {
                    textFieldRua.setText(logradouro);
                    ArrayList<String> numerosRua = controller.getListaNumeroEnderecoPorLogradouro(logradouro);
                    for (String numero : numerosRua) {
                        comboBoxNumero.addItem(numero);
                    }
                    comboBoxNumero.removeItemAt(0);
                    comboBoxNumero.setEnabled(true);
                }
            }
        });

        comboBoxNumero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numero = comboBoxNumero.getSelectedItem().toString();
                if (!controller.verificaSeEinicioDaLista(numero)) {
                    textFieldNumero.setText(numero);
                }
            }
        });


        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        salvarEdiçãoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        consultarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        excluirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }

}
