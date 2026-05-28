import Gestion.GestionRecursos;
import Modelo.*;

public class BiblioApp {
    static void main(String[] args) {
        GestionRecursos gestion = new GestionRecursos();

        try{
            Recurso r1 = new Libro("Pepito", "124543",
                    "1234", "Las aventuras de pepito",
                    2026, Disponibilidad.DISPONIBLE);


            Recurso r2 = new Libro("Franchezco", "12345",
                    "1235","Las avneturas de franchezco",
                    2023, Disponibilidad.PRESTADO);

            Recurso r3 = new RecursoDigital("1243", "####", 2020,
                    Disponibilidad.PRESTADO, "siosi.com");

            Recurso r4 = new RecursoDigital("1985", "####", 2021,
                    Disponibilidad.PRESTADO, "nono.com");

            Recurso r5 = new Revista("0987", 2000, "Lebron",
                    Disponibilidad.NOPRESTABLE, "10", "Los mejores");

            Recurso r6 = new Revista("6755", 2321, "labamba",
                    Disponibilidad.PRESTADO, "11", "Los peores");


        }catch ()
    }
}
