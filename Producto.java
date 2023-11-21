import java.util.HashMap;
import java.util.Map;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int Cantinventario;

    /**
     * CONSTRUCTOR
     * @param nombre
     * @param descripcion
     * @param precio
     * @param inventario
     */
    public Producto(String nombre, String descripcion, double precio, int inventario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.Cantinventario = Cantinventario;
    }

    /**
     * Atributos getter
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return getPrecio();
    }
    public int getCantinventario() {
        return Cantinventario;
    }
    protected void RestarInventario(int cantidad) {
        if (Cantinventario>= cantidad){
            cantidad -= cantidad;
        }else{
            System.out.println("Error");
        }
    }
}

