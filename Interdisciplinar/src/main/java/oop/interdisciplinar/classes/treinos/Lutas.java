package oop.interdisciplinar.classes.treinos;

public class Lutas extends Treino{
    public Lutas(){
        String[] dias = new String[]{"Terça", "Quinta"};
        super.setDias(dias);
        super.setName("Lutas");
    }

    @Override
    public String info(){
        return "Este tipo de treino é baseado em artes marciais";
    }
}
