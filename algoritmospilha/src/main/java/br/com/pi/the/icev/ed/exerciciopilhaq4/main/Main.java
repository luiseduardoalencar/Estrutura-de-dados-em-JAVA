package br.com.pi.the.icev.ed.exerciciopilhaq4.main;


import br.com.pi.the.icev.ed.exerciciopilhaq4.Enum.TIPOS_DE_CARTAS12;
import br.com.pi.the.icev.ed.exerciciopilhaq4.Enum.TIPOS_DE_MANA;
import br.com.pi.the.icev.ed.exerciciopilhaq4.models.MagicCard;
import br.com.pi.the.icev.ed.exerciciopilhaq4.models.PilhaMagicCard;

public class Main {
    public static void main(String[] args) {
        var deck = new PilhaMagicCard<>();

        MagicCard carta1 = new MagicCard();
        carta1.setName("Guerreiro da lua");
        carta1.setType(TIPOS_DE_CARTAS12.CRIATURA);
        carta1.setManaiscolor(true);
        carta1.setTipomana(TIPOS_DE_MANA.MANA_BRANCA);
        carta1.setEffect("Bater no povo");
        carta1.setQuantidademana(3);

       deck.push(carta1);

       System.out.println(deck);
       deck.pop(0);
       System.out.println(deck);


    }
}
