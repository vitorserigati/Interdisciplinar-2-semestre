package oop.interdisciplinar.classes;

public class CrossFit extends Treino{
    public CrossFit(){

        String[] dias = new String[]{"Terça", "Quinta"};
        super.setDias(dias);
        super.setName("CrossFit");
    }
}
