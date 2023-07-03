package br.com.pi.the.icev.ed.projetofinal;

import java.util.Scanner;

    /**
     * A classe Mercador representa o personagem mercador do jogo, com quem o jogador, representado por Maxwell, pode interagir numa cidade. O mercador oferece a opção de trocar moedas por poder na joia e realiza essa troca com base nas condições do jogador.
     *
     *  @author Luis Eduardo
     *  @author Gabriel Gentil
     *  @author Sarah Ocy
     *  @author Alan Carneiro
     */
    public class Mercador {

        /**
         * Cria uma instância do Mercador.
         */
        public Mercador() {
        }

        /**
         * Verifica a quantidade de moedas que Maxwell possui.
         *
         * @return A quantidade de moedas de Maxwell.
         */
        public int verificarMoedas() {
            return Maxwell.getInstance().getMoedas();
        }

        /**
         * Verifica a cidade anterior visitada por Maxwell.
         *
         * @return O nome da cidade anterior.
         */
        public String verificarCidadeAnterior() {
            return Maxwell.getInstance().getCidadeAnterior();
        }

        /**
         * Verifica as condições de Maxwell para realizar a troca de moedas por poder na joia.
         *
         * @param resposta A resposta de Maxwell para a oferta de troca do mercador.
         */
        public void trocarMoedasPorPoder(String resposta) {
            if (Maxwell.getInstance().getMoedas() < 5) {
                if (Maxwell.getInstance().getProximaCidadePoder() < 3 && resposta.equals("S")) {
                    System.out.println("Você perdeu uma moeda e ganhou um de limiar na jóia");
                    Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 1);
                    Maxwell.getInstance().setLimitePoder(Maxwell.getInstance().getLimitePoder() + 1);
                } else if (Maxwell.getInstance().getProximaCidadePoder() < 3 && resposta.equals("N")) {
                    System.out.println("Você perdeu uma moeda");
                    Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 1);
                } else if (Maxwell.getInstance().getProximaCidadePoder() >= 3 && resposta.equals("S")) {
                    System.out.println("Você perdeu uma moeda e ganhou dois de limiar na jóia");
                    Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 1);
                    Maxwell.getInstance().setLimitePoder(Maxwell.getInstance().getLimitePoder() + 2);
                } else if (Maxwell.getInstance().getProximaCidadePoder() >= 3 && resposta.equals("N")) {
                    System.out.println("Você ganhou duas moedas");
                    Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() + 2);
                }
            } else if (Maxwell.getInstance().getMoedas() >= 5) {
                if (Maxwell.getInstance().getProximaCidadePoder() < 3 && resposta.equals("S")) {
                    System.out.println("Você perdeu três moedas e ganhou dois de limiar na jóia");
                    Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 3);
                    Maxwell.getInstance().setLimitePoder(Maxwell.getInstance().getLimitePoder() + 2);
                } else if (Maxwell.getInstance().getProximaCidadePoder() < 3 && resposta.equals("N")) {
                    System.out.println("Você perdeu duas moedas");
                    Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 2);
                } else if (Maxwell.getInstance().getProximaCidadePoder() >= 3 && resposta.equals("S")) {
                    System.out.println("Você perdeu uma moeda e ganhou três de limiar na jóia");
                    Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 1);
                    Maxwell.getInstance().setLimitePoder(Maxwell.getInstance().getLimitePoder() + 3);
                } else if (Maxwell.getInstance().getProximaCidadePoder() >= 3 && resposta.equals("N")) {
                    System.out.println("Você perdeu três moedas");
                    Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 3);
                }
            }
        }

        /**
         * Apresenta informações sobre o mercador ao jogador.
         *
         * @throws InterruptedException Se ocorrer uma interrupção durante a execução da thread.
         */
        public void informacoesMercador() throws InterruptedException {
            System.out.println("Mercador:");
            System.out.println("    Olá viajante!");
            Thread.sleep(1000);
            System.out.println("    Vejo que você veio de " + verificarCidadeAnterior() + " e que irá a " + Maxwell.getInstance().getProximaCidade().getNomeCidade() + ".");
            System.out.println("    Irei verificar seus status...");
            Thread.sleep(2000);
            System.out.println("    Vejo que você possui " + verificarMoedas() + " moedas. Além de " + Maxwell.getInstance().getPoder() + " de poder.");
            Thread.sleep(1000);
            System.out.println("    Cuidado para não se sobrecarregar!");
            System.out.println("    Lembre-se que seu limite é de " + Maxwell.getInstance().getLimitePoder() + " de poder.");
        }

        /**
         * Realiza a interação de troca com o mercador.
         *
         * @throws InterruptedException Se ocorrer uma interrupção durante a execução da thread.
         */
        public void trocaMercador() throws InterruptedException {
            Thread.sleep(1000);
            Scanner input = new Scanner(System.in);
            String resposta;

            do {
                System.out.print("    Gostaria de fazer uma troca? (S/N)");
                resposta = input.nextLine().toUpperCase();

                if (!resposta.equals("S") && !resposta.equals("N")) {
                    System.out.println("Entrada inválida. Digite S ou N.");
                }
            } while (!resposta.equals("S") && !resposta.equals("N"));

            if (resposta.equals("S")) {
                System.out.println("Troca aceita!");
                trocarMoedasPorPoder(resposta);
            } else if (resposta.equals("N")) {
                System.out.println("Troca recusada!");
                trocarMoedasPorPoder(resposta);
            }

            System.out.println("----------------------------------------------------------");
        }
    }

