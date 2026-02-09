package PratiqueM10_11;

import java.util.Scanner;

public class PratiqueM10_11_Ex1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de elementos que deseja ter no vetor:");
        int quantidade_elementos = sc.nextInt();
        int[] vetor = new int[quantidade_elementos];

        for(int n = 0; n < quantidade_elementos; n++){
            System.out.println("\nInforme um número para posição " + n + " do seu vetor");
            vetor[n] = sc.nextInt();
        }

        System.out.println("\nAbaixo seu vetor ordenado de forma crescente:");

        for(int n = 0; n < vetor.length; n++){
            for(int m = n; m < vetor.length; m++){
                if(vetor[m] < vetor[n]){
                    int aux = vetor[n];
                    vetor[n] = vetor[m];
                    vetor[m] = aux;
                }
            }
        }

        exibeVetorInt(vetor);

        System.out.println("\nAbaixo seu vetor ordenado de forma decrescente:");

        for(int n = 0; n < vetor.length; n++){
            for(int m = n; m < vetor.length; m++){
                if(vetor[m] > vetor[n]){
                    int aux = vetor[n];
                    vetor[n] = vetor[m];
                    vetor[m] = aux;
                }
            }
        }

        exibeVetorInt(vetor);
        
        sc.nextLine();
        System.out.println("\nAgora informe o seu nome:");
        String nome = sc.nextLine();
        char[] nome_arr = nome.toCharArray();
        char[] vogais = new char[] {'a', 'e', 'i', 'o', 'u'};
        int quantidade_vogais = 0;

        for(int c = 0; c < nome_arr.length; c++){
            for(int v = 0; v < vogais.length; v++){
                if(nome_arr[c] == vogais[v]){
                    quantidade_vogais++;
                }
            }
        }

        System.out.println("\nSeu nome possui: " + quantidade_vogais + " vogais!");

        sc.close();

    }

    private static void exibeVetorInt(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }

}
