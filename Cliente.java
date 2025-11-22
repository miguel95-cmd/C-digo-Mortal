public class Cliente {
    private final int idCliente;
    private final String nombre;
    private final String numero;

    public Cliente(int idCliente, String nombre, String numero) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.numero = numero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente +
                ", nombre=" + nombre + ", numero=" + numero + '}';
    }
}