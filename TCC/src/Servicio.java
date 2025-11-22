public class Servicio {
    private final int idServicio;
    private final String tipo;
    private final double costo;

    public Servicio(int idServicio, String tipo, double costo) {
        this.idServicio = idServicio;
        this.tipo = tipo;
        this.costo = costo;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "idServicio=" + idServicio +
                ", tipo=" + tipo + ", costo=" + costo + '}';
    }
}