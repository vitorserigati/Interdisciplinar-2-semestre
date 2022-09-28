package oop.interdisciplinar.classes;

public class Cardio extends Treino{
    public Cardio(){

        String[] dias = new String[]{"Sexta", "Sábado"};
        super.setDias(dias);
        super.setName("Cardio");
    }
}
