package oop.interdisciplinar;
import oop.interdisciplinar.classes.pessoa.Pessoa;
import oop.interdisciplinar.classes.treinos.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class Main {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static final Calendar nascimento = Calendar.getInstance();
    private static final ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static final ArrayList<Treino> treinos = new ArrayList<>();

    public static void main(String[] args) {
        char continua = 's';
        int count = 1;
        // Loop de repetição para que continue cadastrando novos usuários
        while (continua == 's') {
            String nome = JOptionPane.showInputDialog("Digite o nome da " + count +"ª pessoa: ");
            //Tratando a string para conseguir a data de nascimento do usuário em formato de Data.
            tratarInput();
            //Escolha de tipos de treino
            escolherTreinos(nome);
            continua = JOptionPane.showInputDialog("Deseja adicionar mais clientes? (s/n)").toLowerCase().charAt(0);
            count++;
        }
        char decisao = JOptionPane.showInputDialog("Deseja exibir os dados dos usuários? (s/n)").toLowerCase().charAt(0);
        switch (decisao) {
            case 's' -> JOptionPane.showMessageDialog(null, getPessoas());
            case 'n' -> JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa!");
            default -> JOptionPane.showMessageDialog(null, "Opção inválida. Encerrando programa.");
        }
    }

    static void tratarInput(){
        String data = JOptionPane.showInputDialog("Digite a data de nascimento: dd/mm/aaaa");
        try{
            nascimento.setTime(sdf.parse(data));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    static private void escolherTreinos(String nome){
        for (int i = 0; i < 2; i++) {
            String treino = JOptionPane.showInputDialog(
                    "Diga o tipo de treino que o cliente deseja: Cardiovascular, Lutas, Força, Exercícios Localizados"
            );
            //bloco de decisão baseado no input do usuário.
            switch (treino) {
                case "Cardiovascular" -> treinos.add(new Cardiovascular());
                case "Lutas" -> treinos.add(new Lutas());
                case "Força" -> treinos.add(new Forca());
                case "Exercícios Localizados" -> treinos.add(new ExercicioLocalizado());
                default -> JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
        pessoas.add(new Pessoa(nome, nascimento, treinos));
    }

    static private String getPessoas(){
        StringBuilder info = new StringBuilder();
        int count = 1;
        for (Pessoa pessoa: pessoas){
            info.append("\n").append(count).append(") ").append(pessoa).append("\n");
            count++;
        }
        return info.toString();
    }

}