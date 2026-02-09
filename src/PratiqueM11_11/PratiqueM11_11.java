package PratiqueM11_11;

import java.util.Scanner;

public class PratiqueM11_11 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Defina os dados da matrix 3 x 3 com números inteiros:");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("\nDigite um número inteiro para Linha: " + i + " e coluna: " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Os dados definidos são:");
        for (int i = 0; i < matriz.length; i++){
            System.out.print("Linha " + i + " => ");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("\nLinha: " + i + " e coluna: " + j + ": " + matriz[i][j]);
            }
        }
        

        sc.close();

    }

}
