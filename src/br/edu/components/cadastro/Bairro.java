package br.edu.components.cadastro;

import br.edu.control.Controller;
import br.edu.models.BairroModel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Bairro extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panelButtons;
    private JPanel panelFields;
    private JPanel panelTextField;
    private JPanel panelComboBox;
    private JComboBox comboBoxEstado;
    private JPanel panelComboBoxEstado;
    private JPanel panelComboBoxMunicipio;
    private JComboBox comboBoxMunicipio;
    private JPanel panelComboBoxBairro;
    private JComboBox comboBoxBairro;
    private JTextField textFieldBairro;
    private JButton cancelarButton;
    private JButton cadastrarButton;
    private JButton salvarEdiçãoButton;
    private JButton consultarButton;
    private JButton excluirButton;

    private Controller controller;
    private ArrayList<BairroModel> bairros = new ArrayList<>();

    public Bairro(Controller controller) {
        setTitle("Cadastro de Bairro");
        this.controller = controller;
        inicializarComponents();
        listeners();
    }

    private void inicializarComponents() {
        getContentPane().setLayout(new BorderLayout(0, 0));

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

        panelTextField = new JPanel();
            panelTextField.setBorder(new TitledBorder(null, "Digite o nome do Bairro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
            textFieldBairro = new JTextField("");
            textFieldBairro.setColumns(30);
        panelTextField.add(textFieldBairro);

        panelFields = new JPanel(new BorderLayout(0, 0));
            panelFields.add(panelComboBox, BorderLayout.NORTH);
            panelFields.add(panelTextField, BorderLayout.SOUTH);
        getContentPane().add(panelFields, BorderLayout.CENTER);

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

        setSize(500, 200);
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
                    textFieldBairro.setText(bairro);
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
