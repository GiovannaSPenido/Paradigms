package Folha_Pagamento;

public class TestFolhaPagamento {
    public static void main(String[] args) {

        //SobreEscrito de métodos - Polimorfismo --> @Override
        //Implementação de Poliformismo sem a necessidade de herança - ArrayList<Parâmetro de Tipo> NOME = new ArrayList<Parâmetro de Tipo> - NOME.add(objetos do Tipo) --> Nesse caso o array adicionará a lista "NOME" somente objetos, variáveis que possuem o TIPO especificado!


        //Criação de Objetos - Funcionários
        Funcionario_CLT funcionarioCLT = new Funcionario_CLT("32", "João Victor", "121213", "jvflima14@gmail.com", 1200, 350, 400);
        Funcionarios_Campo funcionarioCampo = new Funcionarios_Campo("40", "Pedro Paulo", "202021", "pedroPaulo@gmail.com", 1500, 450);
        Funcionarios_Diretoria funcionarioDiretor = new Funcionarios_Diretoria("50", "Thiago", "303031", "thiagoFreitas@gmail.com", 3000, 500, 600);

        FolhaPagamento fp = new FolhaPagamento();
        //Adicionando funcionários ao ArrayList
        fp.adicionarFuncionario(funcionarioCLT);
        fp.adicionarFuncionario(funcionarioCampo);
        fp.adicionarFuncionario(funcionarioDiretor);
        //Calculando folha de pagamento
        //1950 + 1950 + 4100
        System.out.println("Total Folha de Pagamento: R$"+fp.calculaFolhaPagamento());

    }
}

