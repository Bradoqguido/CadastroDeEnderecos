package br.edu.components.cadastro;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bairro extends JFrame{

    private JPanel panelPrincipal;
    private JPanel panelButtons;
    private JPanel panelFields;
    private JTextField textFieldBairro;
    private JComboBox comboBoxBairros;
    private JButton cancelarButton;
    private JButton cadastrarButton;
    private JButton salvarEdiçãoButton;
    private JButton consultarButton;

    public Bairro() {
        setTitle("Cadastro de Bairro");
        //"Menu de Op\u00E7\u00F5es"
        inicializarComponents();
        listeners();
    }

    private void inicializarComponents() {
        getContentPane().setLayout(new BorderLayout(0, 0));

        panelFields = new JPanel();
        panelFields.setBorder(new TitledBorder(null, "Digite o nome do Bairro", TitledBorder.LEADING, TitledBorder.TOP, null, null));

        textFieldBairro = new JTextField("");
        textFieldBairro.setColumns(30);
        panelFields.add(textFieldBairro);

        getContentPane().add(panelFields, BorderLayout.CENTER);

        panelButtons = new JPanel(new FlowLayout());

        cadastrarButton = new JButton("Cadastrar");
        panelButtons.add(cadastrarButton);

        salvarEdiçãoButton = new JButton("Salvar Edi\u00E7ão");
        panelButtons.add(salvarEdiçãoButton);

        consultarButton = new JButton("Consultar");
        panelButtons.add(consultarButton);

        cancelarButton = new JButton("Cancelar");
        panelButtons.add(cancelarButton);

        getContentPane().add(panelButtons, BorderLayout.SOUTH);

        setSize(450, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void listeners() {

        textFieldBairro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

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

        cancelarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}