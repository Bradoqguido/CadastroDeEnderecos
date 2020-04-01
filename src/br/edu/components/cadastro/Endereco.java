package br.edu.components.cadastro;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JTextField textFieldNumero;
    private JTextField textFieldRua;
    private JPanel panelRua;
    private JPanel panelNumero;
    private JPanel panelComboBoxBairro;
    private JPanel panelComboBoxMunicipio;
    private JPanel panelComboBoxEstado;

    public Endereco() {
        setTitle("Cadastro de Endere\u00E7o");
        inicializarComponents();
        listeners();
    }

    private void inicializarComponents() {
        getContentPane().setLayout(new BorderLayout(0, 0));

        panelCenter = new JPanel(new BorderLayout(0,0));

        panelComboBox = new JPanel(new BorderLayout(0,0));

        panelComboBoxEstado = new JPanel();
        panelComboBoxEstado.setBorder(new TitledBorder(null, "Selecione o Estado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        // comboBoxEstado = new JComboBox();
        panelComboBoxEstado.add(comboBoxEstado);
        panelComboBox.add(panelComboBoxEstado, BorderLayout.WEST);

        panelComboBoxMunicipio = new JPanel();
        panelComboBoxMunicipio.setBorder(new TitledBorder(null, "Selecione o Municipio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        // comboBoxMunicipio = new JComboBox();
        panelComboBoxMunicipio.add(comboBoxMunicipio);
        panelComboBox.add(panelComboBoxMunicipio, BorderLayout.CENTER);

        panelComboBoxBairro = new JPanel();
        panelComboBoxBairro.setBorder(new TitledBorder(null, "Selecione o Bairro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        // comboBoxBairro = new JComboBox();
        panelComboBoxBairro.add(comboBoxBairro);
        panelComboBox.add(panelComboBoxBairro, BorderLayout.EAST);

        panelCenter.add(panelComboBox, BorderLayout.NORTH);

        panelFields = new JPanel(new BorderLayout(0,0));

        panelRua.setBorder(new TitledBorder(null, "Digite o nome da Rua", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        textFieldRua = new JTextField("");
        textFieldRua.setColumns(30);
        panelFields.add(panelRua, BorderLayout.CENTER);

        panelNumero.setBorder(new TitledBorder(null, "Digite o Número", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        textFieldNumero = new JTextField("");
        textFieldNumero.setColumns(5);
        panelFields.add(panelNumero, BorderLayout.EAST);

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

        setSize(500, 175);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void listeners() {
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
