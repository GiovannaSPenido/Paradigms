package Operadora_Cartoes;

public class CartaoPrePago extends Cartao {

    private boolean cartaoAtivo;
    private Empresa empresa;
    public CartaoPrePago(int numeroCartao, double saldo, Cliente titular) {
        super(numeroCartao, saldo, titular);
        this.cartaoAtivo = false;
    }

    public void setCartaoAtivo(boolean estado) {
        this.cartaoAtivo = estado;
    }

    @Override
    public String toString() {
        return "CartaoPrePago{" +
                "Cartão=" + cartaoAtivo +
                "\nEmpresa=" + empresa +
                "\nNúmero do Cartão = "+getNumeroCartao() +
                "\nTitular = "+ getTitular() +
                "\nSaldo=" + getSaldo() +
                '}';
    }
}
