
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("=== SISTEMA DA LOJA ===");

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = leia.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = leia.nextLine();

        System.out.print("Digite o preco do produto: ");
        double preco = Double.parseDouble(leia.nextLine());

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = Integer.parseInt(leia.nextLine());

        if (quantidade <= 0 || quantidade > 10 || preco < 0) {
            System.out.println("Dados invalidos.");
            leia.close();
            return;
        }

        Endereco endereco = new Endereco(
            "Rua das Flores", "Belo Horizonte", "MG", 100
        );

        Cliente cliente = new Cliente(
            nomeCliente, 20, "12345678900",
            "cliente@email.com", 1, endereco
        );

        Funcionario funcionario = new Funcionario(
            "Carlos", 30, "98765432100",
            "funcionario@email.com", 2500.00, "Vendedor"
        );

        Categoria categoria = new Categoria(
            "Eletronicos", "Produtos eletronicos da loja"
        );

        Produto produto = new Produto(
            nomeProduto, preco, 10, categoria
        );

        ItemPedido item = new ItemPedido(produto, quantidade);

        Pedido pedido = new Pedido(
            1, cliente, funcionario, item
        );

        Loja loja = new Loja("Loja do Tiago");

        loja.adicionarPedido(pedido);

        produto.retirarEstoque(quantidade);

        Pagamento pagamento = new Pagamento(
            pedido.calcularTotal(), "Pix"
        );

        System.out.println("\n=== DADOS DO CLIENTE ===");
        cliente.apresentar();
        cliente.consultarEndereco();
        cliente.falar();
        cliente.realizarCompra();

        System.out.println("\n=== DADOS DO FUNCIONARIO ===");
        funcionario.exibirDados();
        funcionario.trabalhar();

        System.out.println("\n=== DADOS DO PRODUTO ===");
        categoria.exibirCategoria();
        produto.exibirProduto();

        System.out.println("\n=== DADOS DO PEDIDO ===");
        pedido.exibirPedido();

        System.out.println("\n=== PAGAMENTO ===");
        pagamento.realizarPagamento();
        pagamento.exibirPagamento();

        System.out.println("\n=== DADOS DA LOJA ===");
        loja.exibirLoja();

        leia.close();
    }
}
