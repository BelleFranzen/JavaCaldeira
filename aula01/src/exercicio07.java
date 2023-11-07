import java.util.Scanner;
/** Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o usuário a idade dele e o seu salário.
 * A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00. */

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Informe seu salário: ");
        double salario = scanner.nextDouble();

        if(idade >= 18){
            if(salario >= 2000.00){
                System.out.println("Você pode comprar um automóvel!");
            } else {
                System.out.println("Você não tem o valor suficiente para comprar um automóvel.");
            }
        } else {
            System.out.println("Você não tem idade para comprar um automóvel.");
        }

        scanner.close();
    }
}
