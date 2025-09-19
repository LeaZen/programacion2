
package UMLBasico;

/**
4.	TarjetaDeCrédito - Cliente - Banco
a.	Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
b.	Agregación: TarjetaDeCrédito → Banco
Clases y atributos:
i.	TarjetaDeCrédito: numero, fechaVencimiento
ii.	Cliente: nombre, dni
iii.	Banco: nombre, cuit
 */

public class TarjetaCredito {
    // ATRIBUTOS
    private String numero; 
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional 1:1 con ↔ Cliente
    private Banco banco; // Agregacion 1:1 con la clase Banco.
    
    // CONSTRUCTOR
    public TarjetaCredito(String numero, Banco banco) {
        this.numero = numero;
        this.banco = banco;
    }
    
    // RELACION CON CLASE CLIENTE.
    public void setCliente(Cliente cliente) {
    this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaCredito() != this){
            cliente.setTarjetaCredito(this);
        }   
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    //METODOS
    // RELACION CON CLASE CLIENTE. 
    public void mostrarCliente(){
        if (cliente == null) {
            System.out.println("Esta tarjeta no tiene cliente asignado");
        } else{
        System.out.println("La tarjeta " + numero + " tiene de cliente a " + cliente +".");
        }
    }

    @Override
    public String toString() {
        return numero + " del banco " + banco + ".";
    }
        
    
    
}
