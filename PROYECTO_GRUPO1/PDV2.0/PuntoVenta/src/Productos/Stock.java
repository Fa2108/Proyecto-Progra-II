package Productos;

    
import javax.swing.JOptionPane;

public class Stock extends Producto {

    public Stock(String name, String code, int price) {
        super(name, code, price);

    }

    public Stock() {
    }
    public static String name;
    public static String code;
    public static int price;
    public int opcion;
    public String productoSeleccionado = null;
    public int cantidadArroz = 0, cantidadFrijoles = 0, cantidadCocaCola = 0, cantidadJabondeRopa = 0,
            cantidadBistecdeRes = 0, cantidadSal = 0, cantidadAzucar = 0, cantidadChocolate = 0, cantidadLeche = 0;

    public int cantidadAnteriorArroz = 0, cantidadAnteriorFrijoles = 0, cantidadAnteriorCocaCola = 0, cantidadAnteriorJabondeRopa = 0,
            cantidadAnteriorBistecdeRes = 0, cantidadAnteriorSal = 0, cantidadAnteriorAzucar = 0, cantidadAnteriorChocolate = 0, cantidadAnteriorLeche = 0;
    public int totalCompra = 0;

    Producto producto1 = new Producto(name, code, price);
    Producto producto2 = new Producto(name, code, price);
    Producto producto3 = new Producto(name, code, price);
    Producto producto4 = new Producto(name, code, price);
    Producto producto5 = new Producto(name, code, price);
    Producto producto6 = new Producto(name, code, price);
    Producto producto7 = new Producto(name, code, price);
    Producto producto8 = new Producto(name, code, price);
    Producto producto9 = new Producto(name, code, price);

    Producto seleccionado = new Producto(name, code, price);

    //metodo para crear productos
    public void definirProductos() {

        producto1.setNombre("Arroz blanco");
        producto1.setCodigo("AB");
        producto1.setPrecio(1000);

        producto2.setNombre("Frijoles");
        producto2.setCodigo("F");
        producto2.setPrecio(800);

        producto3.setNombre("Coca Cola");
        producto3.setCodigo("CC");
        producto3.setPrecio(1200);

        producto4.setNombre("Jabon de Ropa");
        producto4.setCodigo("JR");
        producto4.setPrecio(3500);

        producto5.setNombre("Bistec de Res");
        producto5.setCodigo("BR");
        producto5.setPrecio(2000);

        producto6.setNombre("Sal");
        producto6.setCodigo("S");
        producto6.setPrecio(950);

        producto7.setNombre("Azucar");
        producto7.setCodigo("A");
        producto7.setPrecio(1300);

        producto8.setNombre("Chocolate");
        producto8.setCodigo("C");
        producto8.setPrecio(2000);

        producto9.setNombre("Leche");
        producto9.setCodigo("L");
        producto9.setPrecio(1200);

    }

    public void seleccionarProductos() {

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\nSeleccione los productos a comprar: \n"
                    + "1.Arroz blanco \n"
                    + "2.Frijoles\n"
                    + "3.Coca cola\n"
                    + "4.Jabon de ropa\n"
                    + "5.Bistek de res\n"
                    + "6.Sal\n"
                    + "7.Azúcar\n"
                    + "8.Chocolate\n"
                    + "9.Leche\n"
                    + "10.Finalizar compra"));

            switch (opcion) {
                case 1:
                    seleccionado = producto1;
                    cantidadArroz = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + seleccionado.getNombre() + " que desea comprar."));
                    JOptionPane.showMessageDialog(null, "Ha agregado a su compra " + cantidadArroz + " elementos del producto " + seleccionado.getNombre());
                    cantidadArroz = cantidadArroz + cantidadAnteriorArroz;
                    cantidadAnteriorArroz = cantidadArroz;
                    break;
                case 2:
                    seleccionado = producto2;
                    cantidadFrijoles = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + seleccionado.getNombre() + " que desea comprar."));
                    JOptionPane.showMessageDialog(null, "Ha agregado a su compra " + cantidadFrijoles + " elementos del producto " + seleccionado.getNombre());
                    cantidadFrijoles = cantidadFrijoles + cantidadAnteriorFrijoles;
                    cantidadAnteriorFrijoles = cantidadFrijoles;
                    break;
                case 3:
                    seleccionado = producto3;
                    cantidadCocaCola = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + seleccionado.getNombre() + " que desea comprar."));
                    JOptionPane.showMessageDialog(null, "Ha agregado a su compra " + cantidadCocaCola + " elementos del producto " + seleccionado.getNombre());
                    cantidadCocaCola = cantidadCocaCola + cantidadAnteriorCocaCola;
                    cantidadAnteriorCocaCola = cantidadCocaCola;
                    break;
                case 4:
                    seleccionado = producto4;
                    cantidadJabondeRopa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + seleccionado.getNombre() + " que desea comprar."));
                    JOptionPane.showMessageDialog(null, "Ha agregado a su compra " + cantidadJabondeRopa + " elementos del producto " + seleccionado.getNombre());
                    cantidadJabondeRopa = cantidadJabondeRopa + cantidadAnteriorJabondeRopa;
                    cantidadAnteriorJabondeRopa = cantidadJabondeRopa;
                    break;
                case 5:
                    seleccionado = producto5;
                    cantidadBistecdeRes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + seleccionado.getNombre() + " que desea comprar."));
                    JOptionPane.showMessageDialog(null, "Ha agregado a su compra " + cantidadBistecdeRes + " elementos del producto " + seleccionado.getNombre());
                    cantidadBistecdeRes = cantidadBistecdeRes + cantidadAnteriorBistecdeRes;
                    cantidadAnteriorBistecdeRes = cantidadBistecdeRes;
                    break;
                case 6:
                    seleccionado = producto6;
                    cantidadSal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + seleccionado.getNombre() + " que desea comprar."));
                    JOptionPane.showMessageDialog(null, "Ha agregado a su compra " + cantidadSal + " elementos del producto " + seleccionado.getNombre());
                    cantidadSal = cantidadSal + cantidadAnteriorSal;
                    cantidadAnteriorSal = cantidadSal;
                    break;
                case 7:
                    seleccionado = producto7;
                    cantidadAzucar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + seleccionado.getNombre() + " que desea comprar."));
                    JOptionPane.showMessageDialog(null, "Ha agregado a su compra " + cantidadAzucar + " elementos del producto " + seleccionado.getNombre());
                    cantidadAzucar = cantidadAzucar + cantidadAnteriorAzucar;
                    cantidadAnteriorAzucar = cantidadAzucar;
                    break;
                case 8:
                    seleccionado = producto8;
                    cantidadChocolate = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + seleccionado.getNombre() + " que desea comprar."));
                    JOptionPane.showMessageDialog(null, "Ha agregado a su compra " + cantidadChocolate + " elementos del producto " + seleccionado.getNombre());
                    cantidadChocolate = cantidadChocolate + cantidadAnteriorChocolate;
                    cantidadAnteriorChocolate = cantidadChocolate;
                    break;
                case 9:
                    seleccionado = producto9;
                    cantidadLeche = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + seleccionado.getNombre() + " que desea comprar."));
                    JOptionPane.showMessageDialog(null, "Ha agregado a su compra " + cantidadLeche + " elementos del producto " + seleccionado.getNombre());
                    cantidadLeche = cantidadLeche + cantidadAnteriorLeche;
                    cantidadAnteriorLeche = cantidadLeche;
                    break;
                case 10:
                    facturar();
                    break;
                default:
            }
        } while (opcion != 10);
    }

    public void facturar() {
        totalCompra = cantidadArroz * producto1.getPrecio() + cantidadFrijoles * producto2.getPrecio() + cantidadCocaCola * producto3.getPrecio()
                + cantidadJabondeRopa * producto4.getPrecio() + cantidadBistecdeRes * producto5.getPrecio() + cantidadSal * producto6.getPrecio() + cantidadAzucar * producto7.getPrecio()
                + cantidadChocolate * producto8.getPrecio() + cantidadLeche * producto9.getPrecio();

        JOptionPane.showMessageDialog(null, "Lista de productos a facturar \n"
                + "*******************************************************************\n"
                + "| Cantidad " + cantidadArroz + " | Producto " + producto1.getNombre() + " | Precio " + producto1.getPrecio() + " |\n"
                + "*******************************************************************\n"
                + "| Cantidad " + cantidadFrijoles + " | Producto " + producto2.getNombre() + " | Precio " + producto2.getPrecio() + " |\n"
                + "*******************************************************************\n"
                + "| Cantidad " + cantidadCocaCola + " | Producto " + producto3.getNombre() + " | Precio " + producto3.getPrecio() + " |\n"
                + "*******************************************************************\n"
                + "| Cantidad " + cantidadJabondeRopa + " | Producto " + producto4.getNombre() + " | Precio " + producto4.getPrecio() + " |\n"
                + "*******************************************************************\n"
                + "| Cantidad " + cantidadBistecdeRes + " | Producto " + producto5.getNombre() + " | Precio " + producto5.getPrecio() + " |\n"
                + "*******************************************************************\n"
                + "| Cantidad " + cantidadSal + " | Producto " + producto6.getNombre() + " | Precio " + producto6.getPrecio() + " |\n"
                + "*******************************************************************\n"
                + "| Cantidad " + cantidadAzucar + " | Producto " + producto7.getNombre() + " | Precio " + producto7.getPrecio() + " |\n"
                + "*******************************************************************\n"
                + "| Cantidad " + cantidadChocolate + " | Producto " + producto8.getNombre() + " | Precio " + producto8.getPrecio() + " |\n"
                + "*******************************************************************\n"
                + "| Cantidad " + cantidadLeche + " | Producto " + producto9.getNombre() + " | Precio " + producto9.getPrecio() + " |\n"
                + "******************************************************************\n"
                + "Total a pagar = " + totalCompra);

    }
}
