package br.edu.components.cadastro;

import br.edu.control.Controller;
import br.edu.models.EstadoModel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Municipio extends JFrame {

    private JPanel panelButtons;
    private JPanel panelFields;
    private JTextField textFieldMunicipio;
    private JPanel panelTextField;
    private JPanel panelComboBox;
    private JComboBox comboBoxEstado;
    private JPanel panelComboBoxEstado;
    private JPanel panelComboBoxMunicipio;
    private JComboBox comboBoxMunicipio;
    private JButton cancelarButton;
    private JButton cadastrarButton;
    private JButton salvarEdiçãoButton;
    private JButton consultarButton;
    private JButton excluirButton;

    private Controller controller;
    private ArrayList<EstadoModel> enderecos = new ArrayList<>();

    public Municipio(Controller controller) {
        setTitle("Cadastro de Estado");
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

        panelTextField = new JPanel();
            panelTextField.setBorder(new TitledBorder(null, "Digite o nome do Municipio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
            textFieldMunicipio = new JTextField("");
            textFieldMunicipio.setColumns(30);
        panelTextField.add(textFieldMunicipio);

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
                    textFieldMunicipio.setText(comboBoxMunicipio.getSelectedItem().toString());
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
