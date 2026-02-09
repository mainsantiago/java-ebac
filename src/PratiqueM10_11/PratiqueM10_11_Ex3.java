package PratiqueM10_11;

import java.util.Scanner;

public class PratiqueM10_11_Ex3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        char[] nome_arr = nome.toCharArray();
        String nome_contrario = "";

        for(int c = (nome_arr.length-1); c >= 0; c--){
            nome_contrario += nome_arr[c];
        }

        System.out.println("\nSeu nome ao contrário:");
        System.out.println(nome_contrario);

        sc.close();

    }

}
