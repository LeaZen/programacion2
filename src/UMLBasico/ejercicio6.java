
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

public class ejercicio6 {
    
    public static void main(String[] args) {
        
        Cliente clienteUno = new Cliente("Roman", "20456841");
        
        Mesa mesaDoce = new Mesa ("12");
        Reserva reservaUno = new Reserva ("458", mesaDoce);
        
        reservaUno.mostrarCliente();
        
        reservaUno.setCliente(clienteUno);
        
        reservaUno.mostrarCliente();
        
        
    }
}
