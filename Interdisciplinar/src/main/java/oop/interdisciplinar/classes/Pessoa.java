package oop.interdisciplinar.classes;
import java.util.Date;

public class Pessoa {
    String nome;
    Date dataNascimento;
    Treino treino;

    public Pessoa(){}

    public Pessoa(String nome, Date dataNascimento, Treino treino){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.treino = treino;
    }

    public String toString(){
        return nome + dataNascimento + treino;
    }
}
