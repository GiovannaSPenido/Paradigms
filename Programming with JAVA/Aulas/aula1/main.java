package Aulas.aula2.aula1;

public class main {
    public static void main(String[] args) {

        conta c1 = new conta();
        c1.agencia = 10;
        c1.numConta = 1010;
        c1.cliente = "Pedro Paulo";
        c1.saldo = 1000;

        conta c2 = new conta();
        c2.agencia = 20;
        c2.numConta = 4564;
        c2.cliente = "Maria das Dores";
        c2.saldo = 1500;

        System.out.println(c1);
        System.out.println(c2);
    }
}