import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtProduto;
	private JTextField txtQntd;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel tlPrincipal = new JPanel();
		tlPrincipal.setBounds(10, 31, 481, 312);
		contentPane.add(tlPrincipal);
		tlPrincipal.setLayout(null);
		
		txtID = new JTextField();
		txtID.setBounds(152, 14, 176, 20);
		tlPrincipal.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(66, 17, 76, 14);
		tlPrincipal.add(lblID);
		
		JLabel lblProduto = new JLabel("PRODUTO");
		lblProduto.setBounds(66, 51, 73, 14);
		tlPrincipal.add(lblProduto);
		
		txtProduto = new JTextField();
		txtProduto.setBounds(152, 48, 176, 20);
		tlPrincipal.add(txtProduto);
		txtProduto.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("QUANTIDADE");
		lblQuantidade.setBounds(66, 87, 137, 14);
		tlPrincipal.add(lblQuantidade);
		
		txtQntd = new JTextField();
		txtQntd.setBounds(152, 84, 176, 20);
		tlPrincipal.add(txtQntd);
		txtQntd.setColumns(10);
		
		JLabel lblValor = new JLabel("PREÇO");
		lblValor.setBounds(67, 124, 46, 14);
		tlPrincipal.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(152, 121, 176, 20);
		tlPrincipal.add(txtValor);
		txtValor.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().isEmpty()) 
				{
					
					JOptionPane.showMessageDialog(null, "Digite um ID pro produto");
					txtID.requestFocus();
				
				}
				
				else if (txtProduto.getText().isEmpty()) 
				{
					
					JOptionPane.showMessageDialog(null, "Digite o nome do produto");
					txtProduto.requestFocus();
				
				}
				else if (txtQntd.getText().isEmpty()) 
				{
					
					JOptionPane.showMessageDialog(null, "Digite a quantidade de produtos");
					txtQntd.requestFocus();
				
				}
				else if (txtValor.getText().isEmpty()) 
				{
					
					JOptionPane.showMessageDialog(null, "Digite o valor do produto");
					txtValor.requestFocus();
				}
				
			}
		});
		btnConfirmar.setBounds(334, 198, 118, 23);
		tlPrincipal.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(206, 198, 118, 23);
		tlPrincipal.add(btnCancelar);
		
		JLabel lblCadastro_Produto = new JLabel("Cadastro de produtos");
		lblCadastro_Produto.setBounds(192, 6, 176, 14);
		contentPane.add(lblCadastro_Produto);
	}
}
