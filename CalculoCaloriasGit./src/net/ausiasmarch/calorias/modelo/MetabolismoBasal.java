package net.ausiasmarch.calorias.modelo;

import net.ausiasmarch.common.Convert;
/**
 * DECLARAMOS LAS VARIABLES QUE VAMOS A UTILIZAR PARA LAS OPERACIONES
 * @author a0x3572451e
 *
 */
public class MetabolismoBasal {
	/*
	 * DECLARAMOS LAS VARIABLES QUE VAMOS A UTILIZAR PARA LAS OPERACIONES
	 */
	private double Peso, Altura;
	
	private int Edad;

	private String Genero,FActividad;

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}
	
	public double getMtb() {
		double TMB=0;
		/*
		 * GRACIAS POR VENIR A MIRAR A ESTA CLASE,
		 * AQUI HACEMOS LA OPERACION DEL CALCULO DEL METABOLISMO BASAL
		 */
		if (Genero.equalsIgnoreCase("Hombre"))
			TMB=5;
		else if (Genero.equalsIgnoreCase("Mujer"))
			TMB=-161;
		double TMBfactor= (10*Peso) + (6.25*(Altura*100)) - (5*Edad) +(TMB);
		
		
		return TMBfactor;
	}
	
	/*
	 * HOLA JAVI
	 */
	
	

}
