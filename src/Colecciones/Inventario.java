
package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Inventario {
    
    private ArrayList<Producto> productos = new ArrayList<>();

        public void agregarProducto(Producto p) {
            productos.add(p);
        }

        public void listarProductos() {
            System.out.println("Listado de productos:");
            for (Producto p : productos) {
                p.mostrarInfo();
            }
            System.out.println();
        }

        public Producto buscarProductoPorId(String id) {
            for (Producto p : productos) {
                if (p.getId().equals(id)) return p;
            }
            return null;
        }

        public boolean eliminarProducto(String id) {
            Iterator<Producto> it = productos.iterator();
            while (it.hasNext()) {
                Producto p = it.next();
                if (p.getId().equals(id)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public boolean actualizarStock(String id, int nuevaCantidad) {
            Producto p = buscarProductoPorId(id);
            if (p != null) {
                p.setCantidad(nuevaCantidad);
                return true;
            }
            return false;
        }

        public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
            List<Producto> res = new ArrayList<>();
            for (Producto p : productos) if (p.getCategoria() == categoria) res.add(p);
            return res;
        }

        public int obtenerTotalStock() {
            int total = 0;
            for (Producto p : productos) total += p.getCantidad();
            return total;
        }

        public Producto obtenerProductoConMayorStock() {
            if (productos.isEmpty()) return null;
            Producto mayor = productos.get(0);
            for (Producto p : productos) if (p.getCantidad() > mayor.getCantidad()) mayor = p;
            return mayor;
        }

        public List<Producto> filtrarProductosPorPrecio(double min, double max) {
            List<Producto> res = new ArrayList<>();
            for (Producto p : productos) {
                if (p.getPrecio() >= min && p.getPrecio() <= max) res.add(p);
            }
            return res;
        }

        public void mostrarCategoriasDisponibles() {
            System.out.println("Categorias disponibles:");
            for (CategoriaProducto c : CategoriaProducto.values()) {
                System.out.println("- " + c + ": " + c.getDescripcion());
            }
        }
    
    
}
