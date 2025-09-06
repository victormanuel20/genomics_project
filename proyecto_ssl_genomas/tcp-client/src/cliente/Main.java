package cliente;

// (sin package) – punto de entrada del CLIENTE
// Responsabilidad: leer configuration.properties, crear red.TCPClient y abrir vista.MenuCliente.
public class Main {
    public static void main(String[] args) {
        System.out.println("[CLIENTE] cliente.Main: aquí leerás configuration.properties y crearás red.TCPClient");
        // Ejemplo conceptual (no implementado):
        // GestorPropiedades cfg = new GestorPropiedades("configuration.properties");
        // new vista.MenuCliente(new red.TCPClient(cfg)).mostrar();
    }
}
