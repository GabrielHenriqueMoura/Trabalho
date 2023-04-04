package views;

import java.util.Scanner;

import esporte.Esportes;
 
public class Programa extends Esportes {
    public Programa(String nome, String time1, String time2, int numJogadores, String dataJogo) {
        super(nome, time1, time2, numJogadores, dataJogo);
    }

    @Override
    public void exibirResultados() {
        System.out.println("Resultados do cadastro do jogo de " + nome);
        System.out.println(time1 + " vs " + time2);
        System.out.println("Número de jogadores: " + numJogadores);
        System.out.println("Data do jogo: " + dataJogo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do esporte: ");
        String nomeEsporte = scanner.nextLine();

        System.out.print("Digite o nome do time 1: ");
        String time1 = scanner.nextLine();

        System.out.print("Digite o nome do time 2: ");
        String time2 = scanner.nextLine();

        System.out.print("Digite o número de jogadores: ");
        int numJogadores = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a data do jogo: ");
        String dataJogo = scanner.nextLine();

        Programa programa = new Programa(nomeEsporte, time1, time2, numJogadores, dataJogo);
        programa.exibirResultados();
    }
}