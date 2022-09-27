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
        char continua = 's';

        // Loop de repetição para que continue cadastrando novos usuários
        while (continua == 's'){
            int year, month, day;
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
            String treino = JOptionPane.showInputDialog(
                    "Diga o tipo de treino que o cliente deseja: Cardio, CrossFit, Força"
            );

            switch (treino){
                case "Cardio":
                    Cardio cardio = new Cardio();
                    pessoas.add(new Pessoa(nome, nascimento, cardio));
                    break;

                case "CrossFit":
                    CrossFit crossFit = new CrossFit();
                    pessoas.add(new Pessoa(nome, nascimento, crossFit));
                    break;
                case "Força":
                    Forca forca = new Forca();
                    pessoas.add(new Pessoa(nome, nascimento, forca));
                    break;
                case "Aeróbico":
                    Aerobico aerobico = new Aerobico();
                    pessoas.add(new Pessoa(nome, nascimento, aerobico));
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            JOptionPane.showMessageDialog(null, pessoas.get(0));
            continua = JOptionPane.showInputDialog("Deseja continuar? (s/n)").toLowerCase().charAt(0);
        }

    }
}