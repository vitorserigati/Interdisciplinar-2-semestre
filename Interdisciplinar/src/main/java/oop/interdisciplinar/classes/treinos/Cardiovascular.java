package oop.interdisciplinar.classes.treinos;

public class Cardiovascular extends Treino{
    public Cardiovascular(){

        String[] dias = new String[]{"Sexta", "Sábado"};
        super.setDias(dias);
        super.setName("Cardiovascular");
    }

    @Override
    public String info() {
        return "Se você procura um estilo de vida mais saudável, este treino é didicado a você!";
    }
}
