package PDV;

import javax.swing.JOptionPane;

import Productos.Stock;

public class App extends Stock {

    public App(String name, String code, int price) {
        super(name, code, price);

    }

    public static int opcion = 0;

    public static void main(String[] args) throws Exception {

        Stock cargar = new Stock();

        cargar.definirProductos();

        Cliente cliente = new Cliente();

        String nuevoCliente;
        nuevoCliente = JOptionPane.showInputDialog(null, "Bienvenido a su pulperia favorita" + "\nIngrese el nombre del cliente:");

        String id;
        id = JOptionPane.showInputDialog(null, "Ingrese el número de identificación del cliente:");

        cliente.setNombre(nuevoCliente);
        cliente.setId(id);

        cargar.seleccionarProductos();

    }

}
