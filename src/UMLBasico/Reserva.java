
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

public class Reserva {
    // ATRIBUTOS
    private String numero;
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación Unidirecional 1:1 con clase Cliente.
    private Mesa mesa; // Agregacion 1:1 con clase Mesa.
    
    // CONSTRUCTOR
    // Al tener Agregacion 1:1 con clase Mesa. Se solicita Mesa como parámetro. 
    public Reserva(String numero, Mesa mesa) {
        this.numero = numero;
        this.mesa = mesa;
    }
    
    // FUNCION EN BASE A RELACION CON CLASE CLIENTE
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void mostrarCliente(){
        if (cliente != null){
            System.out.println("La reserva " + numero + " fue realizada por cliente " + cliente.getNombre()+".");
        } else{
            System.out.println("La reserva " + numero + " no tiene cliente.");
        }
    }
    // FIN FUNCIONES EN BASE A RELACION CON CLASE CLIENTE
    
    // FUNCION EN BASE A RELACION CON CLASE MESA.
    public Mesa getMesa() {
        return mesa;
    }
    
    
    
} // CIERRE DE CLASE
