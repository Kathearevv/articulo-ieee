package model;

public class Acta {
    private int numero;
    private String fecha;
    private String tipo;

    public Acta(int numero, String fecha, String tipo) {
        this.numero = numero;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Acta #" + numero + " - " + tipo + " - " + fecha;
    }
}
