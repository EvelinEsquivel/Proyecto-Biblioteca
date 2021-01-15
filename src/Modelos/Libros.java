package Modelos;

public class Libros {
    private String titulo;
    private String materia;
    private String autor;
    private int idLibros;
    private int paginas;

    public Libros(String titulo, String materia, String autor, int idLibros, int paginas) {
        this.titulo = titulo;
        this.materia = materia;
        this.autor = autor;
        this.idLibros = idLibros;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdLibros() {
        return idLibros;
    }

    public void setIdLibros(int idLibros) {
        this.idLibros = idLibros;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "titulo='" + titulo + '\'' +
                ", materia='" + materia + '\'' +
                ", autor='" + autor + '\'' +
                ", idLibros=" + idLibros +
                ", paginas=" + paginas +
                '}';
    }
}
