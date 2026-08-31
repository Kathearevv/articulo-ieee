package model;

public abstract class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String documento;

    public Persona(int id, String nombre, String apellido, String documento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - " + documento;
    }
}

