
public class Pedidos {
    private int numero;
    private Cliente cliente;
    private Funcionario funcionario;
    private ItemPedido item;

    public Pedido(int numero, Cliente cliente, Funcionario funcionario, ItemPedido item) {
        this.numero = numero;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.item = item;
    }

    public double calcularTotal() {
        return item.calcularSubtotal();
    }

    public void exibirPedido() {
        System.out.println("Pedido numero: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Funcionario: " + funcionario.getNome());

        item.exibirItem();

        System.out.println("Total: R$ " + calcularTotal());
    }

    public int getNumero() {
        return numero;
    }
}
