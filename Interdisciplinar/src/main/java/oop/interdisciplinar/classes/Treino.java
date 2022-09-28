package oop.interdisciplinar.classes;
import java.text.MessageFormat;

public class Treino {
    private String name;
    private String[] dias;

    public Treino(){}

    public String getName(){
        return this.name;
    }
    public String[] getDias(){
        return this.dias;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected void setDias(String[] dias){
        this.dias = dias;
    }
    public String toString(){
        return MessageFormat.format(
                "O treino {0} tem uma carga de {1} dias de treino. Sendo estes nos dias: {2} e {3}", getName(),
                getDias().length, getDias()[0], getDias()[1]);
    }
}
