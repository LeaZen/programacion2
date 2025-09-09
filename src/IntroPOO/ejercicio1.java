
package IntroPOO;

/**
1. Registro de Estudiantes 
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación. 
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos). 
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir 
calificaciones. 
 */
public class ejercicio1 {
    
    public static void main(String[] args) {
        
        Estudiante e1 = new Estudiante("Leandro", "Zenocratti", 18, 8);
        
        e1.mostrarInfo();
        
        e1.aumentarCalificacion(15);
        
        e1.bajarCalificacion(6);
        
        System.out.println(e1.getCalificacion());
        
        //System.out.println(e1.getId());
        
        //System.out.println(e1.getContador());
        
        // Estudiante e2 = new Estudiante("Lionel", "Messi", 34, 10);
        
        // System.out.println(e2.getId());
        
        //System.out.println(e2.getContador());
        
        // Estudiante e3 = new Estudiante("Cristiano", "Ronaldo", 2, 7);
        
        // System.out.println(e3.getId());
        
        // System.out.println(e3.getContador());
        
        // e1.setNombre("Lionel");
        
        // System.out.println(e1.getNombre());
       
        // e1.saludar();
       
        // e1.saludar("Lionel");
       
        // Estudiante.saludar("Lionel");
       
       
       
    }
}
