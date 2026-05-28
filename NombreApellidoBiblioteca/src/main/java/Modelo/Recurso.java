package Modelo;

import Exceptions.InvalidBorrowAttempException;
import Exceptions.InvalidRegisterException;

public abstract class Recurso {
    private String codigo;
    private String titulo;
    private int añoPublicacion;
    private Disponibilidad disponible;

    public Recurso(String codigo, String tiulo, int añoPublicacion, Disponibilidad disponible){
        this.codigo = codigo;
        this.titulo = titulo;
        if(añoPublicacion <= 1923 ){
             this.disponible = Disponibilidad.NOPRESTABLE;
            throw new InvalidRegisterException("No se puede prestar este libro");
        }
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    private static void verificacionDisponibilidad(Disponibilidad disponible){
        if(disponible == Disponibilidad.PRESTADO){
            throw new InvalidBorrowAttempException("No se puede prestar si ya esta prestado");
        }
    }




    // Herencia de Object: sobreescribimos equals() para comparar por su codigo
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Recurso recurso = (Recurso) obj;
        return codigo.equals(recurso.codigo) ;
    }

    // Buena práctica: siempre sobreescribir hashCode() si sobreescribimos equals()
    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
    // Herencia de Object: sobreescribimos toString() para mostrar los datos
    @Override
    public String toString() {
        return "Titulo: " + titulo +
                "Año de Publicacion: " + añoPublicacion+
                "Codigo: " + codigo;
    }


}
