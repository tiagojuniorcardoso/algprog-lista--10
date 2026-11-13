
public class Produtos {
    private String nome;
    private double preco;
    private int estoque;
    private Categoria categoria;

    public Produto(String nome, double preco, int estoque, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Estoque: " + estoque);
        System.out.println("Categoria: " + categoria.getNome());
    }

    public void retirarEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Estoque atualizado: " + estoque);
        } else {
            System.out.println("Quantidade indisponivel.");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
