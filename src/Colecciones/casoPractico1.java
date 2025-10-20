
package Colecciones;

public class casoPractico1 {
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        // 1. Crear cinco productos con diferentes categorías y agregarlos al inventario.
        inventario.agregarProducto(new Producto("P001", "Arroz", 1500, 20, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Celular X", 45000, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Remera", 2500, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Lámpara", 1200, 10, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Queso", 1800, 8, CategoriaProducto.ALIMENTOS));

        // 2. Listar todos los productos mostrando su información y categoría.
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("Buscar producto P003:");
        Producto buscado = inventario.buscarProductoPorId("P003");
        System.out.println(buscado != null ? buscado : "Producto no encontrado");
        System.out.println();

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("Filtrar por categoria ALIMENTOS:");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) p.mostrarInfo();
        System.out.println();

        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("Eliminar producto P002 (Celular X)"); inventario.eliminarProducto("P002"); inventario.listarProductos();

        // 6. Actualizar el stock de un producto existente.
        System.out.println("Actualizar stock P001 a 50"); inventario.actualizarStock("P001", 50); System.out.println(inventario.buscarProductoPorId("P001")); System.out.println();

        // 7. Mostrar el total de stock disponible.
        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock() + "\n");

        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("Producto con mayor stock: " + inventario.obtenerProductoConMayorStock() + "\n");

        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("Productos con precio entre 1000 y 3000:");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) p.mostrarInfo();
        System.out.println();

        // 10. Mostrar las categorías disponibles con sus descripciones.
        inventario.mostrarCategoriasDisponibles();
}
    }
