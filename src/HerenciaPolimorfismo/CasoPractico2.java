
package HerenciaPolimorfismo;


public class CasoPractico2 {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4,5)
        };
        
        for (Figura fig : figuras) {
            System.out.println(fig.getNombre()+ " " + "Area = " + fig.calcularArea());
            
        }
 
    }
            
            
}
