package oop.interdisciplinar.classes;

public class Aerobico extends Treino{
    public Aerobico(){
        String[] dias = new String[]{"Sábado", "Domingo"};
        super.setDias(dias);
        super.setName("Aeróbico");
    }
}
