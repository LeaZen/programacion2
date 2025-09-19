
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
public class ejercicio2 {
    
    public static void main(String[] args) {
        
        Usuario hayUsuario = new Usuario ("Gerardo");
        Bateria modeloTresDos = new Bateria ("modelo 32");
        Celular primerCelu = new Celular("Nokia 1100", modeloTresDos );
        
        primerCelu.mostrarUsuario();
        primerCelu.setUsuario(hayUsuario);
        primerCelu.mostrarUsuario();
        
        System.out.println(hayUsuario.getNombre()+ " tiene el celular " + hayUsuario.getCelular().getModelo());
        
        System.out.println("El celular " + primerCelu.getModelo() + " tiene bateria " + primerCelu.getBateria());
    }
    
    
}
