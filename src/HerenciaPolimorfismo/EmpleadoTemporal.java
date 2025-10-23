
package HerenciaPolimorfismo;

public class EmpleadoTemporal extends Empleado {
    
    private String temporal;

    public EmpleadoTemporal(String nombre, String apellido, String temporal) {
        super(nombre, apellido);
        this.temporal = temporal;
    }
    
    @Override
    public void calcularSueldo(){
        System.out.println("Sueldo por hora");
    }
}