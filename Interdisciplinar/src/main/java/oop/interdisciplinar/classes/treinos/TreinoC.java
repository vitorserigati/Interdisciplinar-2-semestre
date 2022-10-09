package oop.interdisciplinar.classes.treinos;

import oop.interdisciplinar.Main;
import oop.interdisciplinar.classes.exercicios.Exercicio;

import java.util.ArrayList;

import static oop.interdisciplinar.Utils.createExercicioArray;

public class TreinoC extends Treino{
    ArrayList<Exercicio> exercicio = new ArrayList<>();

    public TreinoC(){
        String[] dias = new String[]{"Quarta", "Sábado"};
        super.setDias(dias);
        super.setName("Treino C");
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
        for(int i = 19; i < 31; i++){
            this.exercicio.add(tipos.get(i));
        }
    }
    @Override
    public String info() {
        return "Treino destinado ao ganho de massa e fortalecimento das costas\n" + getExercicio();
    }
}
