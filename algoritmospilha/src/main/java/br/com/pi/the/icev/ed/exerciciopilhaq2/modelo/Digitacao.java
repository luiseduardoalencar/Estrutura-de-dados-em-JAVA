package br.com.pi.the.icev.ed.exerciciopilhaq2.modelo;


public class Digitacao {
    private String palavras;

    public String getPalavras() {
        return palavras;
    }

    public Digitacao(String palavras) {
        this.palavras = palavras;
    }

    public void setPalavras(String palavras) {
        this.palavras = palavras;
    }

    @Override
    public String toString() {
        return "Digitacao{" +
                "texto='" + palavras + '\'' +
                '}';
    }
}
