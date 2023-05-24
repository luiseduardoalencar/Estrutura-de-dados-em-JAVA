package br.com.pi.the.icev.ed.exerciciopilhaq1.main;

import br.com.pi.the.icev.ed.exerciciopilhaq1.modelo.Caminhao;
import br.com.pi.the.icev.ed.exerciciopilhaq1.modelo.PilhaCaminhao;

public class Main {
    public static void main(String[] args) {

        var pilhaCaminhaoPerecivel = new PilhaCaminhao<>();
        var pilhaCaminhaoNaoPerecivel = new PilhaCaminhao<>();

        Caminhao c = new Caminhao("NFD-6543", true, 5000,true,"041212323-56");
        Caminhao d = new Caminhao("FPO-3454",true,4987,false,"453897675-45");


        pilhaCaminhaoPerecivel.push(c);
        pilhaCaminhaoNaoPerecivel.push(d);



        System.out.println(pilhaCaminhaoPerecivel);
        System.out.println(pilhaCaminhaoNaoPerecivel);
        pilhaCaminhaoPerecivel.pop();
        System.out.println(pilhaCaminhaoPerecivel);
        System.out.println(pilhaCaminhaoNaoPerecivel);
        System.out.println(pilhaCaminhaoPerecivel.isEmpty());



    }
}