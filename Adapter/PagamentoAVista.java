package Adapter;

public class PagamentoAVista implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento à vista realizado no valor de: " + valor);
    }
}
