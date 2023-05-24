package br.com.pi.the.icev.ed.exerciciofilaq4.main;


import br.com.pi.the.icev.ed.exerciciofilaq4.models.GestaoOnibus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestaoOnibus gestaoonibus = new GestaoOnibus();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Sistema de Gestão de Onibus e Paradas");
            System.out.println("Opção 1 -> Modificar Fluxo em uma determinada regiao");
            System.out.println("Opção 2 -> Remover fluxo adicionado");
            System.out.println("Opção 3 -> Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gestaoonibus.direcionarfluxo();
                    break;
                case 2:
                    gestaoonibus.removerfluxo();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        } while (opcao != 3);
    }
}
