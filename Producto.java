package Productos;

public class Producto {

    //Atributos
    private String codigo;
    private String nombre;
    private int precio;

    //Metodos
    //Constructor
    public Producto(String name, String code, int price) {
        nombre = name;
        codigo = code;
        precio = price;
    }

    public Producto() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre" + nombre + ", Codigo: " + codigo + ", Precio: " + precio;

    }
}
