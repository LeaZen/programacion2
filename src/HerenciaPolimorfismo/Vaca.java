
package HerenciaPolimorfismo;

public class Vaca extends Animal {

    public Vaca(String nombre) {
        super.getNombre();
    }
    
     @Override
    public String  hacerSonido(){    
        return "Muuu";
    }
}
