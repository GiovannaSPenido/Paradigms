import java.util.InputMismatchException;
import java.util.Scanner;

// Format: Alt + Ctrl + L
public class CalculaDivisao {
    public static double divisao(int num, int den) {
        return num / den;
    }

    public static void main(String args[]) {
        try { // Bloco de Comandos
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entre com o numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("Entre com o denominador: ");
            int denominador = scanner.nextInt();
            double result = divisao(numerador, denominador);
            System.out.print(result);
        } catch (ArithmeticException e1) { // Ações necessárias para recuperar-se da exceção do tipo ExcecaoTipo1
            System.out.println("Divisão por 0");
        } catch (InputMismatchException e2) {
            System.out.println("Valor não numérico");
        } catch (Exception a) {
            System.out.println("Saida");
        } finally {
            System.out.print("Fim do programa");
        }
    }
}


