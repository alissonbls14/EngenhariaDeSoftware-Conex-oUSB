package Adapter;

public class VendaService {
    public void realizarVenda(Pagamento pagamento, double valor) {
        pagamento.pagar(valor);
    }
}
