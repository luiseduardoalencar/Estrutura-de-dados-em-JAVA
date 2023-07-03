package br.com.pi.the.icev.ed.projetofinal;
/**
 * Classe principal que inicializa o grafo com as suas cidades e arestas, e executa o restante do código num ‘loop’.
 *
 * @author Luis Eduardo
 * @author Gabriel Gentil
 * @author Sarah Ocy
 * @author Alan Carneiro
 *
 */
public class Main {
    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args Os argumentos de linha de comando.
     * @throws InterruptedException Se ocorrer uma interrupção durante a execução do programa.
     */
    public static void main(String[] args) throws InterruptedException {
        //Cria as cidades
        Grafo grafo = new Grafo();
        Cidade ubud = new Cidade("Ubud", false);
        Cidade kingdomOfLegmod = new Cidade("Kingdom of Legmod", false);
        Cidade principalityOfNekikh = new Cidade("Principality of Nekikh", false);
        Cidade principalityOfGritesthr = new Cidade("Principality of Gritesthr", false);
        Cidade protectorateOfDogrove = new Cidade("Protectorate of Dogrove", false);
        Cidade kingdomOfLastwatch = new Cidade("Kingdom of Lastwatch", false);
        Cidade grandDuchyOfSmalia = new Cidade("Grand Duchy of Smalia", false);
        Cidade kingdomOfOldcalia = new Cidade("Kingdom of Oldcalia", false);
        Cidade defalsia = new Cidade("Defalsia", true);
        Cidade kingdomOfKalb = new Cidade("Kingdom of Kalb", true);
        Cidade principalityOfKarhora = new Cidade("Principality of Karhora", false);
        Cidade aymarLeague = new Cidade("Aymar League", false);
        Cidade nargumun = new Cidade("Nargumun", false);
        Cidade vulneseEmpire = new Cidade("Vulnese Empire", true);
        Cidade bun = new Cidade("Bun", false);
        Cidade chandirSultinate = new Cidade("Chandir Sultinate", false);
        Cidade principalityOfKasya = new Cidade("Principality of Kasya", false);

        // Adiciona as cidades no vértice do grafo
        grafo.adicionarVertice(ubud);
        grafo.adicionarVertice(kingdomOfLegmod);
        grafo.adicionarVertice(principalityOfNekikh);
        grafo.adicionarVertice(principalityOfGritesthr);
        grafo.adicionarVertice(protectorateOfDogrove);
        grafo.adicionarVertice(kingdomOfLastwatch);
        grafo.adicionarVertice(grandDuchyOfSmalia);
        grafo.adicionarVertice(kingdomOfOldcalia);
        grafo.adicionarVertice(defalsia);
        grafo.adicionarVertice(kingdomOfKalb);
        grafo.adicionarVertice(principalityOfKarhora);
        grafo.adicionarVertice(aymarLeague);
        grafo.adicionarVertice(nargumun);
        grafo.adicionarVertice(vulneseEmpire);
        grafo.adicionarVertice(bun);
        grafo.adicionarVertice(chandirSultinate);
        grafo.adicionarVertice(principalityOfKasya);

        // Conecta as Cidades através das Arestas e determina o peso(poder) da aresta
        // Ubud
        grafo.adicionarAresta(2, ubud, kingdomOfLegmod);
        grafo.adicionarAresta(1, ubud, principalityOfNekikh);
        // Principality of Nekikh
        grafo.adicionarAresta(0, principalityOfNekikh, ubud);
        grafo.adicionarAresta(2, principalityOfNekikh, kingdomOfLegmod);
        grafo.adicionarAresta(5, principalityOfNekikh, principalityOfGritesthr);
        // Kingdom of Legmod
        grafo.adicionarAresta(0, kingdomOfLegmod, ubud);
        grafo.adicionarAresta(1, kingdomOfLegmod, principalityOfNekikh);
        grafo.adicionarAresta(5, kingdomOfLegmod, principalityOfGritesthr);
        grafo.adicionarAresta(3, kingdomOfLegmod, protectorateOfDogrove);
        grafo.adicionarAresta(4, kingdomOfLegmod, kingdomOfOldcalia);
        // Principality of Gritesthr
        grafo.adicionarAresta(1, principalityOfGritesthr, principalityOfNekikh);
        grafo.adicionarAresta(2, principalityOfGritesthr, kingdomOfLegmod);
        grafo.adicionarAresta(2, principalityOfGritesthr, protectorateOfDogrove);
        grafo.adicionarAresta(-2, principalityOfGritesthr, kingdomOfLastwatch);
        // Protectorate of Drogove
        grafo.adicionarAresta(5, protectorateOfDogrove, principalityOfGritesthr);
        grafo.adicionarAresta(2, protectorateOfDogrove, kingdomOfLegmod);
        grafo.adicionarAresta(4, protectorateOfDogrove, kingdomOfOldcalia);
        grafo.adicionarAresta(-2, protectorateOfDogrove, kingdomOfLastwatch);
        // Kingdom of Lastwatch
        grafo.adicionarAresta(5, kingdomOfLastwatch, principalityOfGritesthr);
        grafo.adicionarAresta(3, kingdomOfLastwatch, protectorateOfDogrove);
        grafo.adicionarAresta(4, kingdomOfLastwatch, kingdomOfOldcalia);
        grafo.adicionarAresta(1, kingdomOfLastwatch, grandDuchyOfSmalia);
        // Grand Duchy of Smalia
        grafo.adicionarAresta(2, grandDuchyOfSmalia, kingdomOfLastwatch);
        grafo.adicionarAresta(4, grandDuchyOfSmalia, kingdomOfOldcalia);
        // Kingdom of Oldcalia
        grafo.adicionarAresta(1, kingdomOfOldcalia, grandDuchyOfSmalia);
        grafo.adicionarAresta(-2, kingdomOfOldcalia, kingdomOfLastwatch);
        grafo.adicionarAresta(3, kingdomOfOldcalia, protectorateOfDogrove);
        grafo.adicionarAresta(2, kingdomOfOldcalia, kingdomOfLegmod);
        grafo.adicionarAresta(2, kingdomOfOldcalia, kingdomOfKalb);
        grafo.adicionarAresta(1, kingdomOfOldcalia, aymarLeague);
        grafo.adicionarAresta(-3, kingdomOfOldcalia, defalsia);
        // Defalsia
        grafo.adicionarAresta(4, defalsia, kingdomOfOldcalia);
        grafo.adicionarAresta(1, defalsia, aymarLeague);
        // Kingdom of Kalb
        grafo.adicionarAresta(4, kingdomOfKalb, kingdomOfOldcalia);
        grafo.adicionarAresta(0, kingdomOfKalb, vulneseEmpire);
        grafo.adicionarAresta(1, kingdomOfKalb, aymarLeague);
        // Aymar League
        grafo.adicionarAresta(-3, aymarLeague, defalsia);
        grafo.adicionarAresta(4, aymarLeague, kingdomOfOldcalia);
        grafo.adicionarAresta(2, aymarLeague, kingdomOfKalb);
        grafo.adicionarAresta(0, aymarLeague, vulneseEmpire);
        grafo.adicionarAresta(1, aymarLeague, chandirSultinate);
        grafo.adicionarAresta(5, aymarLeague, bun);
        grafo.adicionarAresta(0, aymarLeague, nargumun);
        grafo.adicionarAresta(-2, aymarLeague, principalityOfKarhora);
        // Pirncipality of Karhora
        grafo.adicionarAresta(1, principalityOfKarhora, aymarLeague);
        grafo.adicionarAresta(0, principalityOfKarhora, nargumun);
        // Nargumun
        grafo.adicionarAresta(-2, nargumun, principalityOfKarhora);
        grafo.adicionarAresta(1, nargumun, aymarLeague);
        grafo.adicionarAresta(5, nargumun, bun);
        // Bun
        grafo.adicionarAresta(0, bun, nargumun);
        grafo.adicionarAresta(1, bun, aymarLeague);
        grafo.adicionarAresta(1, bun, chandirSultinate);
        // Chandir Sultinate
        grafo.adicionarAresta(5, chandirSultinate, bun);
        grafo.adicionarAresta(1, chandirSultinate, aymarLeague);
        grafo.adicionarAresta(0, chandirSultinate, vulneseEmpire);
        grafo.adicionarAresta(-7, chandirSultinate, principalityOfKasya);
        // Vulnese Empire
        grafo.adicionarAresta(1, vulneseEmpire, chandirSultinate);
        grafo.adicionarAresta(1, vulneseEmpire, aymarLeague);
        grafo.adicionarAresta(0, vulneseEmpire, kingdomOfKalb);
        // Principality of Kasya
        grafo.adicionarAresta(1, principalityOfKasya, chandirSultinate);

        // Inicializa as variáveis necessárias
        int m = 0;
        Cidade corre = null;
        Mercador mercador = new Mercador();
        TrilhaSonora trilhaSonora = new TrilhaSonora();
        trilhaSonora.reproduzirMusica("src/main/TrilhaSonora/Musica.wav");

        do {
            // Definir Ubud como a cidade inicial
            if (m == 0) {
                corre = grafo.buscaLargura(ubud);
            } else {
                // Pagar pedágio ao chegar a cidade (uma moeda)
                Maxwell.getInstance().setMoedas(Maxwell.getInstance().getMoedas() - 1);
                // Verificar se Maxwell possui alguma missão
                Missoes.mostrarMissoesAtivas();
                // Verificar se o jogador deseja desistir da missão
                Missoes.desistirMissao();
                // Verificar se a cidade possui missão
                Missoes.verificarMissao(corre);
                // Verficar se completou alguma missão
                Missoes.completarMissao(corre);
                // Falar com o Mercador
                mercador.informacoesMercador();
                mercador.trocaMercador();
                // Ir para outra cidade
                corre = grafo.buscaLargura(corre);
            }
            m++;
        } while (!Maxwell.getInstance().isDead() && !Maxwell.getInstance().isGanhou());
        trilhaSonora.pararMusica();
    }
}
