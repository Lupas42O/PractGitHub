//Lucas Sansaturnino Houari
package repasoEntornos;
/**
 * <h2> Clase Alumno </h2>
 * Esta clase simula ser un Alumno
 * 
 * @author Lucas Sansaturnino Houari
 * @version 1.0
 * 
 */
public class Alumno {
	/**
	 * Indica el nº de expediente del alumno
	 */
	int nexp;
	/**
	 * Indica el nombre del alumno
	 */
	String nombre;
	/**
	 * Indica la media final de todas las asignaturas del alumno
	 */
	double mediaFinal;

	public Alumno(int nexp, String nombre, double mediaFinal) {
		super();
		this.nexp = nexp;
		this.nombre = nombre;
		this.mediaFinal = mediaFinal;
	}
	/**
	 * 
	 * @return Devuelve el nº de expediente del alumno
	 */
	public int getNexp() {
		return nexp;
	}
	/**
	 * 
	 * @param nexp Fija el nº de expediente de un alumno
	 */
	public void setNexp(int nexp) {
		this.nexp = nexp;
	}
	/**
	 * 
	 * @return Devuelve el nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre Fija el nombre de un alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return Devuelve la media final de un alumno
	 */
	public double getNotaFinal() {
		return mediaFinal;
	}
	/**
	 * 
	 * @param mediaFinal Fija la media final de un alumno
	 */
	public void setNotaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	
	double calcularNotaFinal(double nota1, double nota2, double nota3) {
		double notaFinal = (nota1 + nota2 + nota3)/3;
		return notaFinal;
	}

}
