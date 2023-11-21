import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String direccionEnvio;
    private List<Pedido> pedidos;

    public Cliente(String nombre, String direccionEnvio, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
public <pedido> void agregarPedido (Pedido, pedido) {
    pedidos.add(pedido);
}

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nDirecciòn: " + direccionEnvio
                + "\nLista de Pedidos: " + getListPedidos();
    }
}
