package Operadora_Cartoes;
public class ContaBancaria {
    private final String banco;
    private final int agencia;
    private final int conta;

    public ContaBancaria(String banco, int agencia, int conta) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "banco='" + banco + '\'' +
                ", agencia=" + agencia +
                ", numConta=" + conta +
                '}';
    }
}

