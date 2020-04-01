package br.edu.components.cadastro;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Municipio extends JFrame {

    private JPanel panelButtons;
    private JPanel panelFields;
    private JTextField textFieldBairro;
    private JButton cancelarButton;
    private JButton cadastrarButton;
    private JButton salvarEdiçãoButton;
    private JButton consultarButton;
    private JButton excluirButton;

    public Municipio() {
        setTitle("Cadastro de Estado");
        inicializarComponents();
        listeners();
    }

    private void inicializarComponents() {
        getContentPane().setLayout(new BorderLayout(0, 0));

        panelFields = new JPanel();
        panelFields.setBorder(new TitledBorder(null, "Digite o nome do Estado", TitledBorder.LEADING, TitledBorder.TOP, null, null));

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

        excluirButton = new JButton("Excluir");
        panelButtons.add(excluirButton);

        cancelarButton = new JButton("Cancelar");
        panelButtons.add(cancelarButton);

        getContentPane().add(panelButtons, BorderLayout.SOUTH);

        setSize(500, 250);
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
