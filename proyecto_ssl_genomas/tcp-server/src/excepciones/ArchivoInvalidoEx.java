
package excepciones;

// Excepción para archivos inválidos/ilegibles.
public class ArchivoInvalidoEx extends RuntimeException {
    public ArchivoInvalidoEx(String msg) { super(msg); }
}
