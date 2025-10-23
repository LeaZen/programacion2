
package HerenciaPolimorfismo;

public class CasoPractico1 {
    
    public static void main(String[] args) {
            
       
        Auto a1 = new Auto("Renault","Clio", 4);
        Vehiculo a3 = new Auto("Chevrolet","Corsa", 3);
        
        a3.mostrarInfo();
        a1.mostrarInfo();
        
    }
    
}
