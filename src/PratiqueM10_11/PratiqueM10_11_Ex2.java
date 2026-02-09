package PratiqueM10_11;

import java.util.Scanner;

public class PratiqueM10_11_Ex2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de elementos que deseja ter no vetor:");
        int quantidade_elementos = sc.nextInt();
        int[] vetor = new int[quantidade_elementos];

        for(int n = 0; n < quantidade_elementos; n++){
            System.out.println("\nInforme um número para posição " + n + " do seu vetor");
            vetor[n] = sc.nextInt();
        }

        System.out.println("\nResultado:");

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                vetor[i] *= 2;
            } else {
                vetor[i] *= vetor[i];
            }
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        sc.close();
    }

}
