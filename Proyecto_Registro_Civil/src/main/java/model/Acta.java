package model;

public class Acta implements Validable {
    private int numeroActa;
    private int folio;
    private String fechaRegistro;

    public Acta(int numeroActa, int folio, String fechaRegistro) {
        this.numeroActa = numeroActa;
        this.folio = folio;
        this.fechaRegistro = fechaRegistro;
    }

    public int getNumeroActa() {
        return numeroActa;
    }

    public int getFolio() {
        return folio;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    // Método obligatorio implementado desde la interfaz Validable
    @Override
    public boolean validar() {
        return this.numeroActa > 0 && this.folio > 0 && this.fechaRegistro != null;
    }
}