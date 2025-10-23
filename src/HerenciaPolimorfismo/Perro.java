
package HerenciaPolimorfismo;

public class Perro extends Animal {

    public Perro(String nombre) {
        super.getNombre();
    }
     @Override
    public String hacerSonido(){    
       return "Guau Guau";
    }
    
}
