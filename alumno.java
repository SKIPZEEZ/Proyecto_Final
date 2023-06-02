package jsjs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class alumno {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alumno window = new alumno();
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
	public alumno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(207, 43, 127, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ALUMNO");
		lblNewLabel_1.setBackground(new Color(67, 67, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(121, 86, 97, 74);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DOCENTE");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(326, 86, 97, 74);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("ALUMNO");
		btnNewButton.setBackground(new Color(67, 67, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(121, 184, 97, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DOCENTE");
		btnNewButton_1.setBackground(new Color(67, 67, 255));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(326, 184, 97, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SALIR");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(247, 87, 87));
		btnNewButton_2.setBounds(217, 244, 104, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(67, 67, 255));
		panel.setBounds(0, 0, 544, 32);
		frame.getContentPane().add(panel);
	}

}
