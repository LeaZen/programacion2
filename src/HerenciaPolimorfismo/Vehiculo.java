
package HerenciaPolimorfismo;


public abstract class Vehiculo {
     private String marca;
     private String modelo;
     
      public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
      
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método que debe ser sobrescrito por las subclases
    public void mostrarInfo(){
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);  
    }    
             
}
