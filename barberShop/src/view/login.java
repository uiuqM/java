package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField campoUusuario;
	private JTextField campoSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		campoSenha = new JTextField();
		campoSenha.setColumns(10);
		campoSenha.setBounds(206, 353, 192, 34);
		contentPane.add(campoSenha);
		
		campoUusuario = new JTextField();
		campoUusuario.setBounds(206, 249, 192, 34);
		contentPane.add(campoUusuario);
		campoUusuario.setColumns(10);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setForeground(Color.WHITE);
		labelSenha.setFont(new Font("Monospaced", Font.BOLD, 38));
		labelSenha.setBounds(226, 271, 202, 97);
		contentPane.add(labelSenha);
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setForeground(Color.WHITE);
		labelLogin.setFont(new Font("Monospaced", Font.BOLD, 38));
		labelLogin.setBounds(244, 102, 143, 97);
		contentPane.add(labelLogin);
		
		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(Color.WHITE);
		labelUsuario.setFont(new Font("Monospaced", Font.BOLD, 38));
		labelUsuario.setBounds(216, 163, 202, 97);
		contentPane.add(labelUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\downloads\\output-onlinepngtools.png"));
		lblNewLabel_1.setBounds(111, 127, 379, 343);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(-64, 0, 720, 636);
		lblNewLabel.setIcon(new ImageIcon("D:\\projetoBarbearia\\logo.jpg"));
		contentPane.add(lblNewLabel);
	}
}
