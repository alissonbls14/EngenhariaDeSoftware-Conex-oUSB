package Adapter.AtvidadeConexão;

public class Main {
    public static void main(String[] args) {
        Gabinete gabinete = new Gabinete();

        TecladoTipoC tecladoTipoC = new TecladoTipoC();

        PortaUSB tecladoAdapter = new AdaptadorCtoUSB(tecladoTipoC);

        gabinete.conectarTeclado(tecladoAdapter);
    }
}
