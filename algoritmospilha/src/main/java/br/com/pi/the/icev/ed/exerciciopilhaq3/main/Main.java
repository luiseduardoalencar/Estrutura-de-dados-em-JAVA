package br.com.pi.the.icev.ed.exerciciopilhaq3.main;

import br.com.pi.the.icev.ed.exerciciopilhaq3.models.Nota;
import br.com.pi.the.icev.ed.exerciciopilhaq3.models.PilhaNota;

public class Main {
    public static void main(String[] args) {
        var pilhadenotas = new PilhaNota();

        Nota nota = new Nota(9.6);
        Nota nota2 = new Nota(8.6);
        Nota nota3 = new Nota(8.3);
        Nota nota4 = new Nota(9.8);

            pilhadenotas.push(nota);
            pilhadenotas.push(nota2);
            pilhadenotas.push(nota3);
            pilhadenotas.push(nota4);

        System.out.println(pilhadenotas);
    }


}
