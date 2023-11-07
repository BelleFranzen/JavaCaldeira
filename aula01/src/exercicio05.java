import java.util.Scanner;

/** Criar um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois,
 * determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite. */

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora, minuto, segundo;
        System.out.println("Informe a hora: ");
        hora = scanner.nextInt();
        System.out.println("Informe o minuto: ");
        minuto = scanner.nextInt();
        System.out.println("Informe o segundo: ");
        segundo = scanner.nextInt();

        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {

            /** Outra forma de solução:
            int segundosPassados = hora * 3600 + minuto * 60 + segundo;
           int segundosFaltando = 86400 - segundosPassados; */

            int quantidadeMinutos = hora * 60;
            int quantidadeSegundos = (quantidadeMinutos + minuto) * 60;
            int segundosPassados = quantidadeSegundos + segundo;

            int segundosFaltando = 86400 - segundosPassados;
            System.out.println("Segundos passados desde 0h00min00s: " + segundosPassados);
            System.out.println("Segundos faltando para meia-noite: " + segundosFaltando);

        } else {
            System.out.println("Entrada de tempo inválida.");
        }
        scanner.close();
    }
}
