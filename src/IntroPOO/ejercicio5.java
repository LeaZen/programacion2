
package IntroPOO;

/**
Simulación de Nave Espacial 
Crear una clase NaveEspacial con los atributos: nombre, combustible. 
Métodos requeridos: despegar(), avanzar(distancia), 
recargarCombustible(cantidad), mostrarEstado(). 
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que 
se supere el límite al recargar. 
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin 
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final. 
 */
public class ejercicio5 {
    
    public static void main(String[] args) {
        
        NaveEspacial n1 = new NaveEspacial("Nave Interestelar 25", 50);
        
        System.out.println(n1.getCombustible());
        
        n1.avanzar(10);
        
        n1.recargarCombustible(60);
        
        n1.recargarCombustible(20);
        
        n1.avanzar(10);
        
        n1.despegar();
        
        n1.mostrarEstado();
    }
}
