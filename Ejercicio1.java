import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio1 {

	private JFrame frmJazmnlvarezEspinosa;
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
					Ejercicio1 window = new Ejercicio1();
					window.frmJazmnlvarezEspinosa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJazmnlvarezEspinosa = new JFrame();
		frmJazmnlvarezEspinosa.setTitle("Jazmín Álvarez Espinosa");
		frmJazmnlvarezEspinosa.setBounds(100, 100, 450, 300);
		frmJazmnlvarezEspinosa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJazmnlvarezEspinosa.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(26, 37, 46, 14);
		frmJazmnlvarezEspinosa.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(26, 86, 66, 14);
		frmJazmnlvarezEspinosa.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(109, 34, 86, 20);
		frmJazmnlvarezEspinosa.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 83, 86, 20);
		frmJazmnlvarezEspinosa.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(83, 148, 89, 23);
		frmJazmnlvarezEspinosa.getContentPane().add(btnNewButton);
		public void actionPerformed(ActionEvent e) {
			textfield_2.setText("Datos Correctos");
		}
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(275, 148, 89, 23);
		frmJazmnlvarezEspinosa.getContentPane().add(btnNewButton_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Mensaje");
		lblNewLabel_2.setBounds(26, 215, 100, 14);
		frmJazmnlvarezEspinosa.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 212, 288, 20);
		frmJazmnlvarezEspinosa.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
