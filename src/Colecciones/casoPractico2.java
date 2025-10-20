
package Colecciones;


public class casoPractico2 {
        public static void main(String[] args) {
        Autor a1 = new Autor("A001", "Gabriel Garcia Marquez", "Colombiana");
        Autor a2 = new Autor("A002", "Julio Cortazar", "Argentina");
        Autor a3 = new Autor("A003", "Isabel Allende", "Chilena");
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.agregarLibro("ISBN001", "Cien anios de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "Rayuela", 1963, a2);
        biblioteca.agregarLibro("ISBN003", "La casa de los espiritus", 1982, a3);
        biblioteca.agregarLibro("ISBN004", "Cronica de una muerte anunciada", 1981, a1);
        biblioteca.agregarLibro("ISBN005", "Bestiario", 1951, a2);

        // 4. Listar todos los libros con su información y la del autor.
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("Buscar libro ISBN003:"); System.out.println(biblioteca.buscarLibroPorIsbn("ISBN003")); System.out.println();

        // 6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("Libros publicados en 1963:"); for (Libro l : biblioteca.filtrarLibrosPorAnio(1963)) l.mostrarInfo(); System.out.println();

        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("Eliminar libro ISBN005"); biblioteca.eliminarLibro("ISBN005"); biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros() + "\n");

        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        biblioteca.mostrarAutoresDisponibles();
    }
}