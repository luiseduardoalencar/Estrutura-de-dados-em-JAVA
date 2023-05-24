package br.com.pi.the.icev.ed.exerciciopilhaq2.modelo;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class PilhaEditordeTexto<T> {

    private ArrayList<T> acao;

    //construtor sem argumento cria uma pilha do tamanho padrão
    public PilhaEditordeTexto(){
        this(16); //tamnho da pilha
    }

    //construtor cria uma pilha com o número especificado de elementos
    public PilhaEditordeTexto(int i) {
        int initCapacity = i > 0 ? i : 100;
        acao = new ArrayList<>(initCapacity);
    }

    //método push que inser o elemento na pilha
    public void push(T pushValue){
        //insere pushValue na Stack

        acao.add(pushValue);

    }

    public boolean isEmpty(){
        if (acao == null) {
            return true;
        }else{
           return false;
        }

    }
    public T pop(){
        if (acao.isEmpty())
            throw new EmptyStackException();

        return acao.remove(acao.size() - 1);
    }
    //Método desfazer que limita a quantidade de pops para 16
    public void desfazer(int quantidade) throws EmptyStackException {
        if  (acao.isEmpty()) {
            throw new EmptyStackException();
        } else if(quantidade < 16){
                for (int i = 0; i < quantidade; i++) {
                    pop();
                }
            } else if (quantidade > acao.size()) {
            throw new EmptyStackException();
        } else{
            System.out.println("Só é possível desfazer até 16 vezes");
        }
    }
    //função que retorna o tamanho da lista
    public int size(){
        return acao.size();
    }

    @Override
    public String toString() {
        return "itens digitados{" +
                 acao +
                '}';
    }
}
