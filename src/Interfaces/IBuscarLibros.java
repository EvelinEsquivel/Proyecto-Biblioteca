package Interfaces;

import Modelos.Libros;
import Modelos.Usuario;

import java.util.List;

public interface IBuscarLibros {

    List<Libros> buscarLibrosPorIdLibros(List<Libros> libros, int idLibros);

    List<Libros> buscarLibrosPorMateria(List<Libros> libros, String materia);

    List<Libros> buscarLibrosPorAutor(List<Libros> libros, String autor);

}
