
public class Loja {
    private String nome;
    private Pedido pedido;

    public Loja(String nome) {
        this.nome = nome;
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedido = pedido;
        System.out.println("Pedido adicionado a loja.");
    }

    public void exibirLoja() {
        System.out.println("Loja: " + nome);

        if (pedido != null) {
            System.out.println("Pedido registrado: " + pedido.getNumero());
        } else {
            System.out.println("Nenhum pedido registrado.");
        }
    }
}
