package br.com.pi.the.icev.ed.exerciciofilaq4.models;


import java.util.LinkedList;
import java.util.Scanner;

public class GestaoOnibus {
    private LinkedList<Parada> paradaemhorariodepico;
    private LinkedList<Parada> paradaforadehorariodepico;
    private LinkedList<LinkedList<Parada>> filaexpressa;
    private LinkedList<LinkedList<Parada>> filanormal;


    public GestaoOnibus() {
        paradaemhorariodepico = new LinkedList<>();
        paradaforadehorariodepico = new LinkedList<>();
        filaexpressa = new LinkedList<LinkedList<Parada>>();
        filanormal = new LinkedList<LinkedList<Parada>>();
    }


    public void direcionarfluxo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("é horário de pico?<Responda com true ou false>: ");
        Boolean isHorariodepico = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Digite a rua ou avenida da parada desejada ");
        String nomeParada = scanner.nextLine();


        Parada parada = new Parada(isHorariodepico);

        if (isHorariodepico) {
            paradaemhorariodepico.addLast(parada);
            filaexpressa.addLast(paradaemhorariodepico);
            System.out.println("Parada da "  + nomeParada + "Adicionada a fila expressa," +
                    "agora o fluxo de onibus é maior nessa região");
        } else {
            paradaforadehorariodepico.addLast(parada);
            filanormal.addLast(paradaforadehorariodepico);
            System.out.println("Parada da " + nomeParada + "Adicionada a fila normal, " +
                    "Agora o fluxo de ônibus é menor nessa região" );
        }

    }
    public void removerfluxo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 para retirar a ultima parada adicionada na fila expressa, e digite 2" +
                "para retirar a ultima parada adicionada na fila normal");
        int respectivafila = scanner.nextInt();


        if (respectivafila == 1) {
            filaexpressa.removeFirst();
            paradaemhorariodepico.removeFirst();
            System.out.println("Ultimo registro de parada expressa removido");
        } else if (respectivafila == 2) {
            filanormal.removeFirst();
            paradaforadehorariodepico.removeFirst();
            System.out.println("Ultimo registro de parada normal removido");
        }else{
            System.out.println("fila inválida!");
        }

    }
}
