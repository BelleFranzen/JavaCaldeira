import java.util.Scanner;
/** Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu de opções, perguntando se a pessoa é
 * Gestante, Idosa, PCD ou Nenhuma das alternativas. Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito.*/

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Fila Prioritária");
        System.out.println("1. Gestante");
        System.out.println("2. Idosa");
        System.out.println("3. PCD");
        System.out.println("4. Nenhuma Alternativa");

        System.out.println("Escolha uma opção:");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você tem direito à fila prioritária como gestante.");
                break;
            case 2:
                System.out.println("Você tem direito à fila prioritária como pessoa idosa.");
                break;
            case 3:
                System.out.println("Você tem direito à fila prioritária como pessoa com deficiência (PCD).");
                break;
            case 4:
                System.out.println("Você não tem direito à fila prioritária.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
