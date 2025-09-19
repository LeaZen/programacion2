
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

public class ejercicio7 {
    
    public static void main(String[] args) {
        
        Motor nuevoMotor = new Motor("457-8523");
        Vehiculo nuevoAuto = new Vehiculo("AED 425", nuevoMotor);
        Conductor nuevoConductor = new Conductor("Lucia");
        
        nuevoAuto.setConductor(nuevoConductor);
        System.out.println(nuevoAuto.getConductor().getNombre());
        
        System.out.println(nuevoAuto.getMotor().getNumeroSerie());
    }
}
