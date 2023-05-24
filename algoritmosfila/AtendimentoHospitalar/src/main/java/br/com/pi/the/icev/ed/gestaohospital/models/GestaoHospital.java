package br.com.pi.the.icev.ed.gestaohospital.models;

import java.util.LinkedList;
import java.util.Scanner;
        /**
         * Classe GestaoHospital representa um módulo de gestão de atendimento em um hospital.
         * Permite adicionar pacientes à fila, atender pacientes de acordo com a prioridade
         * e exibir informações sobre a fila de atendimento.
         */
public class GestaoHospital {
            /**
             * Foram criadas filas diferentes para o gerenciamento da regra de negócio
             * sobre a questão da sequência de atendimento variar de acordo com seu nível de prioridade
             */
        private LinkedList<Paciente> filanivelNormal;
        private LinkedList<Paciente> filanivelLeve;
        private LinkedList<Paciente> filanivelModerado;
        private LinkedList<Paciente> filanivelSevero;
        /**
         * Construtor da classe GestaoHospital.
         * Inicializa as filas para cada nível de prioridade.
         */
        public GestaoHospital() {
            filanivelNormal = new LinkedList<>();
            filanivelLeve = new LinkedList<>();
            filanivelModerado = new LinkedList<>();
            filanivelSevero = new LinkedList<>();
        }
        /**
         * Adiciona um paciente à fila com base em sua prioridade.
         * Solicita o nome, CPF e nível de prioridade do paciente ao usuário.
         * para nome o nome do paciente
         * para cpf o CPF do paciente
         * para nivelprioridade o nível de prioridade do paciente (0 - normal, 1 - leve, 2 - moderado, 3 - severo)
         */
        public void adicionarPaciente() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nome do paciente: ");
            String nome = scanner.nextLine();

            System.out.print("CPF do paciente: ");
            String cpf = scanner.nextLine();

            System.out.print("Nível de prioridade (0 - normal, 1 - leve, 2 - moderado, 3 - severo): ");
            int niveldeprioridade = scanner.nextInt();

            Paciente paciente = new Paciente(nome, cpf, niveldeprioridade);

            switch (niveldeprioridade) {
                case 0:
                    filanivelNormal.add(paciente);
                    break;
                case 1:
                    filanivelLeve.add(paciente);
                    break;
                case 2:
                    filanivelModerado.add(paciente);
                    break;
                case 3:
                    filanivelSevero.add(paciente);
                    break;
                default:
                    System.out.println("Prioridade inválida!");
                    break;
            }
        }
            /**
             * Atende o próximo paciente na fila de acordo com a prioridade.
             * Imprime o nome do paciente sendo atendido.O método poll() faz parte da classe LinkedList em Java
             * e é usado para remover e retornar o primeiro elemento da lista.
             */
        public void atenderProximoPaciente() {
            if (!filanivelSevero.isEmpty()) {
                Paciente paciente = filanivelSevero.poll();
                System.out.println("Atendendo próximo paciente severo: " + paciente.getNome());
            } else if (!filanivelModerado.isEmpty()) {
                Paciente paciente = filanivelModerado.poll();
                System.out.println("Atendendo próximo paciente moderado: " + paciente.getNome());
            } else if (!filanivelLeve.isEmpty()) {
                Paciente paciente = filanivelLeve.poll();
                System.out.println("Atendendo próximo paciente leve: " + paciente.getNome());
            } else if (!filanivelNormal.isEmpty()) {
                Paciente paciente = filanivelNormal.poll();
                System.out.println("Atendendo próximo paciente normal: " + paciente.getNome());
            } else {
                System.out.println("Não há pacientes na fila.");
            }
        }
            /**
             * Obtém o número total de pacientes na fila.
             */
        public int getNumeroPacientesNaFila() {
            return filanivelNormal.size() + filanivelLeve.size() + filanivelModerado.size() + filanivelSevero.size();
        }
}
