package Test.Producto;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import Productos.Producto;

public class ProductoTest {
    @Test
    public void testProductoConstructorNombreCodigoPrecio(){
        Producto producto = new Producto("Arroz", "A", 1000);
        assertEquals(producto.getNombre(), "Arroz");
        assertEquals(producto.getCodigo(), "A");
        assertEquals(producto.getPrecio(), 1000);
    }
    public void testProductoSetter(){
        Producto producto = new Producto();
        producto.setNombre("Arroz");
        Producto producto = new Producto();
        producto.setCodigo("A");
        Producto producto = new Producto();
        producto.setPrecio(1000);
        assertEquals(producto.getNombre().getCodigo().getPrecio(), "Arroz");
    }
}
