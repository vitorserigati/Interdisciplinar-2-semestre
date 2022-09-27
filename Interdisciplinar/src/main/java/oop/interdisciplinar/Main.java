package oop.interdisciplinar;
import oop.interdisciplinar.classes.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        char continua = 's';
        while (continua == 's'){
            String nome = JOptionPane.showInputDialog("Digite o nome da primeira pessoa: ");
            Date nasciment = new Date();
            String treino = JOptionPane.showInputDialog("Diga o tipo de treino que o cliente deseja: ");
            switch (treino){
                case "Cardio":
                    Cardio cardio = new Cardio();
                    pessoas.add(new Pessoa(nome, nasciment, cardio));
                    break;

                case "CrossFit":
                    CrossFit crossFit = new CrossFit();
                    pessoas.add(new Pessoa(nome, nasciment, crossFit));
                    break;
                case "Forca":
                    Forca forca = new Forca();
                    pessoas.add(new Pessoa(nome, nasciment, forca));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            continua = JOptionPane.showInputDialog("Deseja continuar? (s/n)").toLowerCase().charAt(0);
        }

    }
}