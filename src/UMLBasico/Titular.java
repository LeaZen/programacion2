
package UMLBasico;

/**
1. Pasaporte - Foto - Titular
a.	Composición: Pasaporte → Foto
b.	Asociación bidireccional: Pasaporte ↔ Titular
Clases y atributos:
i.	Pasaporte: numero, fechaEmision
ii.	Foto: imagen, formato
iii.	Titular: nombre, dni
 
// ESTA CLASE SE UTILIZA EN DOS EJERCICIOS !!!

10.	CuentaBancaria - ClaveSeguridad - Titular
a.	Composición: CuentaBancaria → ClaveSeguridad
b.	Asociación bidireccional: CuentaBancaria ↔ Titular
Clases y atributos:
i.	CuentaBancaria: cbu, saldo
ii.	ClaveSeguridad: codigo, ultimaModificacion
iii.	Titular: nombre, dni.
 */

public class Titular {
    // ATRIBUTOS
    private String nombre; 
    private String dni;
    private Pasaporte pasaporte; // Asociación bidireccional con clase Pasaporte.
    private CuentaBancaria cuenta; // Asociación bidireccional con clase CuentaBancaria.
    
    // CONSTRUCTOR
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
 
    // FUNCION EN BASE A ASOCIACIÓN BIDIRECCIONAL CON CLASE PASAPORTE
     public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    //Antes de vincular --> validar que no haya nulos.
    //Antes de vincular --> asegurarse que las referencias cruzadas sean las mismas.
    
    // && Obtiene el atributo, en este caso "titular" de la clase Pasaporte.
    // Consulta si el parámetro pasaporte ingresado (con this) es distinto
    // al que ya existe dentro de la clase Pasaporte.
    // Si cumple ambas, cambia el atributo pasaporte (con el parámetro pasaporte)
    // Y este cambia el atributo titular en la clase Pasaporte.
    // Con la función setTitular declarada en la clase Pasaporte.
          if (pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
          } 
      }
     
        public Pasaporte getPasaporte() {
            return pasaporte;
        }
    // FIN FUNCIONES EN BASE A ASOCIACIÓN BIDIRECCIONAL CON CLASE PASAPORTE
        
    // FUNCION EN BASE A ASOCIACIÓN BIDIRECCIONAL CON CLASE CUENTA BANCARIA 
        
        public void setCuenta(CuentaBancaria cuenta) {
          this.cuenta = cuenta;
            if (cuenta.getTitular() != this) {
            cuenta.setTitular(this);
            }
        }

        public CuentaBancaria getCuenta() {
            return cuenta;
        }
   
    // FIN FUNCIONES EN BASE A ASOCIACIÓN BIDIRECCIONAL CON CLASE CUENTA BANCARIA
        
         @Override
         public String toString() {
         return nombre;
         }
       
} // Cierre Clase

