package br.com.pi.the.icev.ed.exerciciofilaq1.main;

import br.com.pi.the.icev.ed.exerciciofilaq1.models.GestaoSupermercado;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        GestaoSupermercado gestaosupermercado = new GestaoSupermercado();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Sistema de filas");
            System.out.println("Opção 1 -> Direcionar cliente à fila");
            System.out.println("Opção 2 -> Finalizar um atendimento");
            System.out.println("Opção 3 -> Exibir numero de clientes");
            System.out.println("Opção 4 -> Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gestaosupermercado.direcionarcliente();
                    break;
                case 2:
                    gestaosupermercado.finalizaratendimento();
                    break;
                case 3:
                    int numclientes = gestaosupermercado.numdepessoasesperando();
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
