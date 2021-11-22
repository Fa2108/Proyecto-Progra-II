package Test.Producto;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import Productos.Producto;

public class productoTest {
    @Test
    public void testProductoConstructorNombreCodigoPrecio(){
        Producto producto = new Producto("Arroz", "A", 1000);
        assertEquals(producto.getNombre(), "Arroz");
        assertEquals(producto.getCodigo(), "A");
        assertEquals(producto.getPrecio(), 1000);
    }
    @Test
    public void testProductoSetter(){
        Producto producto = new Producto();
        producto.setNombre("Arroz");
        Producto producto2 = new Producto();
        producto.setCodigo("A");
        Producto producto3 = new Producto();
        producto.setPrecio(1000);
        assertEquals(producto.getNombre().getCodigo().getPrecio(), "Arroz");
    }
}