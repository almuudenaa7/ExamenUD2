package es.oretania;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Formulario {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
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
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 529, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre completo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(21, 51, 103, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(174, 48, 314, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo electrónico:");
		lblCorreoElectrnico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCorreoElectrnico.setBounds(21, 87, 121, 14);
		frame.getContentPane().add(lblCorreoElectrnico);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 84, 314, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblCursoAInscribirse = new JLabel("Curso a inscribirse:");
		lblCursoAInscribirse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCursoAInscribirse.setBounds(21, 122, 121, 14);
		frame.getContentPane().add(lblCursoAInscribirse);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bases de Datos", "Entornos de desarrollo", "Lenguaje de marcas", "Programación en Java"}));
		comboBox.setSelectedIndex(3);
		comboBox.setBounds(174, 118, 314, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblModalidad = new JLabel("Modalidad:");
		lblModalidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModalidad.setBounds(21, 158, 121, 14);
		frame.getContentPane().add(lblModalidad);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Online");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(183, 154, 63, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxIncluyeMaterial = new JCheckBox("Incluye material");
		chckbxIncluyeMaterial.setBounds(245, 154, 112, 23);
		frame.getContentPane().add(chckbxIncluyeMaterial);
		
		JCheckBox chckbxCertificacinAlFinal = new JCheckBox("Certificación al final");
		chckbxCertificacinAlFinal.setBounds(354, 154, 134, 23);
		frame.getContentPane().add(chckbxCertificacinAlFinal);
		
		JLabel lblTurnoDeClases = new JLabel("Turno de clases:");
		lblTurnoDeClases.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTurnoDeClases.setBounds(21, 205, 121, 14);
		frame.getContentPane().add(lblTurnoDeClases);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mañana");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(245, 201, 69, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tarde");
		rdbtnNewRadioButton_1.setBounds(322, 201, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblDuracinsemanas = new JLabel("Duración (semanas):");
		lblDuracinsemanas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDuracinsemanas.setBounds(21, 249, 121, 14);
		frame.getContentPane().add(lblDuracinsemanas);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(6), null, null, Integer.valueOf(1)));
		spinner.setBounds(174, 246, 314, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblComentariosAdicionales = new JLabel("Comentarios adicionales:");
		lblComentariosAdicionales.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComentariosAdicionales.setBounds(14, 334, 150, 14);
		frame.getContentPane().add(lblComentariosAdicionales);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(174, 300, 314, 87);
		frame.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(138, 407, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(237, 407, 89, 23);
		frame.getContentPane().add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(336, 407, 89, 23);
		frame.getContentPane().add(btnSalir);
	}
}
