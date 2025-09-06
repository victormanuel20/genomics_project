
// (sin package) – punto de entrada del SERVIDOR
// Responsabilidad: leer configuration.properties y delegar el arranque a red/TCPServer.
//
// NOTA: este esqueleto NO implementa lógica; solo indica dónde va cada cosa.

package servidor;

public class Main {
    public static void main(String[] args) {
        System.out.println("[SERVIDOR] cliente.Main: aquí leerás configuration.properties y crearás red.TCPServer");
        // Ejemplo conceptual (no implementado):
        // GestorPropiedades cfg = new GestorPropiedades("configuration.properties");
        // new red.TCPServer(cfg).iniciar();
    }
}
