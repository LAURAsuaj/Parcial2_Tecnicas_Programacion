

public class Pedido {
    private Cliente cliente;
    private Map<Producto, Integer> productos;

    public Cliente getCliente() {
        return cliente;
    }

    public Map<Producto, Integer> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        productos.put(producto,cantidad);
    }
}