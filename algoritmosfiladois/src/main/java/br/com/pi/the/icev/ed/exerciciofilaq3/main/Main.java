package br.com.pi.the.icev.ed.exerciciofilaq3.main;

import br.com.pi.the.icev.ed.exerciciofilaq3.models.GestaoSuporte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestaoSuporte gestaoSuporte = new GestaoSuporte();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Sistema de Gestão de atendimentos");
            System.out.println("Opção 1 -> Direcionar Atendimento");
            System.out.println("Opção 2 -> Finalizar um atendimento");
            System.out.println("Opção 3 -> Exibir numero de clientes");
            System.out.println("Opção 4 -> Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gestaoSuporte.direcionaratendimento();
                    break;
                case 2:
                    gestaoSuporte.finalizaratendimento();
                    break;
                case 3:
                    int numclientes = gestaoSuporte.numdechamadasnafila();
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
