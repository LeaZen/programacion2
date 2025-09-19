
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

public class ejercicio4 {
    
    public static void main(String[] args) {
        
        Banco superBanco = new Banco("Super Banco");
        TarjetaCredito master = new TarjetaCredito("459613", superBanco);
        Cliente clienteUno = new Cliente("Lionel", "35789321");
        
        //master.mostrarCliente();
        master.setCliente(clienteUno);
        master.mostrarCliente();
        
        clienteUno.mostrarTarjeta();
        //System.out.println(clienteUno.getTarjetaCredito());
    }
    
}
