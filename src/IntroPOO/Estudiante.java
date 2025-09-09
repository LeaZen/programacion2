
package IntroPOO;
/**
 */
public class Estudiante {
    
    // Atributos de la clase.
    /*
    Contador está declarado como static.
    Es un atributo de la clase, no de cada objeto. 
    Significa que todos los objetos --> Estudiante comparten el mismo contador.
    */
    private static int contador;
    private int id;
    private String nombre;
    private String apellido;
    private int curso;
    private float calificacion;
    // Fin Atributos.
    
    // Constructores.
    
    // Constructores que solicita todos los datos.
    public Estudiante(String nombre, String apellido, int curso, float calificacion) {
        contador ++;        
        this.id = contador;
        /*
        Cada Estudiante creado toma como ID, el valor del contador (incrementado)
        en el momento de su creación. --> this.id = contador;
        */
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    // Fin Constructores.
    
    
    // Métodos Get & Set.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreParametro) {
        this.nombre = nombreParametro;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidoParametro) {
        this.apellido = apellidoParametro;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int cursoParametro) {
        this.curso = cursoParametro;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacionParametro) {
        this.calificacion = calificacionParametro;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // Fin Métodos Get & Set.
    
   
   // Métodos.
   
    public void mostrarInfo(){
        System.out.println(this.toString());
    }
    
    public void aumentarCalificacion(float calificacionParametro){
        float actual = getCalificacion(); // Se obtiene la calificación actual.
        float suma = actual + calificacionParametro; // Se sumo la nueva.
        setCalificacion(suma); // Se aumenta la calificación.
    }
    
    public void bajarCalificacion(float calificacionParametro){
        float actual = getCalificacion(); // Se obtiene la calificación actual.
        float resta = actual - calificacionParametro; // Se sumo la nueva.
        setCalificacion(resta); // Se aumenta la calificación.
    }
    
    public void saludar(){
        System.out.println( "Hola " + this.nombre);
    }
    
    public static void saludar(String nombreParametro){
        System.out.println( "Hola " + nombreParametro);
    }
    
    
    
    @Override
    public String toString() {
        return "Estudiante {" +
               "ID=" + id +
               ", Nombre='" + nombre + '\'' +
               ", Apellido='" + apellido + '\'' +
               ", Curso=" + curso +
               ", Calificacion=" + calificacion +
               '}';
    }
    
    //public void mostrarInfo(){
    //    System.out.println(this.apellido);
    //}
    
    
    // Fin Métodos.
    
    
    
    } // Fin Class
