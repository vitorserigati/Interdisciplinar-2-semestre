package oop.interdisciplinar;

import oop.interdisciplinar.classes.exercicios.Exercicio;
import oop.interdisciplinar.classes.pessoas.Pessoa;
import oop.interdisciplinar.classes.treinos.*;
import javax.swing.JOptionPane;
import java.io.*;
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
                    "Diga o tipo de treino que o cliente deseja: A, B, C ou Personalizado."
            ).toLowerCase();
            //bloco de decisão baseado no input do usuário.
            switch (treino) {
                case "a" -> treinos.add(new TreinoA());
                case "b" -> treinos.add(new TreinoB());
                case "c" -> treinos.add(new TreinoC());
                case "personalizado" -> treinos.add(createTreino());
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

    public static ArrayList<Exercicio> createExercicioArray(String path){
        ArrayList<Exercicio> exercicio = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            while(line != null){
                String[] vect = line.split(",");
                exercicio.add(new Exercicio(Integer.parseInt(vect[0]), vect[1], vect[2]));
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return exercicio;
    }

    private static TreinoPersonalizado createTreino(){

        String[] dias = JOptionPane.showInputDialog("Digite os dias de seu treino (Separados por espaços): ").split(" ");
        ArrayList<Exercicio> escolhidos = new ArrayList<>();
        ArrayList<Exercicio> tipos = createExercicioArray(Main.file);
        while(escolhidos.size() < 13){
            StringBuilder string = new StringBuilder();
            for (Exercicio e : tipos) {
                string.append(e);
            }
            int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número dos exercícios que o cliente deseja: \n" + string));
            if(escolha > 0 && escolha < 32){
                escolhidos.add(tipos.get(escolha - 1));
            }else{
                    JOptionPane.showMessageDialog(null,"Valor inexistente. Tente novamente");
            }
        }
        StringBuilder string = new StringBuilder();
        for(Exercicio e : escolhidos){
            string.append(e);
        }
        JOptionPane.showMessageDialog(null, string);

        return new TreinoPersonalizado(dias, escolhidos);
    }

}
