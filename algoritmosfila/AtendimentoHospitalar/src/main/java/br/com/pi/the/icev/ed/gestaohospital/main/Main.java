package br.com.pi.the.icev.ed.gestaohospital.main;

import br.com.pi.the.icev.ed.gestaohospital.models.GestaoHospital;
import java.util.Scanner;
/**
 * Método main para demonstração do sistema de atendimento hospitalar.
 * Permite ao usuário realizar diferentes operações, como adicionar paciente à fila,
 * atender próximo paciente e exibir o número de pacientes na fila.
 */
public class Main {
    public static void main(String[] args) {
        GestaoHospital gestaoHospital = new GestaoHospital();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Hospital do Luis");
            System.out.println("Opção 1 -> Adicionar paciente à fila");
            System.out.println("Opção 2 -> Atender próximo paciente");
            System.out.println("Opção 3 -> Exibir número de pacientes na fila");
            System.out.println("Opção 4 -> Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gestaoHospital.adicionarPaciente();
                    break;
                case 2:
                    gestaoHospital.atenderProximoPaciente();
                    break;
                case 3:
                    int numeroPacientes = gestaoHospital.getNumeroPacientesNaFila();
                    System.out.println("Número de pacientes na fila: " + numeroPacientes);
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
