package net.ausiasmarch.calorias.modelo;
/**
 * DECLARAMOS LAS VARIABLES QUE VAMOS A UTILIZAR PARA LAS OPERACIONES
 * (ESTO ES UN COPIA Y PEGA)
 * @author a0x3572451e
 *
 */
public class TipoActividad {
	
	/*
	 * DECLARAMOS LAS VARIABLES QUE VAMOS A UTILIZAR PARA LAS OPERACIONES
	 * (ESTO ES UN COPIA Y PEGA)
	 */
	 String nombre;
	 double factor;
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * ESTOS SON LOS IF`S PARA DAR VALOR AL FACTOR ACTIVIDAD
	 * ESCOGIDO
	 * @return
	 */
	public Double getFactor() {
		/*
		 * ESTOS SON LOS IF`S PARA DAR VALOR AL FACTOR ACTIVIDAD
		 * ESCOGIDO
		 */
		if (nombre.equalsIgnoreCase("Sedentaria"))
			factor=1.2;
		else if (nombre.equalsIgnoreCase("Ligera"))
			factor=1.375;
		else if (nombre.equalsIgnoreCase("Moderada"))
			factor=1.55;	
		else if (nombre.equalsIgnoreCase("Intensa "))
			factor=1.725;		
		else if (nombre.equalsIgnoreCase("Muy Intensa"))
			factor=1.9;
		else;

		
		return factor;
	}
	public void setFactor(Double factor) {
		this.factor = factor;
	}
	

	
	
	

}
