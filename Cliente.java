
public class Cliente extends Pessoa {
    private int codigoCliente;
    private Endereco endereco;

    public Cliente(String nome, int idade, String cpf, String email,
                   int codigoCliente, Endereco endereco) {
        super(nome, idade, cpf, email);
        this.codigoCliente = codigoCliente;
        this.endereco = endereco;
    }

    public void realizarCompra() {
        System.out.println(getNome() + " realizou uma compra.");
    }

    public void consultarEndereco() {
        endereco.exibirEndereco();
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
