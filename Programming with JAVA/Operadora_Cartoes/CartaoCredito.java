package Operadora_Cartoes;

public class CartaoCredito extends Cartao {
    private final double anuidade;
    private final double limite;

    public CartaoCredito(int numeroCartao, double saldo, Cliente titular, double anuidade, double limite) {
        super(numeroCartao, saldo, titular);
        this.anuidade = anuidade;
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "CartaoCredito{" +
                "Anuidade=" + anuidade +
                "\nLimite=" + limite +
                "\nNúmero do Cartão = "+getNumeroCartao() +
                "\nTitular = "+ getTitular() +
                "\nSaldo=" + getSaldo() +
                '}';
    }
}
