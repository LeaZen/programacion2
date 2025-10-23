
package HerenciaPolimorfismo;

public class Animal {
    
    private String nombre;

//    public Animal(String nombre) {
//        this.nombre = nombre;
//    }
    
    public String getNombre(){    
        return nombre;
    }

    public String hacerSonido() {
        return "Sonido Animal";
    }
    public void describirAnimal(){
    }
    
}