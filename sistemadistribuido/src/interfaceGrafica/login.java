package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField userlogin;
	private JTextField senha;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("login");
		label.setBounds(170, 49, 86, 14);
		contentPane.add(label);
		
		userlogin = new JTextField();
		userlogin.setColumns(10);
		userlogin.setBounds(170, 74, 86, 20);
		contentPane.add(userlogin);
		
		JLabel label_1 = new JLabel("senha");
		label_1.setBounds(170, 105, 86, 14);
		contentPane.add(label_1);
		
		senha = new JTextField();
		senha.setColumns(10);
		senha.setBounds(170, 126, 86, 20);
		contentPane.add(senha);
		
		JButton button = new JButton("ENTRAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				princ principal = new princ();
				if(userlogin.getText().equals("func")  && senha.getText().equals("123")) {
					principal.funcionario = "s";
					principal.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				    principal.setVisible(true);
				}else if (userlogin.getText().equals("cliente")&&senha.getText().equals("123")) {
					principal.funcionario = "n";
					principal.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				    principal.setVisible(true);
				}else {
					Component parentComponent = null;
					JOptionPane.showMessageDialog(parentComponent, "Usuario ou senha incorretos");
					
				}
				
			}
		});
		button.setBounds(170, 157, 89, 23);
		contentPane.add(button);
	}

}
