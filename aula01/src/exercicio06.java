import java.util.Scanner;

/** Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
 Se for menor de 16 anos, avisar que não pode votar;
 Se tiver 16 ou 17, avisar que o voto é facultativo;
 Se tiver mais de 65, avisar que também é facultativo o voto;
 De 18 até 65, é obrigatório votar. */
public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if(idade < 16){
            System.out.println("Você não tem o direito de voto ainda!");
        } else if(idade <= 17 || idade > 65){
            System.out.println("Você não é obrigado a votar, apenas se quiser.");
        } else {
            System.out.println("Você é obrigado a votar!");
        }

        scanner.close();
    }
}
