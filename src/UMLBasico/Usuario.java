
package UMLBasico;

/**
2.	Celular - Batería - Usuario
a.	Agregación: Celular → Batería
b.	Asociación bidireccional: Celular ↔ Usuario
Clases y atributos:
i.	Celular: imei, marca, modelo
ii.	Batería: modelo, capacidad
iii.	Usuario: nombre, dni

/// ESTA CLASE SIRVE PARA TRES EJERCICIOS !!!

8.	Documento - FirmaDigital - Usuario
a.	Composición: Documento → FirmaDigital
b.	Agregación: FirmaDigital → Usuario
Clases y atributos:
i.	Documento: titulo, contenido
ii.	FirmaDigital: codigoHash, fecha
iii.	Usuario: nombre, email

/// ESTA CLASE SIRVE PARA TRES EJERCICIOS !!!

13.	GeneradorQR - Usuario - CódigoQR
a.	Asociación unidireccional: CódigoQR → Usuario
b.	Dependencia de creación: GeneradorQR.generar(String, Usuario)
Clases y atributos:
i.	CodigoQR: valor.
ii.	Usuario: nombre, email.
iii.	GeneradorQR->método: void generar(String valor, Usuario usuario)
*/

public class Usuario {
    //ATRIBUTOS
    private String nombre; 
    private String dni;
    private Celular celular; // Referencia Asociación bidireccional con clase Celular.
    
    //CONSTRUCTOR
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    //METODOS
    // ESTA FUNCIÓN PERMITE CAMBIAR EL CELULAR.
     public void setCelular(Celular celular) {
     this.celular = celular;
       if (celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        } 
   }

    public Celular getCelular() {
        return celular;
    }
    
     public String getNombre() {
        return nombre;
    }
    
    @Override
         public String toString() {
         return nombre;
         }
    }
    
   

