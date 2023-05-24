package br.com.pi.the.icev.ed.gestaohospital.models;
/**
 * Classe Paciente representa um paciente com nome, CPF e nível de prioridade.
 */
public class Paciente {
        private String nome;
        private String cpf;
        private int nivelprioridade;
    /**
     * Construtor da classe Paciente.
     * para nome o nome do paciente
     * para cpf o CPF do paciente
     * para nivelprioridade o nível de prioridade do paciente (0 - normal, 1 - leve, 2 - moderado, 3 - severo)
     */
        public Paciente(String nome, String cpf, int prioridade) {
            this.nome = nome;
            this.cpf = cpf;
            this.nivelprioridade = prioridade;
        }
    /**
     * Getters and Setters
     */
        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public int getNivelprioridade() {
            return nivelprioridade;
        }
    }

