//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {

        //variaveis
        double tamanho, velocidade, tempodedownloadsegundos, tempodedownloadminutos;
        
        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("escreva o tamanho do arquivo que vai baixar (em MB) ");
        tamanho = teclado.nextDouble();
        System.out.println("escreva a velocidade da sua internet (em Mbps)");
        velocidade = teclado.nextDouble();
        teclado.close();

        //calculo
        tempodedownloadsegundos = tamanho / (velocidade/8);
        tempodedownloadminutos = tempodedownloadsegundos / 60;

        //saída

        System.out.println("tempo de download em minutos " + tempodedownloadminutos);






    }
}
