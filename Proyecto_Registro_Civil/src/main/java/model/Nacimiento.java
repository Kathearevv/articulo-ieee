package model;

public class Nacimiento extends Acta {
    private Persona nacido;
    private Persona padre;
    private Persona madre;

    public Nacimiento(int numero, String fecha, Persona nacido,
                      Persona padre, Persona madre) {
        super(numero, fecha, "Nacimiento");
        this.nacido = nacido;
        this.padre = padre;
        this.madre = madre;
    }

    public Persona getNacido() {
        return nacido;
    }

    public Persona getPadre() {
        return padre;
    }

    public Persona getMadre() {
        return madre;
    }
}
