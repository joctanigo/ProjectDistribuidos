package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class princ extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable tabela;

	public static String funcionario;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					princ frame = new princ();
					
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
	public princ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		if (funcionario == "s") {
			JButton button = new JButton("EXCLUIR");
			button.setBounds(322, 227, 102, 23);
			contentPane.add(button);
		
			JButton button_1 = new JButton("ADICIONAR");
			button_1.setBounds(322, 190, 102, 23);
			contentPane.add(button_1);	
			
		}
		
		JButton button_3 = new JButton("PESQUISAR");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_3.setBounds(328, 55, 129, 23);
		contentPane.add(button_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 56, 290, 20);
		contentPane.add(textField);
		
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"codigo", "nome", "tipo", "preco"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabela.setBounds(10, 87, 572, 163);
		contentPane.add(tabela);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(tabela, popupMenu);
		
		JMenuItem mntmComprar = new JMenuItem("COMPRAR");
		popupMenu.add(mntmComprar);
		
		JLabel label = new JLabel("PRODUTOS");
		label.setBounds(10, 11, 78, 14);
		contentPane.add(label);
		
		JRadioButton pCod = new JRadioButton("CODIGO");
		pCod.setBounds(73, 26, 109, 23);
		contentPane.add(pCod);
		
		JRadioButton pNome = new JRadioButton("NOME");
		pNome.setBounds(10, 26, 61, 23);
		contentPane.add(pNome);
		
		JButton btnAdicionar = new JButton("ADICIONAR PRODUTO");
		btnAdicionar.setBounds(10, 285, 201, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.setBounds(467, 55, 115, 23);
		contentPane.add(btnListar);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
