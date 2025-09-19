
package UMLBasico;

/**
2.	Celular - Batería - Usuario
a.	Agregación: Celular → Batería
b.	Asociación bidireccional: Celular ↔ Usuario
Clases y atributos:
i.	Celular: imei, marca, modelo
ii.	Batería: modelo, capacidad
iii.	Usuario: nombre, dni
 */

public class Celular {
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private String imei;
    private Bateria bateria; // Agregacion 1:1 con clase Bateria.
    private Usuario usuario; // Asociación Bidireccional 1:1 con clase Usuario.
    
    // CONSTRUCTOR 
    public Celular(String modelo, Bateria bateria) {
        this.modelo = modelo;
        this.bateria = bateria; // Agregacion 1:1 con clase Bateria.
        
    }
    
    //METODOS
    // RELACION CON CLASE USUARIO. ESTA FUNCIÓN OBTIENE EL USUARIO DEL CELULAR.
      public void mostrarUsuario(){
      if (usuario != null){
        System.out.println("El celular " + modelo + " tiene de usuario a " + usuario.getNombre());
       } else {
        System.out.println("El celular " + modelo + " No tiene usuario");
       }
      }
    
    // RELACION CON CLASE USUARIO. ESTA FUNCIÓN PERMITE CAMBIAR AL USUARIO.
    // El atributo usuario en Celular es de tipo Usuario.
      public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
     //Antes de vincular --> validar que no haya nulos.
     //Antes de vincular --> asegurarse que las referencias cruzadas sean las mismas.
       if (usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }
      
      // Metodos Get

    public Usuario getUsuario() {
        return usuario;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }
    
    
      
      
}
