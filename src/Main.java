import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("***** Bem vindo ao sistema *****");

        System.out.println("Por favor informe os seguintes dados:");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
        System.out.println("Estado Civil: ");
        String estado_civil = sc.nextLine();

        
        System.out.println("\nDados recebidos:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Estado Civil: " + estado_civil);


        sc.close();

    }
}