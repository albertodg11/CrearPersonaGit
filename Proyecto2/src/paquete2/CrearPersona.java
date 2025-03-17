package paquete2;

import java.nio.channels.NonWritableChannelException;

public class CrearPersona {

	public static void main(String[] args) {
		Persona persona1 = new Persona("María", 30);
		persona1.mostrarInformacion();
		
		Persona persona2 = new Persona("Juan", 27);
		persona2.mostrarInformacion();
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("ESTUDIANTES");
		System.out.println("-------------------------------------------------------------");
		
		Estudiante estudiante1 = new Estudiante("Ana", 20, "A12345");
		estudiante1.mostrarInformacion();
		
		Estudiante estudiante2 = new Estudiante("Pedro", 18, "B54321");
		estudiante2.mostrarInformacion();
		
		Estudiante estudiante3 = new Estudiante("Elisa", 21, "C11223");
		estudiante3.mostrarInformacion();
		
		System.out.println("----- FIN -----");
		
		
		

	}

}
