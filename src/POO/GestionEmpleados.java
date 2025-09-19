
package POO;

public class GestionEmpleados {
    
    public static void main(String[] args) {
        
        // Creacion de empleados con ambos constructores.
        Empleado e1 = new Empleado("Juan Perez", "Analista", 80000);
        Empleado e2 = new Empleado("Maria Lopez", "Desarrolladora");
        Empleado e3 = new Empleado("Carlos Ruiz", "Tester", 60000);
        
        // Mostrar estado inicial-
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        
        // Actualizar salarios con métodos sobrecargados.
        e1.actualizarSalarioPorcentaje(10.0); // aumento 10%
        e2.actualizarSalario(5000); // aumento fijo
        e3.actualizarSalarioPorcentaje(15.0); // aumento 15%
       
        // Mostrar estado después de actualizaciones.
        System.out.println("--- Despues de aumentos ---");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        
        // Mostrar total de empleados creados.
        System.out.println("\nTotal de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
