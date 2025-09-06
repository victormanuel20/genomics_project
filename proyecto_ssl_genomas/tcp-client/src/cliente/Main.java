package cliente;

import red.TCPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

// (sin package) – punto de entrada del CLIENTE
// Responsabilidad: leer configuration.properties, crear red.TCPClient y abrir vista.MenuCliente.
public class Main {
    public static void main(String[] args) {
        System.out.println("[CLIENTE] cliente.Main: aquí leerás configuration.properties y crearás red.TCPClient");
        // Ejemplo conceptual (no implementado):
        // GestorPropiedades cfg = new GestorPropiedades("configuration.properties");
        // new vista.MenuCliente(new red.TCPClient(cfg)).mostrar();


        Properties p = new Properties();
        try {
            p.load(new FileInputStream(new File("configuration.properties")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        String certificateRoute = p.getProperty("SSL_CERTIFICATE_ROUTE");
        String certificatePassword = p.getProperty("SSL_PASSWORD");
        System.setProperty("javax.net.ssl.keyStore",certificateRoute);
        System.setProperty("javax.net.ssl.keyStorePassword",certificatePassword);
        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
        System.setProperty("javax.net.ssl.trustStore", certificateRoute);
        System.setProperty("javax.net.ssl.trustStorePassword", certificatePassword);
        System.setProperty("javax.net.ssl.trustStoreType", "PKCS12");

        TCPClient client = new TCPClient("127.0.0.1", 2020);
        client.sendMessage("Simon", "Gaviria");




    }
}
