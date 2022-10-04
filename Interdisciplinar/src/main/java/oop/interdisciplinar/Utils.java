package oop.interdisciplinar;

import oop.interdisciplinar.classes.pessoa.Pessoa;
import oop.interdisciplinar.classes.treinos.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class Utils {
    private static final ArrayList<Treino> treinos = new ArrayList<>();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static final Calendar nascimento = Calendar.getInstance();
    static public void tratarInput(){
        String data = JOptionPane.showInputDialog("Digite a data de nascimento: dd/mm/aaaa");
        try{
            nascimento.setTime(sdf.parse(data));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    static public Pessoa escolherTreinos(String nome){
        treinos.clear();
        for (int i = 0; i < 2; i++) {
            String treino = JOptionPane.showInputDialog(
                    "Diga o tipo de treino que o cliente deseja: Cardiovascular, Lutas, Força, Exercícios Localizados"
            ).toLowerCase();
            //bloco de decisão baseado no input do usuário.
            switch (treino) {
                case "cardiovascular" -> treinos.add(new Cardiovascular());
                case "lutas" -> treinos.add(new Lutas());
                case "força" -> treinos.add(new Forca());
                case "exercícios localizados" -> treinos.add(new ExercicioLocalizado());
                default -> JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
        if (treinos.size() < 2){
            JOptionPane.showMessageDialog(null, "Treinos insuficientes. Tente novamente");
            escolherTreinos(nome);
        }
        return new Pessoa(nome, nascimento, treinos);
    }

    static public String getPessoas(ArrayList<Pessoa> pessoas){
        StringBuilder info = new StringBuilder();
        int count = 1;
        for (Pessoa pessoa: pessoas){
            info.append("\n").append(count).append(") ").append(pessoa).append("\n");
            count++;
        }
        return info.toString();
    }

}
