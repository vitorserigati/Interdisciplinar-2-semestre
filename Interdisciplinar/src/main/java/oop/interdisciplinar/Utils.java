package oop.interdisciplinar;

import oop.interdisciplinar.classes.pessoa.Pessoa;
import oop.interdisciplinar.classes.treinos.Cardiovascular;
import oop.interdisciplinar.classes.treinos.ExercicioLocalizado;
import oop.interdisciplinar.classes.treinos.Forca;
import oop.interdisciplinar.classes.treinos.Lutas;
import javax.swing.JOptionPane;


public class Utils {
    static public void tratarInput(){
        String data = JOptionPane.showInputDialog("Digite a data de nascimento: dd/mm/aaaa");
        try{
            Main.nascimento.setTime(Main.sdf.parse(data));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    static public void escolherTreinos(String nome){
        for (int i = 0; i < 2; i++) {
            String treino = JOptionPane.showInputDialog(
                    "Diga o tipo de treino que o cliente deseja: Cardiovascular, Lutas, Força, Exercícios Localizados"
            );
            //bloco de decisão baseado no input do usuário.
            switch (treino) {
                case "Cardiovascular" -> Main.treinos.add(new Cardiovascular());
                case "Lutas" -> Main.treinos.add(new Lutas());
                case "Força" -> Main.treinos.add(new Forca());
                case "Exercícios Localizados" -> Main.treinos.add(new ExercicioLocalizado());
                default -> JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
        Main.pessoas.add(new Pessoa(nome, Main.nascimento, Main.treinos));
    }

    static public String getPessoas(){
        StringBuilder info = new StringBuilder();
        int count = 1;
        for (Pessoa pessoa: Main.pessoas){
            info.append("\n").append(count).append(") ").append(pessoa).append("\n");
            count++;
        }
        return info.toString();
    }

}
