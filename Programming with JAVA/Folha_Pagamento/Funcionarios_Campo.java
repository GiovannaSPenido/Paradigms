package Folha_Pagamento;

import java.util.Arrays;

public class Funcionarios_Campo extends Funcionario {
    private float adicionalPericulosidade;

    public Funcionarios_Campo(String matricula, String nome, String cpf, String email, float salarioBase, float adicionalPericulosidade) {
        super(matricula, nome, cpf, email, salarioBase);
        this.adicionalPericulosidade = adicionalPericulosidade;
    }

    @Override
    public double calculaSalario(){
        return getSalarioBase()  + adicionalPericulosidade;
    }

    @Override
    public String toString() {
        return "Funcionarios_Campo{" +
                "adicionalPericulosidade=" + adicionalPericulosidade +
                '}';
    }
}
