
package HerenciaPolimorfismo;

public class CasoPractico4 {
    public static void main(String[] args) {
        
    
    
    Animal[] animales = {
      new Gato("Lucas"),
      new Vaca("Lucy"),
      new Perro("Luna")
    };
    
    for (Animal a : animales) {
        System.out.println(a.hacerSonido()); 
    }
 }        
}