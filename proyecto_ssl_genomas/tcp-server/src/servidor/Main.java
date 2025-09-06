
// (sin package) – punto de entrada del SERVIDOR
// Responsabilidad: leer example.properties y delegar el arranque a red/TCPServer.
//
// NOTA: este esqueleto NO implementa lógica; solo indica dónde va cada cosa.

package servidor;

import red.TCPServer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
        TCPServer server = new TCPServer(2020);
        server.start();
    }
}




/*
public class Main {
    public static void main(String[] args) {
        System.out.println("[SERVIDOR] cliente.Main: aquí leerás example.properties y crearás red.TCPServer");
        // Ejemplo conceptual (no implementado):
        // GestorPropiedades cfg = new GestorPropiedades("example.properties");
        // new red.TCPServer(cfg).iniciar();

        Properties p = new Properties();
        try {
            p.load(new FileInputStream(new File("example.properties")));
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
        TCPServer server = new TCPServer(2020);
        server.start();



    }
}
*/