package Operadora_Cartoes;

public class Cartao {
    protected final int numeroCartao;
    protected double saldo;
    private final Cliente titular;

    public Cartao(int numeroCartao, double saldo, Cliente titular) {
        this.numeroCartao = numeroCartao;
        this.saldo = saldo;
        this.titular = titular;
    }
    public int getNumeroCartao() {
        return numeroCartao;
    }
    public double getSaldo() {
        return saldo;
    }
    public Cliente getTitular() {
        return titular;
    }

    @Override
    public String
    toString() {
        return "Cartao{" +
                "numeroCartao=" + numeroCartao +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }
}

// LEGENDA PROVA: (#) -> protected || (-) -> private || (+) -> public