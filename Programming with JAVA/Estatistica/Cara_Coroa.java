package Estatistica;
import java.lang.Math;

public class Cara_Coroa {
    public static void main(String[] args) {
        System.out.println("===== CARA OU COROA =====");
        String resposta = "";
        for (int i=0; i<100; i++){
            double numAleatorio = (Math.random() * 2);
            int randomNumber = (int)numAleatorio;
            if (randomNumber == 1){
                System.out.println(randomNumber);
                resposta = "Cara";
                System.out.println();
            } else {
                System.out.println(randomNumber);
                resposta = "Coroa";
                System.out.println();
            }
            System.out.println(i+1+"° Jogada:" + resposta);
        }
    }
}