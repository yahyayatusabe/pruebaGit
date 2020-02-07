package net.ausiasmarch.calorias.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import net.ausiasmarch.common.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.ausiasmarch.common.Convert;

import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.ausiasmarch.calorias.modelo.*;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JLabel lblFactorDeActividad;
	private JComboBox comboBox_1;
	private JButton btnCalcular;
	private JLabel lblResultado;
	private JTextField textField_3;
	private MetabolismoBasal mtb;
	private TipoActividad tp;
	private JLabel lblNewLabel;
	private JTextField textField_4;
	private JLabel lblKcalParaAdelgazar;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {

		// AQUI DECLARAMOS LAS CLASES COMO OBJETOS

		tp = new TipoActividad();
		mtb = new MetabolismoBasal();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblPeso = new JLabel("Peso");
		GridBagConstraints gbc_lblPeso = new GridBagConstraints();
		gbc_lblPeso.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeso.anchor = GridBagConstraints.EAST;
		gbc_lblPeso.gridx = 0;
		gbc_lblPeso.gridy = 0;
		contentPane.add(lblPeso, gbc_lblPeso);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblAltura = new JLabel("Altura(En \"m\")");
		GridBagConstraints gbc_lblAltura = new GridBagConstraints();
		gbc_lblAltura.anchor = GridBagConstraints.EAST;
		gbc_lblAltura.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltura.gridx = 0;
		gbc_lblAltura.gridy = 1;
		contentPane.add(lblAltura, gbc_lblAltura);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblEdad = new JLabel("Edad");
		GridBagConstraints gbc_lblEdad = new GridBagConstraints();
		gbc_lblEdad.anchor = GridBagConstraints.EAST;
		gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdad.gridx = 0;
		gbc_lblEdad.gridy = 2;
		contentPane.add(lblEdad, gbc_lblEdad);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblGenero = new JLabel("Género");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.EAST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 0;
		gbc_lblGenero.gridy = 3;
		contentPane.add(lblGenero, gbc_lblGenero);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Hombre", "Mujer" }));
		comboBox.setToolTipText("");
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		contentPane.add(comboBox, gbc_comboBox);

		lblFactorDeActividad = new JLabel("Factor de Actividad");
		GridBagConstraints gbc_lblFactorDeActividad = new GridBagConstraints();
		gbc_lblFactorDeActividad.anchor = GridBagConstraints.EAST;
		gbc_lblFactorDeActividad.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactorDeActividad.gridx = 0;
		gbc_lblFactorDeActividad.gridy = 4;
		contentPane.add(lblFactorDeActividad, gbc_lblFactorDeActividad);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "Sedentaria", "Ligera", "Moderada", "Intensa", "Muy Intensa" }));
		comboBox_1.setToolTipText("");
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 4;
		contentPane.add(comboBox_1, gbc_comboBox_1);

		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			/**
			 * AQUI SE: DECLARAMOS TODAS LAS VARIABLES QUE NECESITAMOS BB
			 * 
			 * LES DAMOS LOS DATOS QUE SE VAN A INTRODUCIR EN EL CULO DEL JFRAME,AY PERDON
			 * EN LAS CASILLAS
			 *
			 * JAVI TK
			 *
			 * CON EL GET TRAEMOS LOS DATOS ENVIADOS DE CADA CLASE (MIRAR CADA CLASE)
			 * 
			 * (YA QUEDA POCO) FACILIMENTE NOTAREIS QUE AQUI SE ENVIA EL/LOS RESULTADO/S A
			 * LOS TEXFIELDS CORRESPONDIENTES
			 */
			public void actionPerformed(ActionEvent e) {
				// DECLARAMOS TODAS LAS VARIABLES QUE NECESITAMOS BB
				double Peso, Altura, factor, TMB, TMBresul, TMBresul2;
				int Edad;
				String Genero, FActividad;
				TMB = 0;
				TMBresul = 0;
				factor = 0;
				TMBresul2 = 0;
				/*
				 * AQUI LES DAMOS LOS DATOS QUE SE VAN A INTRODUCIR EN EL CULO DEL JFRAME,AY
				 * PERDON EN LAS CASILLAS
				 */
				Peso = Convert.parseDouble(textField.getText());
				Altura = Convert.parseDouble(textField_1.getText());
				Edad = Convert.parseInt(textField_2.getText());
				Genero = comboBox.getSelectedItem().toString();
				FActividad = comboBox_1.getSelectedItem().toString();

				/*
				 * AQUI PONGO EN PRACTICA LO QUE ME HA ENSEÑADO JAVI ENVIO LOS DATOS A CADA
				 * CLASE CON LOS OBJETOS QUE HE CREADO JAVI TK
				 */
				mtb.setPeso(Peso);
				mtb.setAltura(Altura);
				mtb.setEdad(Edad);
				mtb.setGenero(Genero);
				tp.setNombre(FActividad);

				/*
				 * AQUI CON EL GET TRAEMOS LOS DATOS ENVIADOS DE CADA CLASE (MIRAR CADA CLASE)
				 */
				TMB = mtb.getMtb();
				factor = tp.getFactor();
				TMBresul = TMB * factor;
				TMBresul2 = TMB * 0.8;
				/*
				 * (YA QUEDA POCO) FACILIMENTE NOTAREIS QUE AQUI SE ENVIA EL/LOS RESULTADO/S A
				 * LOS TEXFIELDS CORRESPONDIENTES
				 */
				textField_3.setText(Convert.format(TMB, 1));
				textField_4.setText(Convert.format(TMBresul, 1));
				textField_5.setText(Convert.format(TMBresul2, 1));
			}
		});
		GridBagConstraints gbc_btnCalcular = new GridBagConstraints();
		gbc_btnCalcular.insets = new Insets(0, 0, 5, 0);
		gbc_btnCalcular.gridx = 1;
		gbc_btnCalcular.gridy = 6;
		contentPane.add(btnCalcular, gbc_btnCalcular);

		lblResultado = new JLabel("Tasa de Metabolismo Basal");
		GridBagConstraints gbc_lblResultado = new GridBagConstraints();
		gbc_lblResultado.anchor = GridBagConstraints.EAST;
		gbc_lblResultado.insets = new Insets(0, 0, 5, 5);
		gbc_lblResultado.gridx = 0;
		gbc_lblResultado.gridy = 7;
		contentPane.add(lblResultado, gbc_lblResultado);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 7;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		lblNewLabel = new JLabel("Kcal para mantenerse");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 8;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 8;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		lblKcalParaAdelgazar = new JLabel("Kcal para adelgazar");
		GridBagConstraints gbc_lblKcalParaAdelgazar = new GridBagConstraints();
		gbc_lblKcalParaAdelgazar.anchor = GridBagConstraints.EAST;
		gbc_lblKcalParaAdelgazar.insets = new Insets(0, 0, 0, 5);
		gbc_lblKcalParaAdelgazar.gridx = 0;
		gbc_lblKcalParaAdelgazar.gridy = 9;
		contentPane.add(lblKcalParaAdelgazar, gbc_lblKcalParaAdelgazar);

		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 9;
		contentPane.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

	}

}
