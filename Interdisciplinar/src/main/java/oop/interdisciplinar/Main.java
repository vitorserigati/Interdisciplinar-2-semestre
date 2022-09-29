package oop.interdisciplinar;
import oop.interdisciplinar.classes.pessoa.Pessoa;
import oop.interdisciplinar.classes.treinos.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import static oop.interdisciplinar.Utils.*;


public class Main {
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static final Calendar nascimento = Calendar.getInstance();
    public static final ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static final ArrayList<Treino> treinos = new ArrayList<>();

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


}