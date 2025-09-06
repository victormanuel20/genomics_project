
package excepciones;

// Excepción de dominio cuando no existe el paciente solicitado.
public class PacienteNoEncontradoEx extends RuntimeException {
    public PacienteNoEncontradoEx(String msg) { super(msg); }
}
