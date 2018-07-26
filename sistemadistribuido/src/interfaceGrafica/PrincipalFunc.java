package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PrincipalFunc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalFunc frame = new PrincipalFunc();
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
	public PrincipalFunc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("PRODUTOS");
		label.setBounds(10, 23, 78, 14);
		contentPane.add(label);
		
		JRadioButton radioButton = new JRadioButton("NOME");
		radioButton.setBounds(10, 38, 61, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("CODIGO");
		radioButton_1.setBounds(73, 38, 109, 23);
		contentPane.add(radioButton_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 68, 290, 20);
		contentPane.add(textField);
		
		table = new JTable();
		table.setBounds(10, 99, 572, 163);
		contentPane.add(table);
		
		JButton button = new JButton("PESQUISAR");
		button.setBounds(328, 67, 129, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("ADICIONAR PRODUTO");
		button_1.setBounds(373, 362, 201, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("LISTAR");
		button_2.setBounds(467, 67, 115, 23);
		contentPane.add(button_2);
		
		JLabel lblNomeProduto = new JLabel("NOME DO PRODUTO");
		lblNomeProduto.setBounds(10, 293, 115, 14);
		contentPane.add(lblNomeProduto);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 311, 340, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("QUANTIDADE");
		lblQuantidade.setBounds(10, 342, 115, 14);
		contentPane.add(lblQuantidade);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 360, 100, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 360, 100, 20);
		contentPane.add(textField_3);
		
		JLabel lblValor = new JLabel("VALOR");
		lblValor.setBounds(135, 342, 115, 14);
		contentPane.add(lblValor);
		
		JLabel lblTipoDeProduto = new JLabel("TIPO DE PRODUTO");
		lblTipoDeProduto.setBounds(373, 293, 115, 14);
		contentPane.add(lblTipoDeProduto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(373, 311, 201, 20);
		contentPane.add(comboBox);
	}
}
