package oop.interdisciplinar.classes;
import java.text.MessageFormat;


public class Treino {
    private String name;
    private int[] dias;
   ;

    public Treino(){}
    public Treino(String name, int[] dias){
        setName(name);
        setDias(dias);
    }

    public String getName(){
        return this.name;
    }
    public int[] getDias(){
        return this.dias;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected void setDias(int[] dias){
        this.dias = dias;
    }
    public String toString(){
        return MessageFormat.format("O treino {0} tem uma carga de {1} dias de treino", getName(), getDias());
    }
}
