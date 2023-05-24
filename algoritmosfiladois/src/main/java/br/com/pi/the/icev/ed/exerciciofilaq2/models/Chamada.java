package br.com.pi.the.icev.ed.exerciciofilaq2.models;

public class Chamada {
    private boolean prioridade;
    private int complexidade;

    public Chamada(boolean prioridade, int complexidade) {
        this.prioridade = prioridade;
        this.complexidade = complexidade;
    }

    public boolean isPrioridade() {
        return prioridade;
    }

    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }
}
