
public class Pagamento {
    private double valor;
    private String formaPagamento;
    private boolean pago;

    public Pagamento(double valor, String formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.pago = false;
    }

    public void realizarPagamento() {
        pago = true;
        System.out.println("Pagamento realizado com sucesso!");
    }

    public void exibirPagamento() {
        System.out.println("Valor: R$ " + valor);
        System.out.println("Forma: " + formaPagamento);
        System.out.println("Pago: " + pago);
    }
}
