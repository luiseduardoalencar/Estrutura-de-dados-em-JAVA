package br.com.pi.the.icev.ed.exerciciopilhaq3.models;

import java.util.ArrayList;
import java.util.EmptyStackException;



    public class PilhaNota<T> {

        private ArrayList<T> notas;

        //construtor sem argumento cria uma pilha do tamanho padrão
        public PilhaNota(){
            this(100); //tamnho da pilha
        }

        //construtor cria uma pilha com o número especificado de elementos
        public PilhaNota(int i) {
            int initCapacity = i > 0 ? i : 100;
            notas = new ArrayList<>(initCapacity);
        }

        //método push que inser o elemento na pilha
        public void push(T pushValue){
            //insere pushValue na Stack
            notas.add(pushValue);

        }

        public boolean isEmpty(){
            if (notas == null) {
                return true;
            }else{
                return false;
            }

        }
        public T pop() {
            if (notas.isEmpty())
                throw new EmptyStackException();

            return notas.remove(notas.size() - 1);
        }
        //função que retorna o tamanho da lista
        public int size(){
            return notas.size();
        }

        @Override
        public String toString() {
            return "notas{" +
                    notas +
                    '}';
        }
    }


