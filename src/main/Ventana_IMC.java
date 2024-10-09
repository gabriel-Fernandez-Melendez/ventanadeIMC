package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class Ventana_IMC {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_IMC window = new Ventana_IMC();
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
	public Ventana_IMC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 592, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int sleepSense = slider.getValue();
				textField_1.setText(""+sleepSense);
				
			}
		});
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(10);
		slider.setBounds(132, 57, 334, 58);
		frame.getContentPane().add(slider);
		
		
		JLabel lblNewLabel = new JLabel("Peso");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(34, 78, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(34, 174, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(104, 173, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("en cm");
		lblNewLabel_2.setBounds(223, 176, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.setBounds(282, 174, 184, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(476, 77, 68, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(476, 173, 68, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kg");
		lblNewLabel_3.setBounds(549, 80, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(549, 176, 49, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
	}
}
