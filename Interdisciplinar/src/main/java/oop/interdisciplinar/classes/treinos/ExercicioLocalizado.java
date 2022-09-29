package oop.interdisciplinar.classes.treinos;

public class ExercicioLocalizado extends Treino{
    public ExercicioLocalizado(){
        String[] dias = new String[]{"Sábado", "Domingo"};
        super.setDias(dias);
        super.setName("Aeróbico");
    }

    @Override
    public String info() {
        return "Para você que deseja perder peso e queimar aquelas gordurinhas localizadas";
    }
}
