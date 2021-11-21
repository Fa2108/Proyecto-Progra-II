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