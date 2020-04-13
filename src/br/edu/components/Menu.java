package br.edu.components;

import br.edu.components.cadastro.Bairro;
import br.edu.components.cadastro.Endereco;
import br.edu.components.cadastro.Estado;
import br.edu.components.cadastro.Municipio;
import br.edu.control.Controller;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame{

	private JMenuBar menuBar;

	private JMenu menuCadastro;
	private JMenuItem menuItemBairro;
	private JMenuItem menuItemEndereco;
	private JMenuItem menuItemEstado;
	private JMenuItem menuItemMunicipio;

	private JMenu menuAjuda;
	private JMenuItem menuItemSair;

	private Controller controller = new Controller();

	public Menu() {
		setTitle("Menu de Op\u00E7\u00F5es");
		inicializarComponents();
		controller.popularComDadosFixos();
		listeners();
	}

	private void inicializarComponents() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuCadastro = new JMenu("Cadastro");
		menuBar.add(menuCadastro);

		menuItemBairro = new JMenuItem("Bairro");
		menuCadastro.add(menuItemBairro);

		menuItemEndereco = new JMenuItem("Endere\u00E7o");
		menuCadastro.add(menuItemEndereco);

		menuItemEstado = new JMenuItem("Estado");
		menuCadastro.add(menuItemEstado);

		menuItemMunicipio = new JMenuItem("Municipio");
		menuCadastro.add(menuItemMunicipio);


		menuAjuda = new JMenu("Ajuda");
		menuBar.add(menuAjuda);

		menuItemSair = new JMenuItem("Sair");
		menuAjuda.add(menuItemSair);


		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
//		setUndecorated(true);
		setResizable(false);
		setVisible(true);
	}

	private void listeners() {

		menuItemBairro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Bairro(controller);
			}
		});

		menuItemEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Endereco(controller);
			}
		});

		menuItemEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Estado(controller);
			}
		});

		menuItemMunicipio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Municipio(controller);
			}
		});

		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);  // Sim N�o Cancelar
			}
		});
	}

	public static void main(String[] args) {
		new Menu();
	}

}
