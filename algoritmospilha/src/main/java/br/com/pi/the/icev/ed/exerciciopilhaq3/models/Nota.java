package br.com.pi.the.icev.ed.exerciciopilhaq3.models;

public class Nota {
    private double nota;

    public Nota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nota=" + nota +
                '}';
    }
}
