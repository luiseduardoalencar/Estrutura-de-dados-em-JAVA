package br.com.pi.the.icev.ed.exerciciopilhaq1.modelo;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class PilhaCaminhao<T> {

    private ArrayList<T> caminhoes;

    //construtor sem argumento cria uma pilha do tamanho padrão
    public PilhaCaminhao(){
        this(10); //tamnho da pilha
    }

    //construtor cria uma pilha com o número especificado de elementos
    public PilhaCaminhao(int i) {
        int initCapacity = i > 0 ? i : 10;
        caminhoes = new ArrayList<>(initCapacity);
    }

    //método push que inser o elemento na pilha
    public void push(T pushValue){
        //insere pushValue na Stack
        caminhoes.add(pushValue);

    }
    public int size(){
        return caminhoes.size();
    }
    public boolean isEmpty(){
        if (caminhoes == null) {
            return true;
        }else{
           return false;
        }

    }
    public T pop(){
        if (caminhoes.isEmpty())
            throw new EmptyStackException();

        return caminhoes.remove(caminhoes.size() - 1);
    }

    @Override
    public String toString() {
        return "PilhaCaminhao{" +
                "caminhoes=" + caminhoes +
                '}';
    }
}
