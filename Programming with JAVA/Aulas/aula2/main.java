package Aulas.aula2;

public class main {
    
    
}

class Categoria {
    String nomeDaCategoria; 
    double valorDiaria;
    double calculaTotalDiarias(int dias) {
    return this.valorDiaria * dias;
    }

    void cadastrarCategoria(){

    }
}

class Veiculo {
    String placaVeiculo;
    String chassiVeiculo;
    int anoVeiculo;
    Categoria categoriaVeiculo; 
    Unidade unidadeVeiculo;
    
    void cadastrarVeiculo(){

    }
}

class Unidade { 
    String endereco; 
    String telefone; 
    String contato; 
    String eMail;
}


