package oop.interdisciplinar.classes.treinos;


public class Forca extends Treino{
    public Forca(){
        String[] dias = new String[]{"Segunda", "Quarta"};
        super.setDias(dias);
        super.setName("Força");
    }

    @Override
    public String info() {
        return "Treino dedicado ao ganho de massa muscular. Exercícios baseados em levantamento de peso";
    }
}
