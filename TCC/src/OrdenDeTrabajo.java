public class OrdenDeTrabajo {
    private final int idOrden;
    private final Cliente cliente;
    private final Tecnico tecnico;
    private final Servicio servicio;
    private String estado;

    public OrdenDeTrabajo(int idOrden, Cliente cliente, Tecnico tecnico, Servicio servicio) {
        this.idOrden = idOrden;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.servicio = servicio;
        this.estado = "Pendiente";
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    @Override
    public String toString() {
        return "OrdenDeTrabajo{" +
                "idOrden=" + idOrden +
                ", cliente=" + cliente.getNombre() +
                ", tecnico=" + tecnico.getNombre() +
                ", servicio=" + servicio.getTipo() +
                ", estado=" + estado +
                '}';
    }
}