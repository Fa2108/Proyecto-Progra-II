package Test.Cliente;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import PDV.Cliente;

public class ClienteTest {
    @Test 
    public void testClienteConstructorId(){
        Cliente cliente = new Cliente();
        assertEquals(cliente.getId());
    }
    @Test 
    public void testClienteConstructorNombre(){
        Cliente cliente = new Cliente();
        assertEquals(cliente.getNombre());
    }
    @Test
    public void testClienteConstructorIdNombre(){
        Cliente cliente = new Cliente("100", "Juan");
        assertEquals(cliente.getId(), "100");
        assertEquals(cliente.getNombre(), "Juan");
    }
    @Test 
    public void testClienteSetter(){
        Cliente cliente = new Cliente();
        cliente.setNombre("John");
        Cliente cliente = new Cliente("100");
        cliente.setId(cliente);
        assertEquals(cliente.getId().getNombre(), "John");
    }
    
}
