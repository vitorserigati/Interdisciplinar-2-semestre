package oop.interdisciplinar.classes;

import java.text.MessageFormat;
import java.util.Date;

public class Treino {
    String name;
    int dias;

    public Treino(){}
    public Treino(String name, int dias){
        this.name = name;
        this.dias = dias;
    }

    public String toString(){
        return MessageFormat.format("O treino {0} tem uma carga de {1} dias de treino", name, dias);
    }
}
