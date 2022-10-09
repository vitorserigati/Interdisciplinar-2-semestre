package oop.interdisciplinar.classes.treinos;

import oop.interdisciplinar.classes.exercicios.Exercicio;

import java.util.ArrayList;

public class TreinoPersonalizado extends Treino{

    ArrayList<Exercicio> exercicios;
    public TreinoPersonalizado(String[] dias, ArrayList<Exercicio> exercicios){
        super.setDias(dias);
        this.exercicios = exercicios;
        super.setName("Treino Personalizado");
    }
    public StringBuilder getExercicio() {
        StringBuilder exercicios = new StringBuilder("\nNº Descrição Repetições\n\n");
        for(Exercicio e : this.exercicios){
            exercicios.append(e);
        }
        return exercicios;
    }

    @Override
    public String info() {
        return "Treino dedicado especialmente à esse usuário\n" + getExercicio();
    }
}
