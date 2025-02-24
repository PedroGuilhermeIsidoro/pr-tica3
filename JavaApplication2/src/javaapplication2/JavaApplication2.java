package javaapplication2;

import java.util.Random;
public class JavaApplication2 {


    public static void main(String[] args) {
        int [][] matriz = new int[5][5];
        int soma = 0;
        Random r = new Random();
        for(int a = 0; a<=4;a++ ){
            for(int b = 0; b<=4; b++){
                matriz[a][b]= r.nextInt(1,100);
                System.out.print("["+a+"]"+"["+b+"]" + " = ");
                System.out.println(matriz[a][b]);
                soma += matriz[a][b];
        }
        }
        System.out.println(soma);
}
}