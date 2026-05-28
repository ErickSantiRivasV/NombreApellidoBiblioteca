package Modelo;

public class Libro extends Recurso{
    private String autor;
    private String ISBN;

    public Libro(String autor, String ISBN, String codigo, String titulo, int añoPublicacion, Disponibilidad disponibilidad){
        super(codigo, titulo, añoPublicacion, disponibilidad);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Autor: " + autor + "ISBN: " + ISBN;
    }
}
