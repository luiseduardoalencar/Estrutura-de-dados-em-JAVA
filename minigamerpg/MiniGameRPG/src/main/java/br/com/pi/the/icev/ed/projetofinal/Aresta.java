package br.com.pi.the.icev.ed.projetofinal;
    /**
     * A classe Aresta representa a conexão entre duas cidades num grafo. Ela define o peso da aresta, bem como as cidades de início e fim que a aresta conecta.
     *
     *  @author Luis Eduardo
     *  @author Gabriel Gentil
     *  @author Sarah Ocy
     *  @author Alan Carneiro
     */
    public class Aresta {
        private int peso;
        private Cidade inicio;
        private Cidade fim;

        /**
         * Inicializa uma instância da classe Aresta com o peso, cidade de início e cidade de fim especificados.
         *
         * @param peso   O peso da aresta.
         * @param inicio A cidade de início da aresta.
         * @param fim    A cidade de fim da aresta.
         */
        public Aresta(int peso, Cidade inicio, Cidade fim) {
            this.peso = peso;
            this.inicio = inicio;
            this.fim = fim;
        }

        /**
         * Retorna o peso da aresta.
         *
         * @return O peso da aresta.
         */
        public int getPeso() {
            return peso;
        }

        /**
         * Define o peso da aresta.
         *
         * @param peso O novo peso da aresta.
         */
        public void setPeso(int peso) {
            this.peso = peso;
        }

        /**
         * Retorna a cidade de início da aresta.
         *
         * @return A cidade de início da aresta.
         */
        public Cidade getInicio() {
            return inicio;
        }

        /**
         * Define a cidade de início da aresta.
         *
         * @param inicio A nova cidade de início da aresta.
         */
        public void setInicio(Cidade inicio) {
            this.inicio = inicio;
        }

        /**
         * Retorna a cidade de fim da aresta.
         *
         * @return A cidade de fim da aresta.
         */
        public Cidade getFim() {
            return fim;
        }

        /**
         * Define a cidade de fim da aresta.
         *
         * @param fim A nova cidade de fim da aresta.
         */
        public void setFim(Cidade fim) {
            this.fim = fim;
        }
    }

