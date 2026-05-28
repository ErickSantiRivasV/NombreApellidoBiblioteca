package Gestion;
import Catalog.GenericCatalog;
import Exceptions.*;
import Modelo.*;
import Gestion.GestionRecursos;

import java.util.Optional;

public class GestionRecursos {
    //Agregar recursos

    private GenericCatalog<Recurso> catalogoRecursos;

        public GestionRecursos() {
            catalogoRecursos = new GenericCatalog<>();
        }

        public void agregarRecurso(Recurso recurso)throws InvalidRegisterException {

            Optional<Recurso> recursoExistente = catalogoRecursos.findByPredicate
                    (r ->r.getCodigo().equals(recurso.getCodigo()));

            if(recursoExistente.isPresent()){
                throw new InvalidRegisterException("Ya existe el recurso");
            }

            catalogoRecursos.add(recurso);
        }

        public void eliminarRecurso(Recurso recurso)throws InvalidRegisterException {

        Optional<Recurso> recursoExistente = catalogoRecursos.findByPredicate
                (r ->r.getCodigo().equals(recurso.getCodigo()));

        catalogoRecursos.delete(r ->r.getCodigo().equals(recurso.getCodigo()));


     }
        }


