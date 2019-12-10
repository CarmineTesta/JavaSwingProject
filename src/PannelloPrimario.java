import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class PannelloPrimario extends JFrame {

	private JPanel contentPane;
	FinestraPrimariaController controllerPannello = new FinestraPrimariaController();

	private JTextField nomeTextField;
	private JTextField cognomeTextField;
	private JTextField matricolaTextField;

	private JButton bottoneStampa;
	private JButton bottoneSalva;
	
	
	
	
	public PannelloPrimario(FinestraPrimariaController controllerPannelloLocale) {
		controllerPannello = controllerPannelloLocale;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bottoneSalva = new JButton("Salva");
		bottoneSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		bottoneSalva.setBounds(303, 210, 89, 23);
		contentPane.add(bottoneSalva);
		
		nomeTextField = new JTextField();
		nomeTextField.setBounds(20, 35, 150, 20);
		contentPane.add(nomeTextField);
		nomeTextField.setColumns(10);
		
		bottoneStampa = new JButton("Stampa");
		bottoneStampa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bottoneStampa.setBounds(204, 210, 89, 23);
		contentPane.add(bottoneStampa);
		
		cognomeTextField = new JTextField();
		cognomeTextField.setColumns(10);
		cognomeTextField.setBounds(20, 85, 150, 20);
		contentPane.add(cognomeTextField);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNome.setBounds(20, 15, 40, 20);
		contentPane.add(lblNome);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblCognome.setBounds(20, 70, 75, 15);
		contentPane.add(lblCognome);
		
		JLabel lblMatricola = new JLabel("Matricola");
		lblMatricola.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblMatricola.setBounds(20, 125, 70, 15);
		contentPane.add(lblMatricola);
		
		matricolaTextField = new JTextField();
		matricolaTextField.setBounds(20, 140, 150, 20);
		contentPane.add(matricolaTextField);
		matricolaTextField.setColumns(10);
	}
}
