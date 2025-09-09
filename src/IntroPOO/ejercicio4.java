
package IntroPOO;

/**
4. Gestión de Gallinas en Granja Digital 
a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos. 
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado(). 
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y 
mostrar su estado.
 */
public class ejercicio4 {
    
    public static void main(String[] args) {
        
        Gallina gallinaUno = new Gallina(2);
        
        Gallina gallinaDos = new Gallina(1);
        
        gallinaUno.mostrarEstado();
        gallinaDos.mostrarEstado();
        
        gallinaUno.ponerHuevo(6);
        gallinaUno.envejecer(2);
        
        gallinaDos.ponerHuevo(4);
        gallinaDos.envejecer(1);
        
        System.out.println("----Cambios de estado----");
        
        gallinaUno.mostrarEstado();
        gallinaDos.mostrarEstado();
    }
            
    
}
