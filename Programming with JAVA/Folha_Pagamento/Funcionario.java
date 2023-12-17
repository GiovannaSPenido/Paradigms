package Folha_Pagamento;

public abstract class Funcionario {
    protected String matricula;
    protected String nome;
    protected String cpf;
    protected String email;
    protected float salarioBase;

    public float getSalarioBase() {
        return salarioBase;
    }

    public abstract double calculaSalario();

    public Funcionario(String matricula, String nome, String cpf, String email, float salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.salarioBase = salarioBase;
    }
}
