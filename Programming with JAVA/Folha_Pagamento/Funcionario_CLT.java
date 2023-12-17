package Folha_Pagamento;

public class Funcionario_CLT extends Funcionario {
    private float valeTransporte;
    private float valeAlimentacao;

    public Funcionario_CLT(String matricula, String nome, String cpf, String email, float salarioBase, float valeTransporte, float valeAlimentacao) {
        super(matricula, nome, cpf, email, salarioBase);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    public float getValeTransporte() {
        return valeTransporte;
    }

    public float getValeAlimentacao() {
        return valeAlimentacao;
    }

    @Override
    public double calculaSalario(){
        return getSalarioBase() + valeTransporte + valeAlimentacao;
    }

    @Override
    public String toString() {
        return "Funcionario_CLT{" +
                "valeTransporte=" + valeTransporte +
                ", valeAlimentacao=" + valeAlimentacao +
                '}';
    }
}
