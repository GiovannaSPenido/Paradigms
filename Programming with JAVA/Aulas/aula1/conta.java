package Aulas.aula2.aula1;
public class conta {
    public int agencia;
    public int numConta;
    public String cliente;
    public float saldo;
    static int totalContas = 0;

    float getSaldo() {
        return saldo;
    }

    boolean sacar(float valor) {
        if (valor > saldo) return false;
        saldo = saldo - valor;
        return true;
    }

    void depositar(float valor) {
        saldo = saldo + valor;
    }

    @Override
    public String toString() {
        String msg = "";
        msg += "Agencia: " + agencia + " - ";
        msg += "Conta: " + numConta + "\n";
        msg += "Nome: " + cliente + "\n";
        msg += "Saldo: R$ " + String.format("%.2f", saldo) + "\n";
        return msg;
    }
}
