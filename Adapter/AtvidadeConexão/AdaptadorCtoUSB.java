package Adapter.AtvidadeConexão;

public class AdaptadorCtoUSB implements PortaUSB {
    private TecladoTipoC teclado;

    public AdaptadorCtoUSB(TecladoTipoC teclado) {
        this.teclado = teclado;
    }

    @Override
    public void conectarUSB() {
        System.out.println("Adaptador convertendo sinal de Tipo C para USB...");
        teclado.conectarTipoC();
    }
}
