
package HerenciaPolimorfismo;


public class Auto extends Vehiculo {
    
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        // Llama primero al constructor de la super clase.
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
     // Sobrescritura del método mostrarInfo()
    @Override
    public void mostrarInfo() {
      System.out.println(" Auto - Marca: " + super.getMarca() + 
                      ", Modelo: " + super.getModelo() + 
                    ", Puertas: " + cantidadPuertas);
   }  
}
