package Folha_Pagamento;

import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Funcionario> funcionarios;
    public FolhaPagamento(){
        funcionarios = new ArrayList<Funcionario>();
    }
    public void adicionarFuncionario(Funcionario f){
        funcionarios.add(f);
    }

    public float calculaFolhaPagamento() {
        float somaTotal = 0;
        for (Funcionario f : funcionarios) {
            somaTotal += (float) f.calculaSalario();
        }
        return somaTotal;
    }
}
