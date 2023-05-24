package br.com.pi.the.icev.ed.exerciciofilaq1.models;

import java.util.LinkedList;
import java.util.Scanner;

public class GestaoSupermercado {
    private LinkedList<Cliente> filaprioridade;
    private LinkedList<Cliente> filanormal;
    private LinkedList<Cliente> filapequenascompras;

    public GestaoSupermercado() {
        filaprioridade = new LinkedList<>();
        filanormal = new LinkedList<>();
        filapequenascompras = new LinkedList<>();
    }
    public void direcionarcliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("é prioridade?<Responda com true ou false>: ");
        Boolean isPrioridade = scanner.nextBoolean();

        System.out.print("Numero de itens comprados: ");
        int numprodutos = scanner.nextInt();


       Cliente cliente = new Cliente(isPrioridade, numprodutos);

        if (isPrioridade) {
            filaprioridade.addLast(cliente);
            System.out.println("Cliente adicionado na fila de prioridades");
        } else if (!(isPrioridade)) {
            if (numprodutos <= 10) {
                filapequenascompras.addLast(cliente);
                System.out.println("Cliente adicionado na fila de pequenas compras!");
            }else{
                filanormal.addLast(cliente);
                System.out.println("Cliente adicionado na fila normal");
            }
        }else{
            System.out.println("Inválido!");
        }

    }
    public void finalizaratendimento(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 para fila normal, 2 para fila com prioridade, 3 para fila de pequenas compras!");
        int respectivafila = scanner.nextInt();


        if (respectivafila == 1) {
            filanormal.removeFirst();
        } else if (respectivafila == 2) {
            filaprioridade.removeFirst();
        } else if (respectivafila == 3){
            filapequenascompras.removeFirst();
        }else {
            System.out.println("fila inválida!");
        }

    }
    public int numdepessoasesperando() {
        return filanormal.size() + filapequenascompras.size() + filaprioridade.size();
    }
}
