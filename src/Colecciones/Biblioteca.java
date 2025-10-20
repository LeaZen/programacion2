
package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class Biblioteca {
     private String nombre;
        private List<Libro> libros = new ArrayList<>();

        public Biblioteca(String nombre) {
            this.nombre = nombre;
        }

        public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
            Libro l = new Libro(isbn, titulo, anioPublicacion, autor);
            libros.add(l);
        }

        public void listarLibros() {
            System.out.println("Libros en la biblioteca '" + nombre + "':");
            for (Libro l : libros) l.mostrarInfo();
            System.out.println();
        }

        public Libro buscarLibroPorIsbn(String isbn) {
            for (Libro l : libros) if (l.getIsbn().equals(isbn)) return l;
            return null;
        }

        public boolean eliminarLibro(String isbn) {
            Iterator<Libro> it = libros.iterator();
            while (it.hasNext()) {
                if (it.next().getIsbn().equals(isbn)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public int obtenerCantidadLibros() {
            return libros.size();
        }

        public List<Libro> filtrarLibrosPorAnio(int anio) {
            List<Libro> res = new ArrayList<>();
            for (Libro l : libros) if (l.getAnioPublicacion() == anio) res.add(l);
            return res;
        }

        public Set<String> mostrarAutoresDisponibles() {
            Set<String> autores = new LinkedHashSet<>();
            for (Libro l : libros) autores.add(l.getAutor().getNombre());
            System.out.println("Autores disponibles en '" + nombre + "':");
            for (String a : autores) System.out.println("- " + a);
            System.out.println();
            return autores;
        }
}
