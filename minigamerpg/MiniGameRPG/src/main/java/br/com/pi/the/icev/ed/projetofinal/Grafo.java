package br.com.pi.the.icev.ed.projetofinal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

    /**
     * A classe Grafo representa o mapa do jogo, onde o jogador pode visualizar e escolher a próxima cidade para Maxwell se locomover.
     * O grafo consiste numa coleção de vértices (cidades) e arestas que representam as conexões entre as cidades.
     *
     *  @author Luis Eduardo
     *  @author Gabriel Gentil
     *  @author Sarah Ocy
     *  @author Alan Carneiro
     */
    public class Grafo {
        private ArrayList<Cidade> vertices;
        private ArrayList<Aresta> arestas;

        /**
         * Inicializa uma instância da classe Grafo com listas vazias de vértices e arestas.
         */
        public Grafo() {
            this.vertices = new ArrayList<Cidade>();
            this.arestas = new ArrayList<Aresta>();
        }

        /**
         * Adiciona um novo vértice (cidade) ao grafo.
         *
         * @param dado O dado (informações) da cidade a ser adicionada.
         */
        public void adicionarVertice(Cidade dado) {
            Cidade novoVertice = new Cidade(dado);
            this.vertices.add(novoVertice);
        }

        /**
         * Adiciona uma nova aresta ao grafo, especificando o peso, cidade de início e cidade de fim.
         *
         * @param peso       O peso (poder) da aresta.
         * @param dadoInicio O dado da cidade de início da aresta.
         * @param dadoFim    O dado da cidade de fim da aresta.
         */
        public void adicionarAresta(int peso, Cidade dadoInicio, Cidade dadoFim) {
            Cidade inicio = dadoInicio;
            Cidade fim = dadoFim;
            Aresta aresta = new Aresta(peso, inicio, fim);
            inicio.adicionarArestaEntrada(aresta);
            fim.adicionarArestaSaida(aresta);
            this.arestas.add(aresta);
        }

        /**
         * Realiza uma busca em largura no grafo a partir de uma cidade específica para determinar as cidades fronteiriças.
         * Permite que o jogador escolha a sua próxima cidade de destino.
         *
         * @param cidade A cidade de partida para a busca em largura.
         * @return A próxima cidade escolhida pelo jogador.
         */
        public Cidade buscaLargura(Cidade cidade) {
            Cidade percorre = cidade;
            ArrayList<Aresta> troca = new ArrayList<Aresta>();
            int num = 0;
            int k = 1;
            Maxwell.getInstance().setCidadeAtual(percorre);
            System.out.println("Cidade Atual: " + percorre.getNomeCidade() + "\n");

            // Demonstra as cidades que fazem fronteira com a atual e permite a escolha do jogador
            for (Aresta j : percorre.getArestasEntrada()) {
                System.out.println(k + ". " + j.getFim().getNomeCidade() + " - " + j.getPeso() + " de poder");
                troca.add(j);
                k++;
            }

            Scanner resposta = new Scanner(System.in);
            boolean entradaValida = false;

            do {
                try {
                    System.out.print("Digite o número correspondente ao seu destino: ");
                    num = resposta.nextInt();
                    if (num > 0 && num <= k - 1) {
                        entradaValida = true;
                    } else {
                        System.out.println("Número fora do intervalo válido. Tente novamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida.");
                    resposta.nextLine();
                }
            } while (!entradaValida);

            percorre = troca.get(num - 1).getFim();

        /* Atribuindo a próxima cidade (com o poder), a cidade anterior
        e o poder aos atributos do Maxwell */
            Maxwell.getInstance().setProximaCidade(percorre);
            Maxwell.getInstance().setCidadeAnterior(cidade.getNomeCidade());
            Maxwell.getInstance().setProximaCidadePoder(troca.get(num - 1).getPeso());

            int poderAtualizado = Maxwell.getInstance().getPoder() + troca.get(num - 1).getPeso();
            if (poderAtualizado < 0) {
                Maxwell.getInstance().setPoder(0);
            } else {
                Maxwell.getInstance().setPoder(poderAtualizado);
            }

            return percorre;
        }
    }


