
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Bem vindo ao Jogo de Adivinhação!");
        // Solicita o valor inicial do intervalo
        System.out.println("Insira o valor inicial do intervalo:");
        int valorInicial = sc.nextInt();

        // Solicita o valor final do intervalo
        System.out.println("Insira o valor final do intervalo:");
        int valorFinal = sc.nextInt();

        // Gera um número aleatório entre valorInicial e valorFinal
        int numeroAleatorio = aleatorio.nextInt(valorFinal - valorInicial + 1) + valorInicial;

        sc.nextLine();// Limpa a nova linha pendente

        String continuarJogo = "";

        while (!continuarJogo.equals("n")) {
            System.out.println("Digite a senha:");
            int senhaInserida = sc.nextInt();

            if (senhaInserida == numeroAleatorio) {
                System.out.println("Você ganhou!");
                break;// Sai do loop se o usuário ganhar

            } else {
                System.out.println("Tente novamente.");
            }

            // Pergunta se o jogador deseja continuar
            System.out.println("Deseja continuar? (Digite 'n' para não):");
            sc.nextLine();
            continuarJogo = sc.nextLine();
        }

        sc.close(); // Fecha o Scanner

    }
}
