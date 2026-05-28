package Modelo;

public class Revista extends Recurso{
    private String numeroEdicion;
    private String editorial;

    public Revista (String codigo, int añoPublicacion,
                    String titulo, Disponibilidad disponible,
                    String numeroEdicion, String editorial){
        super(codigo,titulo, añoPublicacion, disponible);
        this.numeroEdicion = numeroEdicion;
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getNumeroEdicion() {
        return numeroEdicion;
    }

    //No hacemos equal() ni Hashcode(), pq puede haber varias revistas con un mismo numero de edicion

    @Override
    public String toString() {
        return "Editorial: " + editorial +
                "Numero de edicion: " + numeroEdicion;
    }
}
