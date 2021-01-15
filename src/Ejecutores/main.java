package Ejecutores;

import Interfaces.IBuscarLibros;
import Interfaces.IPoblarLibros;
import Interfaces.implementacion.BuscarLibrosImpl;
import Interfaces.implementacion.PoblarLibrosImpl;
import Modelos.Libros;
import Modelos.Usuario;

import java.util.List;

public class main {
    public static void main (String[] args){
        IPoblarLibros poblarLibros = new PoblarLibrosImpl();

        List <Libros> libros = poblarLibros.crearlibros();
        System.out.println(libros);
        List<Usuario> usuarios = poblarLibros.crearUsuario();
        System.out.println(usuarios);

        IBuscarLibros buscarLibros = new BuscarLibrosImpl();

        System.out.println(buscarLibros.buscarLibrosPorIdLibros(libros, 1));
        List<Libros> buscarLibrosPorIdLibros = buscarLibros.buscarLibrosPorIdLibros(libros, 1);
        Libros buscarLibro = buscarLibrosPorIdLibros.get(0);
        System.out.println(buscarLibrosPorIdLibros.get(0));

        System.out.println(buscarLibros.buscarLibrosPorMateria(libros, "Matematica"));
        List<Libros> buscarLibrosPorMateria = buscarLibros.buscarLibrosPorMateria(libros, "Matematica");
        System.out.println(buscarLibrosPorMateria);

        System.out.println(buscarLibros.buscarLibrosPorAutor(libros, "Liliana Cuadra"));
        List<Libros> buscarLibrosPorAutor = buscarLibros.buscarLibrosPorAutor(libros, "Liliana Cuadra");
        //Libros buscarLibro2 = buscarLibrosPorAutor.get(1);
        System.out.println(buscarLibrosPorAutor);
    }
}

