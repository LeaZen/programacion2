
package IntroPOO;

public class Libro {
        
    // Atributos de la clase.
    /*
    Contador está declarado como static.
    Es un atributo de la clase, no de cada objeto. 
    Significa que todos los objetos --> Mascota comparten el mismo contador.
    */
    private static int contador;
    private int id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    // Fin Atributos.
    
    // Constructores.
    
    public Libro(String titulo, String autor, int anioPublicacion) {
    contador ++;        
    this.id = contador;
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;
    // Fin Constructores.
    
    // Métodos Get & Set.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        
        if (anioPublicacion < 0){
         System.out.println("Anio de Publicacion Incorrecto");
         } else {
         this.anioPublicacion = anioPublicacion;   
        }
         
    }
    
    // Fin Métodos Get & Set.
    
    // Métodos.
    
    public void mostrarInfo(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Libro {" +
               "ID=" + id +
               ", Titulo='" + titulo + '\'' +
               ", Autor='" + autor + '\'' +
               ", AnioPublicacion=" + anioPublicacion +
               '}';
    }
    
    
    
} // Fin Clase.

