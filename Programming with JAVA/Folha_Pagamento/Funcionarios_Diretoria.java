package Folha_Pagamento;

public class Funcionarios_Diretoria extends Funcionario {
    private float gratificacao;
    private float auxilioMoradia;

    public Funcionarios_Diretoria(String matricula, String nome, String cpf, String email, float salarioBase, float gratificacao, float auxilioMoradia) {
        super(matricula, nome, cpf, email, salarioBase);
        this.gratificacao = gratificacao;
        this.auxilioMoradia = auxilioMoradia;
    }

    @Override
    public double calculaSalario(){
        return getSalarioBase() + auxilioMoradia + gratificacao;
    }

    @Override
    public String toString() {
        return "Funcionarios_Diretoria{" +
                "gratificacao=" + gratificacao +
                ", auxilioMoradia=" + auxilioMoradia +
                '}';
    }
}
