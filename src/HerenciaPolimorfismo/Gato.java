
package HerenciaPolimorfismo;

public class Gato extends Animal {

    public Gato(String nombre) {
        super.getNombre();
    }
    
    @Override
    public String hacerSonido(){    
        return "Miau";
    }
}
