
package red;

import protocolo.Peticion;
import protocolo.Respuesta;

// Atiende a UN cliente en un hilo: recibe cadena del protocolo, la parsea y delega en controladores.
// Devuelve una Respuesta serializada al cliente.
public class TCPThread implements Runnable {
    @Override
    public void run() {
        // TODO: lectura/escritura de sockets + uso de GestorProtocolo y GestorPacientes
    }
}
