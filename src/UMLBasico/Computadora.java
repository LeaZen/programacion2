
package UMLBasico;

/**
5.	Computadora - PlacaMadre - Propietario
a.	Composición: Computadora → PlacaMadre
b.	Asociación bidireccional: Computadora ↔ Propietario
Clases y atributos:
i.	Computadora: marca, numeroSerie
ii.	PlacaMadre: modelo, chipset
iii.	Propietario: nombre, dni
 */

public class Computadora {
    // ATRIBUTOS
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composición 1:1 con clase Placa Madre.
    private Propietario propietario; // Asociación Bidireccional 1:1 con clase Propietario.
    // CONSTRUCTOR
    public Computadora(String marca, String placaMadre) {
        this.marca = marca;
        this.placaMadre = new PlacaMadre(placaMadre); // Se crea internamente
    }
    
    // RELACION CON PLACA MADRE. ESTA FUNCIÓN OBTIENE EL MODELO DE PLACA MADRE.
    public void mostrarPlacaMadre(){
        System.out.println("La computadora " + marca +" tiene la placa "+ placaMadre.getModelo());
    }
    
    // FUNCION EN BASE A RELACION BIDIRECCIONAL CON CLASE PROPIETARIO.
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
            if (propietario != null && propietario.getComputadora()!= this){
                propietario.setComputadora(this);   
            }
    }

    public Propietario getPropietario() {
        return propietario;
    }
    // FIN FUNCIONES EN BASE A RELACION BIDIRECCIONAL CON CLASE PROPIETARIO
    
    public String getMarca() {
        return marca;
    }
    
    
    
    
}
