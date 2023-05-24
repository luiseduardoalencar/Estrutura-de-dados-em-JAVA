package br.com.pi.the.icev.ed.exerciciofilaq3.models;

public class Atendimento {
    private boolean prioridade;
    private int tipo;

    public Atendimento(boolean prioridade, int tipo) {
        this.prioridade = prioridade;
        this.tipo = tipo;
    }

    public boolean isPrioridade() {
        return prioridade;
    }

    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
