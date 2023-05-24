package br.com.pi.the.icev.ed.exerciciopilhaq4.models;

import br.com.pi.the.icev.ed.exerciciopilhaq4.Enum.TIPOS_DE_CARTAS12;
import br.com.pi.the.icev.ed.exerciciopilhaq4.Enum.TIPOS_DE_MANA;


public class MagicCard {

    private String name;
    protected String type;
    private boolean manaiscolor;
    private String tipomana;
    private double quantidademana;
    private String effect;

    public double getQuantidademana() {
        return quantidademana;
    }

    public void setQuantidademana(double quantidademana) {
        this.quantidademana = quantidademana;
    }

    public boolean isManaiscolor() {
        return manaiscolor;
    }

    public void setManaiscolor(boolean manaiscolor) {
        this.manaiscolor = manaiscolor;
    }

    public String getTipomana() {
        return tipomana;
    }
    //aqui o programa verifica se o tipo de mana está presente no ENUM TIPOS_DE_MANA
    public void setTipomana(TIPOS_DE_MANA tipomana) {
        if (!manaiscolor) {
            this.tipomana = null;
        } else {
            this.tipomana = tipomana.toString();
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    //Como há dois tipos de carta, foi criada uma classe ListaEnums, que possui o método verificarPresenca(),
    //Essa classe une os dois ENUMS TIPOS_DE_CARTA_1 e TIPOS_DE_CARTA_2, e transforma seus elementos num Arraylist
    public void setType(TIPOS_DE_CARTAS12 tipos12) {
        this.type = tipos12.toString();
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        return "MagicCard{" +
                "name='" + this.name + '\'' +
                ", type='" + this.type + '\'' +
                ", Mana Colorida? =" + this.manaiscolor +
                ", tipomana='" + this.tipomana + '\'' +
                ", quantidademana=" + this.quantidademana +
                ", effect=" + this.effect +
                '}';
    }
}
