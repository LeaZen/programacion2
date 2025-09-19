
package UMLBasico;

/**
7.	Vehículo - Motor - Conductor
a.	Agregación: Vehículo → Motor
b.	Asociación bidireccional: Vehículo ↔ Conductor
Clases y atributos:
i.	Vehículo: patente, modelo
ii.	Motor: tipo, numeroSerie
iii.	Conductor: nombre, licencia
 */

public class Conductor {
     // ATRIBUTOS
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Asociación Bidirecional 1:1 con clase Vehiculo.
    
    //CONSTRUCTOR
    public Conductor(String nombre) {
        this.nombre = nombre;
    }
    
    // FUNCION EN BASE A RELACION BIDIRECCIONAL Conductor ↔ Vehículo.
    public void setVehiculo(Vehiculo vehiculo) {
     this.vehiculo = vehiculo;
       if (vehiculo != null && vehiculo.getConductor() !=  this ) {
            vehiculo.setConductor(this); 
       }
    }
     public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getNombre() {
        return nombre;
    }
    // FIN FUNCIONES EN BASE A RELACION BIDIRECCIONAL Conductor ↔ Vehículo.
}
