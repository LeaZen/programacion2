
package UMLBasico;

/**
10.	CuentaBancaria - ClaveSeguridad - Titular
a.	Composición: CuentaBancaria → ClaveSeguridad
b.	Asociación bidireccional: CuentaBancaria ↔ Titular
Clases y atributos:
i.	CuentaBancaria: cbu, saldo
ii.	ClaveSeguridad: codigo, ultimaModificacion
iii.	Titular: nombre, dni.
*/

public class CuentaBancaria {
    // ATRIBUTOS
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición con clase ClaveSeguridad.
    private Titular titular;  // Asociación bidireccional con clase Titular.
    
    // CONSTRUCTOR
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion); // Composición.
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular.getCuenta() != this) {
            titular.setCuenta(this); // bidireccional
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }
    
    
}
