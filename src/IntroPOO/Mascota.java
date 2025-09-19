
package IntroPOO;

public class Mascota {
    
    // Atributos de la clase.
    /*
    Contador está declarado como static.
    Es un atributo de la clase, no de cada objeto. 
    Significa que todos los objetos --> Mascota comparten el mismo contador.
    */
    private static int contador;
    private int id;
    private String nombre;
    private String especie;
    private int edad;
    // Fin Atributos.
    
    // Constructores.
   
    public Mascota(String nombre, String especie, int edad) {
    contador ++;        
    this.id = contador;
    /*
    Cada Mascota creada toma como ID, el valor del contador (incrementado)
    en el momento de su creación. --> this.id = contador;
    */
    
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad;
    // setNombre(nombre);
    // setEspecie(especie);
    // setEdad(edad);
    
    }
    // Fin Constructores.
    
    // Métodos Get & Set.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Fin Métodos Get & Set.
    
     // Métodos.
   
    public void mostrarInfo(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Mascota {" +
               "ID=" + id +
               ", Nombre='" + nombre + '\'' +
               ", Especie='" + especie + '\'' +
               ", Edad=" + edad +
               '}';
    }
 
    public void cmplirAnios(int edadParametro){
        int actual = getEdad(); // Se obtiene la edad actual.
        int suma = actual + edadParametro; // Se sumo lo cumplido.
        setEdad(suma); // Se aumenta la edad.
    }
    
    
}
