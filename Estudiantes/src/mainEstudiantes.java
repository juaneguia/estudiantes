import java.util.ArrayList;

public class mainEstudiantes {

	public static void main(String[] args) {
		
		ArrayList<Estudiantes> estudiantes = new ArrayList<>();
		
		Estudiantes e1 = new Estudiantes("Juan", "Eguia", 8.5);
		Estudiantes e2 = new Estudiantes("Valen", "Fala", 5.0);
		Estudiantes e3 = new Estudiantes("Aguante", "Gengar", 9.0);
		Estudiantes e4 = new Estudiantes("Javo", "Milei", 10.0);
		Estudiantes e5 = new Estudiantes("Ash", "Ketchup", 6.0);
		
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		estudiantes.add(e4);
		estudiantes.add(e5);
		
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println("Estudiante: " + estudiantes.get(i).toString());
		}
		
		e1.setCalificacion(7.0);
		System.out.println(e1);
		
		estudiantes.remove(e1);
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println("Estudiante: " + estudiantes.get(i).toString());
		}
		
	}

}
