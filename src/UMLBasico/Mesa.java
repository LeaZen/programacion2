
package UMLBasico;

/**
6.	Reserva - Cliente - Mesa
a.	Asociación unidireccional: Reserva → Cliente
b.	Agregación: Reserva → Mesa
Clases y atributos:
i.	Reserva: fecha, hora
ii.	Cliente: nombre, telefono
iii.	Mesa: numero, capacidad
 */

public class Mesa {
    private String numero;
    private String capacidad;

    public Mesa(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
 
} // Cierre clase.
