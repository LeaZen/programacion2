
package POO;

/**
 *
 * @author Sintripio
 */
public class Empleado {
    
    // Atributos
    private static int totalEmpleados = 0;
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Constructor con todos los atributos
    public Empleado(String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = totalEmpleados;  // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    // Constructor sobrecargado: solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;  // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // salario por defecto
    }
    
    // Métodos sobrecargados actualizarSalario
    public void actualizarSalarioPorcentaje(double porcentaje) {
        //double calculoPorcentaje = this.salario * (porcentaje / 100);
        //this.salario += calculoPorcentaje;
        
        this.salario += this.salario * (porcentaje / 100);
    }
    
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    // toString
    @Override
    public String toString() {
        return "Empleado {" +
               "ID=" + id +
               ", Nombre='" + nombre + '\'' +
               ", Puesto='" + puesto + '\'' +
               ", Salario=" + salario +
               '}';
    }
    
    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
}
