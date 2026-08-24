import model.*;

public class Main {

    public static void main(String[] args) {

        Persona padre = new Persona(1, "Mauricio", "Flores", "33333");
        Persona madre = new Persona(2, "Valeria", "Mendoza", "44444");
        Persona bebe = new Persona(3, "Sofia", "Flores Mendoza", "55555");

        Nacimiento actaNacimiento = new Nacimiento(
                1,
                "20/08/2026",
                bebe,
                padre,
                madre
        );

        Libro libro = new Libro(1, "2026");
        libro.agregarActa(actaNacimiento);

        RegistroCivil registro = new RegistroCivil("Registro Civil");
        registro.agregarLibro(libro);

        System.out.println("Sistema de Registro Civil");
        System.out.println("Registro: " + registro.getNombre());
        System.out.println("Persona registrada: " + bebe);
        System.out.println("Acta: " + actaNacimiento);
        System.out.println("Libro: " + libro.getNumero());
    }
}
