
package excepciones;

// Excepción para problemas de inicialización/uso de SSL.
public class ConexionSSLEx extends RuntimeException {
    public ConexionSSLEx(String msg, Throwable cause) { super(msg, cause); }
}
