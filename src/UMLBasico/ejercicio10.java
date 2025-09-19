
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

public class ejercicio10 {
    public static void main(String[] args) {
        
        // Crear un titular
        Titular titular1 = new Titular("Maria Lopez", "30214587");

        // Crear una cuenta bancaria (incluye su ClaveSeguridad por composición)
        CuentaBancaria cuenta1 = new CuentaBancaria("0123456789012", 150423, "ABC123", "15/09/2025");

        // Antes de asignar titular
        System.out.println("Titular asignado: " + cuenta1.getTitular());

        // Vincular titular con cuenta (asociación bidireccional)
        cuenta1.setTitular(titular1);

        // Después de asignar titular
        System.out.println("Titular de la cuenta: " + cuenta1.getTitular());

        // Ver la clave de seguridad (composición)
        System.out.println("Clave de seguridad actual: " + cuenta1.getClave().getCodigo());
    }
}

