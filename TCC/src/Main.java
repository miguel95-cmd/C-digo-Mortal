public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, "Juan", "3001234567");
        Tecnico tecnico1 = new Tecnico(1, "Carlos", "Reparación");
        Servicio servicio1 = new Servicio(1, "Instalación", 150000);

        OrdenDeTrabajo orden1 = new OrdenDeTrabajo(1, cliente1, tecnico1, servicio1);

        System.out.println(cliente1);
        System.out.println(tecnico1);
        System.out.println(servicio1);
        System.out.println(orden1);

        orden1.actualizarEstado("Completada");
        System.out.println(orden1);
    }
}