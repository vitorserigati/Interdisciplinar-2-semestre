package oop.interdisciplinar;
import oop.interdisciplinar.classes.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) {
        // Instanciando uma lista de pessoas para armazenar os dados
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Treino> treinos = new ArrayList<>();
        char continua = 's';

        // Loop de repetição para que continue cadastrando novos usuários
        while (continua == 's'){
            String nome = JOptionPane.showInputDialog("Digite o nome da primeira pessoa: ");
            Calendar nascimento = Calendar.getInstance();

            //Tratando a string para conseguir a data de nascimento do usuário em formato de Data.
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String data = JOptionPane.showInputDialog("Digite a data de nascimento: dd/mm/aaaa");
            try{
                nascimento.setTime(sdf.parse(data));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            //Escolha de tipos de treino

            for (int i = 0; i<2; i++) {
                String treino = JOptionPane.showInputDialog(
                        "Diga o tipo de treino que o cliente deseja: Cardio, CrossFit, Força"
                );
                switch (treino) {
                    case "Cardio":
                        treinos.add(new Cardio());
                        break;

                    case "CrossFit":
                        treinos.add(new CrossFit());
                        break;
                    case "Força":
                        treinos.add(new Forca());
                        break;
                    case "Aeróbico":
                        treinos.add(new Aerobico());
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                }
            }
            pessoas.add(new Pessoa(nome, nascimento, treinos));
            JOptionPane.showMessageDialog(null, pessoas.get(0));
            continua = JOptionPane.showInputDialog("Deseja adicionar mais clientes? (s/n)").toLowerCase().charAt(0);
        }

    }

}