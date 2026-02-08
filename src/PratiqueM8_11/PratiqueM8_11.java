package PratiqueM8_11;

import java.util.Scanner;

public class PratiqueM8_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo(a)!");

        while(true) {
            System.out.println("\nDigite seu Nome: ");
            String nome = sc.next();

            System.out.println("\nDigite um número positivo: ");
            int numero = sc.nextInt();
            
            System.out.println("O número escolhido foi: " + numero);
            System.out.println("Exibindo em ordem CRESCENTE:");
            for(int n = 0; n <= numero; n++){
                System.out.println(n);
            }

            System.out.println("\nExibindo em ordem DECRESCENTE:");
            for(int n = numero; n >=0; n--){
                System.out.println(n);
            }

            System.out.println("\nO seu nome possui: " + nome.length() + " letras.\n");
            System.out.println(nome);
            if (nome.length() > 6){
                for(int n = 0; n < (nome.length()-1); n++){
                    System.out.println(nome);
                }
            }
            
            System.out.println("\nDeseja continuar? (1=Sim/0=Não): ");
            int continuar = sc.nextInt();
            if (continuar == 0){
                System.out.println("\nVocê saiu!");
                break;
            }
        }

        sc.close();
    }

}
