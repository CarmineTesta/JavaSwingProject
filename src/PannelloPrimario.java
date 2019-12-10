import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PannelloPrimario extends JFrame {

	private JPanel contentPane;
	FinestraPrimariaController controllerPannello = new FinestraPrimariaController();
	private JTextField campoDaRiempire;
	
	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PannelloPrimario frame = new PannelloPrimario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public PannelloPrimario(FinestraPrimariaController controllerPannelloLocale) {
		controllerPannello = controllerPannelloLocale;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BottoneFighissimo = new JButton("Premi ");
		BottoneFighissimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(campoDaRiempire.getText());
				controllerPannello.creaStudente(campoDaRiempire.getText());
				
			}
		});
		BottoneFighissimo.setBounds(303, 210, 89, 23);
		contentPane.add(BottoneFighissimo);
		
		campoDaRiempire = new JTextField();
		campoDaRiempire.setBounds(30, 30, 86, 20);
		contentPane.add(campoDaRiempire);
		campoDaRiempire.setColumns(10);
	}
}
