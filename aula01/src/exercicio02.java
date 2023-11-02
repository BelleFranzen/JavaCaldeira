import java.util.Scanner;

public class exercicio02 {
    public exercicio02() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Digite um numero: ");
        double segundoNumero = scanner.nextDouble();
        System.out.println("Os números escolhidos foram " + primeiroNumero + " e " + segundoNumero + ".");
        scanner.close();
    }
}