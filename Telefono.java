

class Telefono extends Producto{
    private String marca;

    public Telefono(String nombre, String descripcion, double precio, int Cantinventario, String marca) {
        super(nombre, descripcion, precio, Cantinventario);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}