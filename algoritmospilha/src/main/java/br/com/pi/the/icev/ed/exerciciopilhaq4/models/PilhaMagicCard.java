package br.com.pi.the.icev.ed.exerciciopilhaq4.models;

import br.com.pi.the.icev.ed.exerciciopilhaq4.Enum.TIPOS_DE_CARTAS12;
import java.util.ArrayList;
import java.util.EmptyStackException;


public class PilhaMagicCard<T> extends MagicCard {

    private ArrayList<T> cartas;

    public PilhaMagicCard() {
        this(45); //tamnho da pilha
    }

    //construtor cria uma pilha com o número especificado de elementos
    public PilhaMagicCard(int i) {
        int initCapacity = i > 0 ? i : 45;
        cartas = new ArrayList<>(initCapacity);
    }

    //método push que insere o elemento na pilha
    public void push(T pushValue) {
        if(this.type == TIPOS_DE_CARTAS12.ARTEFATO.toString() || this.type == TIPOS_DE_CARTAS12.CRIATURA.toString() || this.type == TIPOS_DE_CARTAS12.FEITICO.toString()
                || this.type == TIPOS_DE_CARTAS12.ENCANTAMENTO.toString() || this.type == TIPOS_DE_CARTAS12.PLANESWALKER.toString() || this.type == TIPOS_DE_CARTAS12.TERRENO.toString() ) {
            if (cartas.isEmpty()) {
                cartas.add(pushValue);
            } else {
                System.out.println("Esse tipo de carta só pode ser adicionada com a pilha vazia");
            }
        }else{
            cartas.add(pushValue);
        }
    }

        public boolean isEmpty () {
            if (cartas.size() == 0) {
              return  true;
            } else {
              return  false;
            }

        }
        //método remove um item da pilha
        public T pop (int index) {
            if (cartas.isEmpty())
                throw new EmptyStackException();

            return cartas.remove(index);
        }

        //função que retorna o tamanho da lista
        public int size () {
            return cartas.size();
        }
        public ArrayList<T> top () {
           return cartas;
        }

        @Override
        public String toString () {
            return "Deck{" +
                    this.cartas +
                    '}';
        }
    }

