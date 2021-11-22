package PDV;

public class Cliente {
    
    //Variables
    private String nombreC;
    private String id;

    //Constructor
    public Cliente() {
    }

    public String getNombre() {
        return nombreC;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombreC = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreC + "\n cedula: " + id;

    }
}

