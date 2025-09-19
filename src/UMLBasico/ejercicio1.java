
package UMLBasico;

public class ejercicio1 {
    
    public static void main(String[] args) {
        //Pasaporte p1 = new Pasaporte("22896347", "12 Septiembre 2025", "Tiene Foto");
        //p1.mostrarPasaporte();
        //No hay un new = Foto. Se crea con el parámetro recibido --> "Tiene Foto"
        
        Pasaporte primerPas = new Pasaporte("A123", "2025-09-01", "foto.jpg");
        Titular primerTitular = new Titular("Juan Perez", "12345678");
        Titular segundoTitular = new Titular("Rodrigo Bueno", "98765415");
        Pasaporte segundoPas = new Pasaporte("B547", "2025-09-01", "foto.jpg");
        
        primerPas.setTitular(primerTitular);
        System.out.println(primerPas.getTitular());
        //segundoPas.setTitular(segundoTitular);
        
        // Cambio de titular.
        primerPas.setTitular(segundoTitular);
        System.out.println(primerPas.getTitular());
        
        //primerPas.mostrarPasaporte();
        //segundoPas.mostrarPasaporte();
        
        //primerPas.getTitular();
        //segundoPas.getTitular();
        
        //primerTitular.getPasaporte();
        //segundoTitular.getPasaporte();
    }
}
