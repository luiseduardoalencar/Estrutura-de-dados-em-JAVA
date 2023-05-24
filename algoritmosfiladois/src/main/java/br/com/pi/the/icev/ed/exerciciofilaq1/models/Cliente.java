package br.com.pi.the.icev.ed.exerciciofilaq1.models;

public class Cliente {
    private boolean prioridade;
    private int numprodutos;

    public Cliente(boolean prioridade, int numprodutos) {
        this.prioridade = prioridade;
        this.numprodutos = numprodutos;
    }

    public boolean isPrioridade() {
        return prioridade;
    }

    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }

    public int getNumprodutos() {
        return numprodutos;
    }

    public void setNumprodutos(int numprodutos) {
        this.numprodutos = numprodutos;
    }
}
