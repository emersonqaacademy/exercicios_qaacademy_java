package easy;

import javax.swing.*;

public class Execucao_exercicios_easy {

    public static void main(String[] args) {
        int selecionaExercicio;
        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o exercicio a ser executado: "));

        if (selecionaExercicio == 2){
            Exercicio_02_easy ex02_easy = new Exercicio_02_easy();
            //String palavra = ex02_easy.retornaPalavra(JOptionPane.showInputDialog("Digite uma palavra: "));
            String palavra = ex02_easy.retornaPalavra("teste.com");
            System.out.println(palavra);
        }

        if (selecionaExercicio == 3){


        }

    }
}