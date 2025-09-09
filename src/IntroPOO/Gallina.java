
package IntroPOO;

public class Gallina {
    
    // Atributos de la clase.
    /*
    Contador está declarado como static.
    Es un atributo de la clase, no de cada objeto. 
    Significa que todos los objetos --> Mascota comparten el mismo contador.
    */
    private static int contador;
    private int id;
    private int edad;
    private int huevosPuestos;
    // Fin Atributos.
    
    // Constructores.
   
    public Gallina(int edad) {
    contador ++;        
    this.id = contador; 
    this.edad = edad;
    }
    // Fin Constructores.
    
    // Métodos Get & Set.

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    // Fin Métodos Get & Set.
    
     // Métodos.
    
     public void mostrarEstado(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Gallina {" +
               "ID=" + id +
               ", Edad='" + edad + '\'' +
               ", Huevos Puestos='" + huevosPuestos + '\'' +
               '}';
    }
    
    
    public void ponerHuevo(int huevoParametro){
        int actual = getHuevosPuestos(); // Se obtiene la cantidad de huevos puestos.
        int suma = actual + huevoParametro; // Se sumo lo puesto.
        setHuevosPuestos(suma); // Se aumenta la cantidad de huevos puestos.
    }
            
     public void envejecer(int aniosEnvejecimiento){
        int actual = getEdad(); // Se obtiene la edad.
        int suma = actual + aniosEnvejecimiento; // Se suman los aaños que pasaron.
        setEdad(suma); // Se aumenta la edad.
    }
     
}
