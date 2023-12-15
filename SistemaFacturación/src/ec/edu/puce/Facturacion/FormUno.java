package ec.edu.puce.Facturacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class FormUno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormUno frame = new FormUno();
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
	public FormUno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Si o No");
		btnNewButton_1.setBounds(162, 69, 65, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Mensaje");
		btnNewButton.setBounds(162, 10, 71, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Enviar Objeto");
		btnEnviarObjeto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				llamarFormularioDos();
				
			}
		});
		btnEnviarObjeto.setBounds(119, 144, 163, 25);
		getComponentPane().add(btnEnviarObjeto);
	}
	private void name() {
		
	}
}

