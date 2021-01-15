package Interfaces.implementacion;

import Interfaces.IBuscarLibros;
import Interfaces.IPoblarLibros;
import Modelos.Libros;
import Modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class PoblarLibrosImpl implements IPoblarLibros {
    @Override
    public List<Libros> crearlibros() {

        List <Libros> libros = new ArrayList<>();

        Libros libros1 = new Libros( "Climas", "Biologia","Eugenia Ramos",1, 220);
        Libros libros2 = new Libros( "Geometria", "Matematica","Liliana Cuadra",    2, 281);
        Libros libros3 = new Libros( "Fascismo", "Historia","Blas Castro",10, 315);
        Libros libros4 = new Libros( "Verbos", "Lengua","Selva Barrios",5, 150);
        Libros libros5 = new Libros( "Sonidos", "Fisica","Gustavo Rincon",3, 411);


        libros.add(libros1);
        libros.add(libros2);
        libros.add(libros3);
        libros.add(libros4);
        libros.add(libros5);

        return libros;
    }

    @Override
    public List<Usuario> crearUsuario() {

        List <Usuario> usuarios = new ArrayList<>();

        Usuario Usuario1 = new Usuario("Marcelo", "Lopez", 22344);
        Usuario Usuario2 = new Usuario("Nora", "Casco", 22345);
        Usuario Usuario3 = new Usuario("Lety", "Prieto", 22346);


        usuarios.add(Usuario1);
        usuarios.add(Usuario2);
        usuarios.add(Usuario3);


        return usuarios;
    }
}
