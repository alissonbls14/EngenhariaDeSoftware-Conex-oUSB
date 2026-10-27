package Adapter.AtvidadeConexão;

public class Gabinete {
    public void conectarTeclado(PortaUSB portaUsb) {
        System.out.println("Tentando conectar teclado ao gabinete...");
        portaUsb.conectarUSB();
    }
}
