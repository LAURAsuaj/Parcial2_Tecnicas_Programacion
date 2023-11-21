public class Accesorio extends Producto{
    private String tipo;

    public Accesorio(String nombre, String descripcion, double precio, int Cantinventario, String tipo) {
        super(nombre, descripcion, precio, Cantinventario);
        this.tipo = tipo;
    }
    public String getMarca() {
        return tipo;
    }
}