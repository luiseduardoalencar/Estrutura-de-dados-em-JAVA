package br.com.pi.the.icev.ed.projetofinal;

import java.util.ArrayList;

    /**
     * Representa uma cidade.
     *
     *  @author Luis Eduardo
     *  @author Gabriel Gentil
     *  @author Sarah Ocy
     *  @author Alan Carneiro
     */
    public class Cidade {
        private String nomeCidade;
        private boolean isMissao;
        private ArrayList<Aresta> arestasEntrada;
        private ArrayList<Aresta> arestasSaida;
        private boolean missaoAceita;

        /**
         * Inicializa a cidade.
         *
         * @param nomeCidade O nome da cidade.
         * @param isMissao   Indica se a cidade possui uma missão.
         */
        public Cidade(String nomeCidade, boolean isMissao) {
            this.nomeCidade = nomeCidade;
            this.isMissao = isMissao;
            this.arestasEntrada = new ArrayList<Aresta>();
            this.arestasSaida = new ArrayList<Aresta>();
            this.missaoAceita = false;
        }

        /**
         * Construtor de cópia.
         *
         * @param cidade_adici A cidade a ser copiada.
         */
        public Cidade(Cidade cidade_adici) {
            // Implementação do construtor de cópia
        }

        /**
         * Retorna o nome da cidade.
         *
         * @return O nome da cidade.
         */
        public String getNomeCidade() {
            return nomeCidade;
        }

        /**
         * Define o nome da cidade.
         *
         * @param nomeCidade O novo nome da cidade.
         */
        public void setNomeCidade(String nomeCidade) {
            this.nomeCidade = nomeCidade;
        }

        /**
         * Verifica se a cidade possui uma missão.
         *
         * @return true se a cidade possui uma missão, caso contrário false.
         */
        public boolean isMissao() {
            return isMissao;
        }

        /**
         * Define se a cidade possui uma missão.
         *
         * @param isMissao true se a cidade possui uma missão, caso contrário false.
         */
        public void setMissao(boolean isMissao) {
            this.isMissao = isMissao;
        }

        /**
         * Adiciona uma aresta de entrada à cidade.
         *
         * @param aresta A aresta de entrada a ser adicionada.
         */
        public void adicionarArestaEntrada(Aresta aresta) {
            this.arestasEntrada.add(aresta);
        }

        /**
         * Retorna a lista de arestas de entrada da cidade.
         *
         * @return A lista de arestas de entrada da cidade.
         */
        public ArrayList<Aresta> getArestasEntrada() {
            return arestasEntrada;
        }

        /**
         * Adiciona uma aresta de saída à cidade.
         *
         * @param aresta A aresta de saída a ser adicionada.
         */
        public void adicionarArestaSaida(Aresta aresta) {
            this.arestasSaida.add(aresta);
        }

        /**
         * Retorna a lista de arestas de saída da cidade.
         *
         * @return A lista de arestas de saída da cidade.
         */
        public ArrayList<Aresta> getArestasSaida() {
            return arestasSaida;
        }

        /**
         * Verifica se a missão da cidade foi aceita.
         *
         * @return true se a missão da cidade foi aceita, caso contrário false.
         */
        public boolean isMissaoAceita() {
            return missaoAceita;
        }

        /**
         * Define se a missão da cidade foi aceita.
         *
         * @param missaoAceita true se a missão da cidade foi aceita, caso contrário false.
         */
        public void setMissaoAceita(boolean missaoAceita) {
            this.missaoAceita = missaoAceita;
        }
    }


