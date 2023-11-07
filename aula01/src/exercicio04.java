/** Criar um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
 * calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado,
 * assuma que o salário mínimo é R$1.320. */

import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo atual: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o valor do seu salário: ");
        double salario = scanner.nextDouble();

        double quantidadeSalarioMinimo = salario / salarioMinimo;

        System.out.printf("O usuário ganha %.2f salários mínimos.", + quantidadeSalarioMinimo);

        scanner.close();
    }
}
