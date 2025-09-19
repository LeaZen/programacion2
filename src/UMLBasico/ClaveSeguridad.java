
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

public class ClaveSeguridad {
    
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }
    
}
