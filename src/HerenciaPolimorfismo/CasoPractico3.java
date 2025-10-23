
package HerenciaPolimorfismo;


public class CasoPractico3 {
    public static void main(String[] args) {
        
        Empleado[] empleados = {
        new EmpleadoTemporal ("Lionel", "Messi", "Temporal"),
        new EmpleadoPlanta ("Cristiano", "Ronaldo", "Planta")
        };
        
        
    for (Empleado emple : empleados) {
      if (emple instanceof EmpleadoPlanta) {
           System.out.println( emple.getNombre()+ " "+ emple.getApellido()+ " Es empleado de planta");
    } else if (emple instanceof EmpleadoTemporal) {
    System.out.println(emple.getNombre()+ " "+ emple.getApellido()+" Es empleado temporal");
    };
        }
    }
    
}
