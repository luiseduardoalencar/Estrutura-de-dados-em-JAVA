package br.com.pi.the.icev.ed.projetofinal;

    /**
     * Representa o personagem Maxwell.
     *
     *  @author Luis Eduardo
     *  @author Gabriel Gentil
     *  @author Sarah Ocy
     *  @author Alan Carneiro
     */
    public class Maxwell {
        private static Maxwell instancia;
        private boolean isDead;
        private boolean isGanhou;

        private int poder = 0;
        private int moedas = 3;
        private int limitePoder = 7;
        private String cidadeAnterior;
        private boolean missao_1;
        private boolean missao_2;
        private boolean missao_3;
        private boolean emMissao;
        private Cidade cidadeAtual;
        private Cidade proximaCidade;
        private int proximaCidadePoder;

        /**
         * Obtém a instância única de Maxwell.
         *
         * @return A instância única de Maxwell.
         */
        public static Maxwell getInstance() {
            if (instancia == null) {
                instancia = new Maxwell();
            }
            return instancia;
        }

        /**
         * Verifica se Maxwell ganhou o jogo.
         *
         * @return True se Maxwell ganhou, False caso contrário.
         */
        public boolean isGanhou() {
            if (proximaCidade.getNomeCidade().equals("Nargumun")) {
                System.out.println("----------------------------------------------------------");
                if (getMoedas() > 10) {
                    System.out.println("Parabéns por carregar a jóia até seu destino!");
                    System.out.println("Você foi nomeado Rei de Nargumun!");
                } else if (getMoedas() >= 6) {
                    System.out.println("Parabéns por carregar a jóia até seu destino!");
                    System.out.println("Você foi nomeado Lorde de Nargumun!");
                } else {
                    System.out.println("Parabéns por carregar a jóia até seu destino!");
                    System.out.println("Você foi nomeado Servo da Coroa de Nargumun!");
                }
                return true;
            }
            return false;
        }

        /**
         * Define se Maxwell ganhou o jogo.
         *
         * @param isGanhou True se Maxwell ganhou, False caso contrário.
         */
        public void setGanhou(boolean isGanhou) {
            this.isGanhou = isGanhou;
        }

        /**
         * Verifica se Maxwell morreu.
         *
         * @return True se Maxwell morreu, False caso contrário.
         */
        public boolean isDead() {
            if (getInstance().getMoedas() <= 0) {
                System.out.println("----------------------------------------------------------");
                System.out.println("Você ficou sem moedas. Tente novamente");
                return true;
            } else if (getInstance().getPoder() > getInstance().getLimitePoder()) {
                System.out.println("----------------------------------------------------------");
                System.out.println("Seu poder excedeu o limite da joia e Maxwell não aguentou. Tente novamente");
                return true;
            }
            return false;
        }

        // Getters e Setters dos atributos restantes

        /**
         * Define se Maxwell está morto.
         *
         * @param isDead True se Maxwell está morto, False caso contrário.
         */
        public void setDead(boolean isDead) {
            this.isDead = isDead;
        }

        /**
         * Obtém o poder da próxima cidade.
         *
         * @return O poder da próxima cidade.
         */
        public int getProximaCidadePoder() {
            return proximaCidadePoder;
        }

        /**
         * Define o poder da próxima cidade.
         *
         * @param proximaCidadePoder O poder da próxima cidade.
         */
        public void setProximaCidadePoder(int proximaCidadePoder) {
            this.proximaCidadePoder = proximaCidadePoder;
        }

        /**
         * Obtém a próxima cidade.
         *
         * @return A próxima cidade.
         */
        public Cidade getProximaCidade() {
            return proximaCidade;
        }

        /**
         * Define a próxima cidade.
         *
         * @param proximaCidade A próxima cidade.
         */
        public void setProximaCidade(Cidade proximaCidade) {
            this.proximaCidade = proximaCidade;
        }

        /**
         * Obtém a cidade atual.
         *
         * @return A cidade atual.
         */
        public Cidade getCidadeAtual() {
            return cidadeAtual;
        }

        /**
         * Define a cidade atual.
         *
         * @param cidadeAtual A cidade atual.
         */
        public void setCidadeAtual(Cidade cidadeAtual) {
            this.cidadeAtual = cidadeAtual;
        }

        /**
         * Obtém o limite de poder.
         *
         * @return O limite de poder.
         */
        public int getLimitePoder() {
            return limitePoder;
        }

        /**
         * Define o limite de poder.
         *
         * @param limitePoder O limite de poder.
         */
        public void setLimitePoder(int limitePoder) {
            this.limitePoder = limitePoder;
        }

        /**
         * Obtém o poder de Maxwell.
         *
         * @return O poder de Maxwell.
         */
        public int getPoder() {
            return poder;
        }

        /**
         * Define o poder de Maxwell.
         *
         * @param poderAtualizado O poder atualizado de Maxwell.
         */
        public void setPoder(int poderAtualizado) {
            this.poder = poderAtualizado;
        }

        /**
         * Obtém o número de moedas de Maxwell.
         *
         * @return O número de moedas de Maxwell.
         */
        public int getMoedas() {
            return moedas;
        }

        /**
         * Define o número de moedas de Maxwell.
         *
         * @param moedasatuais O número de moedas atuais de Maxwell.
         */
        public void setMoedas(int moedasatuais) {
            this.moedas = moedasatuais;
        }

        /**
         * Obtém o nome da cidade anterior.
         *
         * @return O nome da cidade anterior.
         */
        public String getCidadeAnterior() {
            return cidadeAnterior;
        }

        /**
         * Define o nome da cidade anterior.
         *
         * @param cidadeAnterior O nome da cidade anterior.
         */
        public void setCidadeAnterior(String cidadeAnterior) {
            this.cidadeAnterior = cidadeAnterior;
        }

        /**
         * Verifica se a missão 1 está ativa.
         *
         * @return True se a missão 1 está ativa. False caso contrário.
         */
        public boolean isMissao_1() {
            return missao_1;
        }

        /**
         * Define se a missão 1 está ativa.
         *
         * @param missao_1 True se a missão 1 está ativa, False caso contrário.
         */
        public void setMissao_1(boolean missao_1) {
            this.missao_1 = missao_1;
        }

        /**
         * Verifica se a missão 2 está ativa.
         *
         * @return True se a missão 2 está ativa, False caso contrário.
         */
        public boolean isMissao_2() {
            return missao_2;
        }

        /**
         * Define se a missão 2 está ativa.
         *
         * @param missao_2 True se a missão 2 está ativa, False caso contrário.
         */
        public void setMissao_2(boolean missao_2) {
            this.missao_2 = missao_2;
        }

        /**
         * Verifica se a missão 3 está ativa.
         *
         * @return True se a missão 3 está ativa, False caso contrário.
         */
        public boolean isMissao_3() {
            return missao_3;
        }

        /**
         * Define se a missão 3 está ativa.
         *
         * @param missao_3 True se a missão 3 está ativa, False caso contrário.
         */
        public void setMissao_3(boolean missao_3) {
            this.missao_3 = missao_3;
        }

        /**
         * Verifica se Maxwell está numa missão.
         *
         * @return True se Maxwell está numa missão, False caso contrário.
         */
        public boolean isEmMissao() {
            return emMissao;
        }

        /**
         * Define se Maxwell está numa missão.
         *
         * @param emMissao True se Maxwell está numa missão, False caso contrário.
         */
        public void setEmMissao(boolean emMissao) {
            this.emMissao = emMissao;
        }
    }

