package PratiqueM9_10;

import java.util.Scanner;

public class PratiqueM9_10 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int continuar = 0;
        int multiplicador = 1;
        
        do{
            multiplicador = 1;
            System.out.println("Informe um número positivo:");
            numero = sc.nextInt();

            System.out.println("\nTabuada do: " + numero);
            while(multiplicador <=10){
                System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
                multiplicador++;
            }

            System.out.println("\nOpção 1:Continuar");
            System.out.println("Opção 2: Sair");
            continuar = sc.nextInt();

            if (continuar == 2){
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                sc.close();
                break;
            } else {
                System.out.println("\nDigite uma palvra ou uma frase:");
                sc.nextLine();
                String palavra_frase = sc.nextLine();
                System.out.println("\nA Palavra/Frase digitada foi: " + palavra_frase + "\n");
            }
        } while (true);


    }
}
