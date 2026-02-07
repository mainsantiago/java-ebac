import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo(a)! Por gentileza informe dois números:");

        System.out.println("Primeiro Número:");
        int numero1 = sc.nextInt();

        System.out.println("Segundo Número:");
        int numero2 = sc.nextInt();

        if (numero1 == numero2){
            System.out.println("Os números são iguais!");
        } else {
            int maiorNumero = numero1 > numero2 ? numero1 : numero2;
            System.out.println("O maior número é: " + maiorNumero);
        }

        sc.close();


    }
}
