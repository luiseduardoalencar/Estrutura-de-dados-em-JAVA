package br.com.pi.the.icev.ed.exerciciofilaq3.models;

import java.util.LinkedList;
import java.util.Scanner;

public class GestaoSuporte {
    private LinkedList<Atendimento> filaprioridade;
    private LinkedList<Atendimento> filaespecialista;
    private LinkedList<Atendimento> filatendentecomercial;
    private LinkedList<Atendimento> filacancelamento;

    public GestaoSuporte() {
        filaprioridade = new LinkedList<>();
        filaespecialista = new LinkedList<>();
        filatendentecomercial = new LinkedList<>();
        filacancelamento = new LinkedList<>();
    }
    public void direcionaratendimento() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("é prioridade?<Responda com true ou false>: ");
        Boolean isPrioridade = scanner.nextBoolean();

        System.out.print("Tipo de atendimento? 1 para especialistas" +
                " e 2 para atendimento comercial e 3 para cancelamento de serviços: ");
        int tipo = scanner.nextInt();


        Atendimento atendimento = new Atendimento(isPrioridade, tipo);

        if (isPrioridade) {
            filaprioridade.addLast(atendimento);
            System.out.println("Cliente adicionado na fila de prioridades");
        } else if (!(isPrioridade)) {
            if (tipo == 1) {
                filaespecialista.addLast(atendimento);
                System.out.println("Cliente direcionado para um especialista!");
            }else if (tipo == 2){
                filatendentecomercial.addLast(atendimento);
                System.out.println("Cliente direcionado para atendente comercial");
            } else if (tipo == 3) {
                filacancelamento.addLast(atendimento);
                System.out.println("Cliente direcionado para cancelamento de serviços");
            }
        }else{
            System.out.println("Inválido!");
        }

    }
    public void finalizaratendimento(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 para fila prioridade, 2 para fila de especialistas, " +
                " 3 para atendiemnto comercial e 4 para cancelamento de serviço!");
        int respectivafila = scanner.nextInt();


        if (respectivafila == 1) {
            filaprioridade.removeFirst();
        } else if (respectivafila == 2) {
            filaespecialista.removeFirst();
        } else if (respectivafila == 3){
            filatendentecomercial.removeFirst();
        }else if (respectivafila == 4){
            filacancelamento.removeFirst();

        }else{
            System.out.println("fila inválida!");
        }

    }
    public int numdechamadasnafila() {
        return filaprioridade.size() + filaespecialista.size() + filatendentecomercial.size() + filacancelamento.size();
    }
}
