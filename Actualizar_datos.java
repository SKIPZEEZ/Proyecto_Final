package jsjs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Actualizar_datos {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actualizar_datos window = new Actualizar_datos();
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
	public Actualizar_datos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 552, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(67, 67, 255));
		panel.setBounds(0, 0, 575, 36);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 78, 112, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido Paterno:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(10, 110, 112, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(10, 178, 112, 21);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo Electronico: ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setBounds(10, 210, 112, 21);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Telefono:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setBounds(10, 242, 112, 21);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(138, 78, 291, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(138, 110, 291, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(138, 178, 291, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(138, 210, 291, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(138, 242, 291, 20);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(247, 87, 87));
		btnNewButton.setBounds(67, 287, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setBackground(new Color(67, 67, 255));
		btnActualizar.setBounds(338, 287, 135, 23);
		frame.getContentPane().add(btnActualizar);
		
		JLabel lblNewLabel_2 = new JLabel("ACTUALIZAR ALUMNO");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(197, 47, 125, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("Apelllido Materno:");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5.setBounds(10, 142, 112, 21);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(138, 141, 291, 20);
		frame.getContentPane().add(textField_5);
	}

}
