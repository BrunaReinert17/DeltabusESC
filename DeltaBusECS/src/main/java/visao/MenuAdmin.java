package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utilidades.RoundButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class MenuAdmin extends JFrame {

	private JPanel contentPane;
	private RoundButton btnCadastrarUsuarios;
	private RoundButton btnVerificar;
	private RoundButton bntLogout;
	private JPanel panelTeste;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin frame = new MenuAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuAdmin() {
		System.out.println(MenuAdmin.class.getResource("/imagem/logoampliada.png"));
		setExtendedState(MAXIMIZED_BOTH);
		setTitle("Principal Administrador");
		setTitle("Menu");
		setBackground(new Color(51, 102, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2000, 1500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				CadastrarUsuario panelUsuario = new CadastrarUsuario();
				panelUsuario.setToolTipText("");
				panelUsuario.setLocation(579, 97);
				panelTeste = panelUsuario;
				panelTeste.setBounds(568, 104, 1200, 800);
				panelTeste.setVisible(true);
				
						contentPane.add(panelTeste);
		
	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 376, 1061);
		contentPane.add(panel);
		panel.setLayout(null);

		btnVerificar = new RoundButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
				
				JLabel lblNewLabel_7 = new JLabel("");
				lblNewLabel_7.setBounds(95, 780, 119, 43);
				panel.add(lblNewLabel_7);
				lblNewLabel_7.setIcon(new ImageIcon(MenuAdmin.class.getResource("/imagens/icone3.png")));
				
				JLabel lblNewLabel_6 = new JLabel("");
				lblNewLabel_6.setBounds(99, 338, 115, 42);
				panel.add(lblNewLabel_6);
				lblNewLabel_6.setIcon(new ImageIcon(MenuAdmin.class.getResource("/imagens/IconeHome.png")));

				
				JLabel lblNewLabel_5 = new JLabel("");
				lblNewLabel_5.setBounds(46, 530, 141, 33);
				panel.add(lblNewLabel_5);

				
				JLabel lblNewLabel_4 = new JLabel("");
				lblNewLabel_4.setBounds(36, 596, 92, 33);
				panel.add(lblNewLabel_4);

		
				JLabel lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setBounds(-395, 421, 523, 73);
				panel.add(lblNewLabel_3);

		btnVerificar.setForeground(Color.WHITE);
		btnVerificar.setFont(new Font("Dialog", Font.BOLD, 16));
		btnVerificar.setBackground(new Color(0, 128, 128));
		btnVerificar.setBounds(90, 596, 199, 43);
		panel.add(btnVerificar);

		JLabel lblNewLabel_1 = new JLabel("Bem Vindo: Administrador");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(109, 275, 184, 18);
		panel.add(lblNewLabel_1);


		btnCadastrarUsuarios = new RoundButton("Cadastro de Usuário");
		btnCadastrarUsuarios.setHorizontalAlignment(SwingConstants.RIGHT);
		btnCadastrarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelTeste.setVisible(true);
			}
		});
		btnCadastrarUsuarios.setForeground(new Color(0, 0, 0));
		btnCadastrarUsuarios.setFont(new Font("Dialog", Font.BOLD, 16));
		btnCadastrarUsuarios.setBackground(new Color(0, 128, 128));
		btnCadastrarUsuarios.setBounds(90, 457, 199, 43);
		panel.add(btnCadastrarUsuarios);

		btnCadastrarUsuarios.setForeground(Color.WHITE);
		btnCadastrarUsuarios.setFont(new Font("Dialog", Font.BOLD, 15));
		btnCadastrarUsuarios.setBackground(new Color(0, 128, 128));
		btnCadastrarUsuarios.setBounds(90, 457, 199, 43);
		panel.add(btnCadastrarUsuarios);

		RoundButton rndbtnListar = new RoundButton("Listar");
		rndbtnListar.setHorizontalAlignment(SwingConstants.RIGHT);
		rndbtnListar.setText("Listagem de Usuários");
		rndbtnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelTeste.setVisible(false);
				ListarUsuario listarUsuario = new ListarUsuario();
				listarUsuario.setLocationRelativeTo(null);
				listarUsuario.setVisible(true);

			}
		});
		rndbtnListar.setForeground(Color.WHITE);
		rndbtnListar.setFont(new Font("Dialog", Font.BOLD, 15));
		rndbtnListar.setBackground(new Color(0, 128, 128));
		rndbtnListar.setBounds(90, 530, 199, 43);
		panel.add(rndbtnListar);

		JButton btnLogout = new RoundButton("Logout");
		btnLogout.setText("");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login telaLogin = new Login();
				telaLogin.setLocationRelativeTo(null);
				telaLogin.setVisible(true);
				dispose();
			}
		});
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(109, 769, 146, 54);
		panel.add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-395, 411, 533, 79);
		panel.add(lblNewLabel);

		
		RoundButton btnHome = new RoundButton("Logout");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuAdmin telaPrincipal = new MenuAdmin();
				telaPrincipal.setLocationRelativeTo(null);
				telaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnHome.setText("");
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		btnHome.setBackground(Color.WHITE);
		btnHome.setBounds(162, 337, 64, 43);
		panel.add(btnHome);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(-786, 74, 1105, 190);
		panel.add(lblNewLabel_8);
		lblNewLabel_8.setIcon(new ImageIcon(MenuAdmin.class.getResource("/imagens/perfil.png")));

	}
}