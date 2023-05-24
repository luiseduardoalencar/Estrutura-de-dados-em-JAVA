package br.com.pi.the.icev.ed.exerciciopilhaq2.main;

import br.com.pi.the.icev.ed.exerciciopilhaq2.modelo.Digitacao;
import br.com.pi.the.icev.ed.exerciciopilhaq2.modelo.PilhaEditordeTexto;

public class Main {
    public static void main(String[] args) {

        var campodetexto = new PilhaEditordeTexto<>();

        Digitacao texto1 = new Digitacao("texto 1");
        Digitacao texto2 = new Digitacao("texto 2");
        Digitacao texto3 = new Digitacao("TEXTO 3");


        while (campodetexto.size() < 17){
            campodetexto.push(texto1);
            System.out.println(campodetexto);
        }
            campodetexto.desfazer(15);


        campodetexto.push(texto3);
        campodetexto.push(texto2);
        campodetexto.push(texto3);
        System.out.println(campodetexto);
        campodetexto.desfazer(16);
        System.out.println(campodetexto);


    }
}
