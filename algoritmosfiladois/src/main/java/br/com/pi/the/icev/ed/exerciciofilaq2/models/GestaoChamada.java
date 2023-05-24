package br.com.pi.the.icev.ed.exerciciofilaq2.models;

import java.util.LinkedList;
import java.util.Scanner;

public class GestaoChamada {
    private LinkedList<Chamada> filaprioridade;
    private LinkedList<Chamada> filabaixacomplexidade;
    private LinkedList<Chamada> filaaltacomplexidade;

    public GestaoChamada() {
        filaprioridade = new LinkedList<>();
        filabaixacomplexidade = new LinkedList<>();
        filaaltacomplexidade = new LinkedList<>();
    }
    public void direcionarchamada() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("é prioridade?<Responda com true ou false>: ");
        Boolean isPrioridade = scanner.nextBoolean();

        System.out.print("Nível de complexidade? 1 para baixa complexidade e 2 para alta complexidade: ");
        int complexidade = scanner.nextInt();


        Chamada chamada = new Chamada(isPrioridade, complexidade);

        if (isPrioridade) {
            filaprioridade.addLast(chamada);
            System.out.println("Cliente adicionado na fila de prioridades");
        } else if (!(isPrioridade)) {
            if (complexidade == 1) {
                filabaixacomplexidade.addLast(chamada);
                System.out.println("Cliente adicionado na fila de baixa complexidade!");
            }else if (complexidade == 2){
                filaaltacomplexidade.addLast(chamada);
                System.out.println("Cliente adicionado na fila de alta complexidade");
            }
        }else{
            System.out.println("Inválido!");
        }

    }
    public void finalizaratendimento(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 para fila prioridade, 2 para fila de baixa complexidade, 3 para fila de alta complexidade!");
        int respectivafila = scanner.nextInt();


        if (respectivafila == 1) {
            filaprioridade.removeFirst();
        } else if (respectivafila == 2) {
            filabaixacomplexidade.removeFirst();
        } else if (respectivafila == 3){
            filaaltacomplexidade.removeFirst();
        }else {
            System.out.println("fila inválida!");
        }

    }
    public int numdechamadasnafila() {
        return filaprioridade.size() + filabaixacomplexidade.size() + filaaltacomplexidade.size();
    }
}
