package Operadora_Cartoes;

public class CartaoDebito extends Cartao {
    private ContaBancaria conta;

    public CartaoDebito(int numeroCartao, double saldo, Cliente titular, ContaBancaria conta) {
        super(numeroCartao, saldo, titular);
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "CartaoDebito{" +
                "Conta = " + conta +
                "\nNúmero do Cartão = "+getNumeroCartao() +
                "\nTitular = "+ getTitular() +
                "\nSaldo=" + getSaldo() +
        '}';
    }
}
