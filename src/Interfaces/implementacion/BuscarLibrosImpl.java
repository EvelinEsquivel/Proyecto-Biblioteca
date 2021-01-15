package Interfaces.implementacion;

import Interfaces.IBuscarLibros;
import Modelos.Libros;
import Modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BuscarLibrosImpl implements IBuscarLibros {


    @Override
    public List<Libros> buscarLibrosPorIdLibros(List<Libros> libros, int idLibros) {
        List<Libros> librosEncontrados = new ArrayList<>();
        for (Libros libro : libros) {
             if (libro.getIdLibros() == (idLibros));
             librosEncontrados.add(libro);
        }

        return librosEncontrados;
    }

    @Override
    public List<Libros> buscarLibrosPorMateria(List<Libros> libros, String materia) {
        List<Libros> librosEncontradosM = new ArrayList<>();
        for (Libros libro : libros) {
            if (libro.getMateria().equals(materia));
            librosEncontradosM.add(libro);
        }

        return librosEncontradosM;
    }

    @Override
    public List<Libros> buscarLibrosPorAutor(List<Libros> libros, String autor) {
        List<Libros> librosEncontradosA = new ArrayList<>();
        for (Libros libro : libros) {
            if (libro.getAutor().equals(autor));
            librosEncontradosA.add(libro);
        }

        return librosEncontradosA;
    }

}
