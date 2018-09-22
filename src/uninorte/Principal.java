package uninorte;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Tom","Doumolin");
		Persona persona2 = new Persona("Nairo","Quintana");
		Persona persona3 = new Persona("Alberto","Contador");
		LinkedList<Persona> listaPersonas =  new LinkedList<Persona>();
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		
		Scanner sc = new Scanner(System.in);
		
		for (Persona persona : listaPersonas) {
			System.out.println("\n\rDe:");
			System.out.println(persona.getNombreCompleto());
			System.out.println("Digite la dirección:");
			persona.setDireccion(sc.nextLine());
			System.out.println("Digite el telefono:");
			persona.setTelefono(sc.nextLine());
			System.out.println("Digite el correo:");
			persona.setCorreo(sc.nextLine());
		}
		sc.close();
		
		for (Persona p : listaPersonas) {
			System.out.println(p.getNombreCompleto()+" | "+p.getDireccion()+" | "+p.getTelefono()+" | "+p.getCorreo());
		}
	}

}
