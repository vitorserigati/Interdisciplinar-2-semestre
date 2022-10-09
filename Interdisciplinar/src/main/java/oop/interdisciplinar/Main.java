package oop.interdisciplinar;
import oop.interdisciplinar.classes.exercicios.Exercicio;
import oop.interdisciplinar.classes.pessoas.Pessoa;
import javax.swing.JOptionPane;
import java.io.File;
import java.util.ArrayList;

import static oop.interdisciplinar.Utils.*;


public class Main {
    private static final ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static String file = new File("").getAbsolutePath() + File.separator + "/src/main/resources/db/exercicios.csv";

    public static void main(String[] args) {

        char continua = 's';
        int count = 1;
        // Loop de repetição para que continue cadastrando novos usuários
        while (continua == 's') {
            String nome = JOptionPane.showInputDialog("Digite o nome da " + count +"ª pessoa: ");
            //Tratando a string para conseguir a data de nascimento do usuário em formato de Data.
            tratarInput();
            //Escolha de tipos de treino
            pessoas.add(escolherTreinos(nome));
            continua = JOptionPane.showInputDialog("Deseja adicionar mais clientes? (s/n)").toLowerCase().charAt(0);
            count++;
        }
        char decisao = JOptionPane.showInputDialog("Deseja exibir os dados dos usuários? (s/n)").toLowerCase().charAt(0);
        switch (decisao) {
            case 's' -> JOptionPane.showMessageDialog(null, getPessoas(pessoas));
            case 'n' -> JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa!");
            default -> JOptionPane.showMessageDialog(null, "Opção inválida. Encerrando programa.");
        }
    }


}