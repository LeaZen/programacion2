
package HerenciaPolimorfismo;

public class EmpleadoPlanta extends Empleado {
    
    private String planta;

    public EmpleadoPlanta(String nombre, String apellido, String planta) {
        super(nombre, apellido);
        this.planta = planta;
    }
    
    @Override
    public void calcularSueldo(){
        System.out.println("Sueldo por mes");
    }
}
