package uninorte;

import java.util.LinkedList;

public class Estudiante extends Persona{
	LinkedList<String> programas;
	public Estudiante(String nombre, String apellido) {
		super(nombre, apellido);
		this.programas = new LinkedList<String>();
	}
	public LinkedList<String> getProgramas() {
		return programas;
	}
	public void setProgramas(LinkedList<String> programas) {
		this.programas = programas;
	}
}
