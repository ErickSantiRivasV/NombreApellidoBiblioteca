package Modelo;

public class RecursoDigital extends Recurso{
    private String URL;

    public RecursoDigital(String codigo, String titulo,
                          int añoPublicacion,
                          Disponibilidad disponible, String URL){

        super(codigo, titulo, añoPublicacion, disponible);
        this.URL = URL;
    }


    public String getURL() {
        return URL;
    }
}
