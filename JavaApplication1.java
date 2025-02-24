package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] salve = new int[10];
        int soma = 0;    
        for(int i=0;i<salve.length;i++){
        System.out.println(" me diga a altura em cm");
        salve[i] = scan.nextInt();
        soma += salve[i];
        }
        soma = soma/salve.length;
        System.out.println(soma + "cm");
    }
   
}