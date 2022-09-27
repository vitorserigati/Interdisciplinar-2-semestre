package oop.interdisciplinar.classes;
import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int idade;
    private Calendar dataNascimento;
    private Treino treino;

    public Pessoa(){}

    public Pessoa(String nome, Calendar dataNascimento, Treino treino){
        setNome(nome);
        setDataNascimento(dataNascimento);
        setTreino(treino);
        calculaIdade();
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        if (nome.length() >= 3 && nome != this.nome){
            this.nome = nome;
        }
    }

    public Calendar getDataNascimento(){
        return this.dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento){
        Calendar hoje = Calendar.getInstance();
        if((hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR)) >= 18){
            this.dataNascimento = dataNascimento;
        }
    }

    public Treino getTreino(){
        return this.treino;
    }
    public void setTreino(Treino treino){
        this.treino = treino;
    }

    public int getIdade(){
        return this.idade;
    }

    private void calculaIdade(){
        Calendar hoje = Calendar.getInstance();
        idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

    }
    public String toString(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nTipo de treino: " + getTreino();
    }
}
