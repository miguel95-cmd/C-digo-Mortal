public class Tecnico {
    private final int idTecnico;
    private final String nombre;
    private final String especialidad;

    public Tecnico(int idTecnico, String nombre, String especialidad) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "idTecnico=" + idTecnico +
                ", nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
}