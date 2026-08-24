package model;

public class Defuncion extends Acta {
    private Persona fallecido;
    private String causa;

    public Defuncion(int numero, String fecha, Persona fallecido, String causa) {
        super(numero, fecha, "Defuncion");
        this.fallecido = fallecido;
        this.causa = causa;
    }

    public Persona getFallecido() {
        return fallecido;
    }

    public String getCausa() {
        return causa;
    }
}
