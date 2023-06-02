package jsjs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Crear {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crear window = new Crear();
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
	public Crear() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 591, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(67, 67, 255));
		panel.setBounds(0, 0, 575, 36);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(24, 79, 112, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido Paterno:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(24, 142, 112, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(24, 173, 112, 21);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo Electronico: ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setBounds(24, 204, 112, 21);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Telefono:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setBounds(24, 235, 112, 21);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(143, 79, 291, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 142, 291, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 173, 291, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 204, 291, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(143, 235, 291, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Apelllido Materno:");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5.setBounds(24, 111, 112, 21);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(143, 111, 291, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_2 = new JLabel("AGREGAR ALUMNO");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(228, 47, 125, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.setBackground(new Color(247, 87, 87));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(73, 313, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCrearAlumno = new JButton("CREAR ALUMNO");
		btnCrearAlumno.setBackground(new Color(67, 67, 255));
		btnCrearAlumno.setForeground(new Color(255, 255, 255));
		btnCrearAlumno.setBounds(355, 313, 135, 23);
		frame.getContentPane().add(btnCrearAlumno);
	}
}
