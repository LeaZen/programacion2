
package Interfaces_Excepciones;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable  {
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        cliente.notificarCambioEstado("Producto agregado: " + producto.getNombre());
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}


