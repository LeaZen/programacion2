
package IntroPOO;

public class NaveEspacial {
    
    
    // Atributos de la clase.
    /*
    Contador está declarado como static.
    Es un atributo de la clase, no de cada objeto. 
    Significa que todos los objetos --> Mascota comparten el mismo contador.
    */
    private static int contador;
    private int id;
    private String nombre;
    private int combustible;
    // Fin Atributos.
    
    // Constructores.
   
    public NaveEspacial(String nombre, int combustible) {
    contador ++;        
    this.id = contador; 
    this.nombre = nombre;
    this.combustible = combustible;
    }
    // Fin Constructores.

    
    // Métodos Get & Set.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    // Fin Métodos Get & Set.
    
         public void mostrarEstado(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Nave Espacial {" +
               "ID=" + id +
               ", Nombre='" + nombre + '\'' +
               ", Combustible='" + combustible + '\'' +
               '}';
    }

    //Métodos requeridos: 
    
    public void avanzar(int distancia){
        if (combustible < 60){
            System.out.println("El minimo para avanzar es 60 de combustible");    
        } else {
            System.out.println("Estoy avanzando");
        }     
     }
    
    public void recargarCombustible(int combustibleParametro){
        int actual = getCombustible(); // Se obtiene la cantidad de combustible.
        int suma = actual + combustibleParametro; // Se sumo lo puesto.
        
        if (suma > 100){
            System.out.println("No puede recargar tanto combustible. El maximos es 100"); 
            this.combustible = combustible;
        } else {
            setCombustible(suma); // Se aumenta la cantidad de combustible.
        }     
    }
    
 
    public void despegar() {
         if (combustible >= 60 && combustible < 100){
            System.out.println("Estoy despegando"); 
            
        } else {
            System.out.println("!Usted no puede despegar!");
        } 
    }
}
