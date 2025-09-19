
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

public class Vehiculo {
    // ATRIBUTOS
    private String patente;
    private String modelo;
    private Motor motor; // Agregacion 1:1 con clase Motor.
    private Conductor conductor; // Asociación Bidirecional 1:1 con clase Conductor.
    // CONSTRUCTOR
    public Vehiculo(String patente, Motor motor) {
        this.patente = patente;
        this.motor = motor;
    }
    // FUNCION EN BASE A RELACION BIDIRECCIONAL Vehículo ↔ Conductor.
    public void setConductor(Conductor conductor) {
     this.conductor = conductor;
       if (conductor != null && conductor.getVehiculo() !=  this ) {
            conductor.setVehiculo(this); 
       }
    }
     public Conductor getConductor() {
        return conductor;
    }
    // FIN FUNCIONES EN BASE A RELACION BIDIRECCIONAL Vehículo ↔ Conductor.

    public Motor getMotor() {
        return motor;
    }

    
    
}
