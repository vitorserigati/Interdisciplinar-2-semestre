package oop.interdisciplinar.classes.treinos;

import oop.interdisciplinar.Main;
import oop.interdisciplinar.classes.exercicios.Exercicio;

import java.util.ArrayList;

import static oop.interdisciplinar.Utils.createExercicioArray;

public class TreinoA extends Treino{

    private ArrayList<Exercicio> exercicio = new ArrayList<>();



    public TreinoA(){
        String[] dias = new String[]{"Terça", "Quinta"};
        super.setDias(dias);
        super.setName("Treino  A");
        popularExercicio();
    }
    public StringBuilder getExercicio() {
        StringBuilder exercicios = new StringBuilder("\nNº Descrição Repetições\n\n");
        for(Exercicio e : this.exercicio){
            exercicios.append(e);
        }
        return exercicios;
    }
    private void popularExercicio(){
        ArrayList<Exercicio> tipos = createExercicioArray(Main.file);
        for(int i = 0; i < 9; i++){
            this.exercicio.add(tipos.get(i));
        }
    }

    @Override
    public String info() {
        return "Treino destinado a ganho de Massa muscular de peito e triceps\n"+ getExercicio();
    }
}
