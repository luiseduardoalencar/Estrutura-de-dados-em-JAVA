package br.com.pi.the.icev.ed.exerciciofilaq2.main;

import br.com.pi.the.icev.ed.exerciciofilaq2.models.GestaoChamada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestaoChamada gestaoChamada = new GestaoChamada();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Sistema de filas de chamadas");
            System.out.println("Opção 1 -> Direcionar chamada à fila");
            System.out.println("Opção 2 -> Finalizar um atendimento");
            System.out.println("Opção 3 -> Exibir numero de clientes");
            System.out.println("Opção 4 -> Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gestaoChamada.direcionarchamada();
                    break;
                case 2:
                    gestaoChamada.finalizaratendimento();
                    break;
                case 3:
                    int numclientes = gestaoChamada.numdechamadasnafila();
                    System.out.println("Número de clientes em atendimento: " + numclientes);
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        } while (opcao != 4);
    }
}
