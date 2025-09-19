
package UMLBasico;

/**
1. Pasaporte - Foto - Titular
a.	Composición: Pasaporte → Foto
b.	Asociación bidireccional: Pasaporte ↔ Titular
Clases y atributos:
i.	Pasaporte: numero, fechaEmision
ii.	Foto: imagen, formato
iii.	Titular: nombre, dni
 */
public class Pasaporte {
    // ATRIBUTOS
    private String numero;
    private String fechaEmision;
    private Foto imagen; // Composición 1:1 con clase Foto.
    private Titular titular; // Asociación Bidireccional 1:1 con clase Titular.
    
    // CONSTRUCTOR
    public Pasaporte(String numero, String fechaEmision, String imagen) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.imagen = new Foto(imagen); // Se crea internamente
        
    }
    // RELACION CON CLASE FOTO. ESTA FUNCIÓN OBTIENE LA IMAGEN DE FOTO.
    public void mostrarPasaporte(){
        System.out.println("Pasaporte Numero: " + numero +" "+ imagen.getImagen());
    }
    
    // RELACION CON CLASE TITULAR. ESTA FUNCIÓN OBTIENE EL TITULAR DEL PASAPORTE.
      public void mostrarPasTitular(){
        System.out.println("Pasaporte Numero: " + numero +" "+ titular.getPasaporte());
    }
    
    // RELACION CON CLASE TITULAR. ESTA FUNCIÓN PERMITE CAMBIAR AL TITULAR.
    // El atributo titular en Pasporte es de tipo Titular.
    
     public void setTitular(Titular titular) {
        this.titular = titular;
     //Antes de vincular --> validar que no haya nulos.
     //Antes de vincular --> asegurarse que las referencias cruzadas sean las mismas.
    
     // && Obtiene el atributo, en este caso "pasaporte" de la clase Titular. 
     // Consulta si parámetro titular ingresado (con this) es distinto al que ya existe en la clase Titular.
     // Si cumple ambas, cambia el atributo Titular (con el parámetro titular) 
     // Y este cambia el atributo pasaporte en la clase Titular.
     // Con la función set pasaporte declarada en la clase Titular.
       if (titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }
     
     // Get Titular
        public Titular getTitular() {
            //System.out.println(titular);
        return titular;
        }
     
       @Override
       public String toString() {
       return "Nombre del titular: " + titular;
       }
        
} // Cierre Clase
