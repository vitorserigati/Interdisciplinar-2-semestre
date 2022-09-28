package oop.interdisciplinar.classes;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int idade;
    private Calendar dataNascimento;
    private ArrayList<Treino> treino;

    public Pessoa(String nome, Calendar dataNascimento, ArrayList<Treino> treino){
        setNome(nome);
        setDataNascimento(dataNascimento);
        setTreino(treino);
        calculaIdade();
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        if (nome.length() >= 3 && !nome.equals(this.nome)){
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
        else{
            JOptionPane.showMessageDialog(null, "Cliente não possuí idade suficiente para treinar.");
        }
    }

    public String getTreino(){

        return "1º treino: \n" + this.treino.get(0) + "\n2º treino: \n" + this.treino.get(1);
    }
    public void setTreino(ArrayList<Treino> treino){
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
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nTipo de treino: \n" + getTreino();
    }
}
