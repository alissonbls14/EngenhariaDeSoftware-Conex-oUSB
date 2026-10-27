package Adapter;

public class PagamentoAdapter implements Pagamento {
    private PagamentoExterno pagamentoExterno;

    public PagamentoAdapter(PagamentoExterno pagamentoExterno) {
        this.pagamentoExterno = pagamentoExterno;
    }

    @Override
    public void pagar(double valor) {
        
        long valorCentavos = Math.round(valor * 100);
        pagamentoExterno.executarTransacaoPix(valorCentavos);
    }
    
}
