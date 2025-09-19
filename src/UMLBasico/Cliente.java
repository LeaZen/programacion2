
package UMLBasico;

/**
4.	TarjetaDeCrédito - Cliente - Banco
a.	Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
b.	Agregación: TarjetaDeCrédito → Banco
Clases y atributos:
i.	TarjetaDeCrédito: numero, fechaVencimiento
ii.	Cliente: nombre, dni
iii.	Banco: nombre, cuit

//////// ESTA CLASE SE UTILIZA PARA AMBOS EJERCICIOS  !!!

6.	Reserva - Cliente - Mesa
a.	Asociación unidireccional: Reserva → Cliente
b.	Agregación: Reserva → Mesa
Clases y atributos:
i.	Reserva: fecha, hora
ii.	Cliente: nombre, telefono
iii.	Mesa: numero, capacidad
 */

public class Cliente {
    // ATRIBUTOS
    private String nombre; 
    private String dni;
    private TarjetaCredito tarjetaCredito; // Asociación bidireccional 1:1 con ↔ TarjetaCredito.
    private String telefono;
    
    // CONSTRUCTOR
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    // FUNCION EN BASE A RELACION CON CLASE TARJETA CREDITO
    // Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    
    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }
    
    public void mostrarTarjeta(){
        if (tarjetaCredito != null){
            System.out.println("El cliente " + nombre + " tiene la tarjeta " + tarjetaCredito);
        } else{
            System.out.println("El cliente  " + nombre + " no tiene tarjeta");
        }
    }
    // FIN FUNCIONES EN BASE A RELACION CON CLASE TARJETA CREDITO
    
    
    // FUNCION EN BASE A RELACION CON CLASE RESERVA
    // Asociación unidireccional: Reserva → Cliente.
    public String getNombre() {
        return nombre;
    }
    // FIN FUNCIONES EN BASE A RELACION CON CLASE RESERVA
    
    @Override
    public String toString(){
        return nombre + ", dni " + dni;
    }
    
} // Cierre clase.
    


