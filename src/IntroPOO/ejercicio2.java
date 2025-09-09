
package IntroPOO;

/**
Registro de Mascotas 
a. Crear una clase Mascota con los atributos: nombre, especie, edad. 
Métodos requeridos: mostrarInfo(), cumplirAnios(). 
Tarea: Crear una mascota, mostrar su información, 
simular el paso del tiempo y verificar los cambios. 
 */
public class ejercicio2 {
    
    public static void main(String[] args) {
     
        Mascota m1 = new Mascota("Luna", "Perro", 4);
     
        m1.mostrarInfo();
        
        m1.cmplirAnios(7);
        System.out.println(m1.getEdad());
    }
    
    
        
}
