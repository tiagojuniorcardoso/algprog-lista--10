
public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionario(String nome, int idade, String cpf, String email,
                       double salario, String cargo) {
        super(nome, idade, cpf, email);
        this.salario = salario;
        this.cargo = cargo;
    }

    public void trabalhar() {
        System.out.println(getNome() + " esta trabalhando.");
    }

    public void exibirDados() {
        apresentar();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
}
