package oop.interdisciplinar.classes.exercicios;

public class Exercicio {

    private int id;
    private String descricao;
    private String repeticoes;
    public Exercicio(int id, String descricao, String repeticoes){
        this.id = id;
        this.descricao = descricao;
        this.repeticoes = repeticoes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(String repeticoes) {
        this.repeticoes = repeticoes;
    }



    public int getId() {
        return id;
    }


    @Override
    public String toString(){
        return getId() + " " + getDescricao() + " " + getRepeticoes() + "\n";
    }
}
