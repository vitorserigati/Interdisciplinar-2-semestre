package oop.interdisciplinar.classes.treinos;
import java.text.MessageFormat;

public abstract class Treino {
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

    public abstract StringBuilder getExercicio();
    public abstract String info();
    @Override
    public String toString(){
        return MessageFormat.format(
                "{0}\nO treino {1} tem uma carga de {2} dias de treino. Sendo estes nos dias: {3} e {4}",info() , getName(),
                getDias().length, getDias()[0], getDias()[1]);
    }
}
