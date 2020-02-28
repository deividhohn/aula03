import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Carro {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carro window = new Carro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Carro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 664, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 612, 415);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Cadastro de carro", null, panel, null);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(65, 20, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBounds(10, 23, 45, 13);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 54, 96, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 57, 45, 13);
		panel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 83, 96, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Marca");
		lblNewLabel_2.setBounds(10, 80, 45, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Modelo");
		lblNewLabel_3.setBounds(10, 118, 45, 13);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(65, 115, 96, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Pre\u00E7o");
		lblNewLabel_4.setBounds(10, 154, 45, 13);
		panel.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(65, 151, 96, 19);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(109, 180, 96, 19);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Valor de loca\u00E7\u00E3o");
		lblNewLabel_5.setBounds(10, 177, 89, 13);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(10, 213, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exibir Informa\u00E7\u00E3o");
		btnNewButton_1.setBounds(109, 209, 125, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Editar Valor da Loca\u00E7\u00E3o");
		btnNewButton_2.setBounds(244, 213, 153, 21);
		panel.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Loca\u00E7\u00F5es", null, panel_2, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Cadastro Usu\u00E1rio", null, panel_1, null);
		panel_1.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setBounds(80, 29, 96, 19);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nome");
		lblNewLabel_6.setBounds(10, 32, 45, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sobrenome");
		lblNewLabel_7.setBounds(10, 64, 60, 13);
		panel_1.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(80, 58, 96, 19);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(80, 100, 96, 19);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("CNH");
		lblNewLabel_8.setBounds(10, 103, 45, 13);
		panel_1.add(lblNewLabel_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(104, 137, 96, 19);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Data de Nascimento");
		lblNewLabel_9.setBounds(0, 140, 94, 13);
		panel_1.add(lblNewLabel_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(104, 179, 96, 19);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Telefone");
		lblNewLabel_10.setBounds(10, 182, 60, 13);
		panel_1.add(lblNewLabel_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(80, 225, 96, 19);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("E-mail");
		lblNewLabel_11.setBounds(10, 228, 45, 13);
		panel_1.add(lblNewLabel_11);
		
		textField_12 = new JTextField();
		textField_12.setBounds(238, 100, 72, 19);
		panel_1.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Categoria");
		lblNewLabel_12.setBounds(186, 103, 60, 13);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Rua");
		lblNewLabel_13.setBounds(339, 32, 45, 13);
		panel_1.add(lblNewLabel_13);
		
		textField_13 = new JTextField();
		textField_13.setBounds(394, 29, 96, 19);
		panel_1.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Complemento");
		lblNewLabel_14.setBounds(265, 64, 65, 13);
		panel_1.add(lblNewLabel_14);
		
		textField_14 = new JTextField();
		textField_14.setBounds(339, 61, 96, 19);
		panel_1.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("CEP");
		lblNewLabel_15.setBounds(445, 64, 45, 13);
		panel_1.add(lblNewLabel_15);
		
		textField_15 = new JTextField();
		textField_15.setBounds(479, 61, 96, 19);
		panel_1.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(358, 100, 96, 19);
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Cidade");
		lblNewLabel_16.setBounds(320, 103, 45, 13);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Estado");
		lblNewLabel_17.setBounds(464, 103, 45, 13);
		panel_1.add(lblNewLabel_17);
		
		textField_17 = new JTextField();
		textField_17.setBounds(501, 100, 96, 19);
		panel_1.add(textField_17);
		textField_17.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Exibir Informa\u00E7\u00F5es");
		btnNewButton_3.setBounds(283, 178, 161, 21);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cadastrar Usuario");
		btnNewButton_4.setBounds(451, 178, 135, 21);
		panel_1.add(btnNewButton_4);
	}
}
