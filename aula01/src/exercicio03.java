import java.util.Scanner;

public class exercicio03 {
    public exercicio03() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite um numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Digite um numero: ");
        double numero3 = scanner.nextDouble();
        double maiorNumero;
        if (numero1 > numero2 && numero1 > numero3) {
            maiorNumero = numero1;
        } else if (numero2 > numero3) {
            maiorNumero = numero2;
        } else {
            maiorNumero = numero3;
        }

        double menorNumero;
        if (numero1 < numero2 && numero1 < numero3) {
            menorNumero = numero1;
        } else if (numero2 < numero3) {
            menorNumero = numero2;
        } else {
            menorNumero = numero3;
        }

        double soma = numero1 + numero2 + numero3;
        double media = soma / 3.0;
        System.out.println("O Maior Número é: " + maiorNumero);
        System.out.println("O Menor Número é: " + menorNumero);
        System.out.println("A média aritmética é: " + media);
        scanner.close();
    }
}