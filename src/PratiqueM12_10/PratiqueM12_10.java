package PratiqueM12_10;

import java.util.Scanner;

public class PratiqueM12_10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo(a)!");
        System.out.print("Quantos Carros deseja inserir no sistema?: ");
        int quantidadeCarros = sc.nextInt();
        double somaValores = 0.0;

        if (quantidadeCarros <= 50){
            Carro[] carros = new Carro[quantidadeCarros];
            
            sc.nextLine();
            for(int i = 0; i < quantidadeCarros; i++){
                System.out.println("\nInsira os dados referente ao carro " + i + ": ");
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                
                carros[i] = new Carro();

                carros[i].nome = nome;
                carros[i].preco = preco;
                Carro.quantidade += 1;
                somaValores += carros[i].preco;
                sc.nextLine();
            }

            System.out.print("\nCarros inseridos: ");
            for(int i = 0; i < quantidadeCarros; i++){
                System.out.print(carros[i].nome + ",");
            }
            System.out.println("\nQuantidade de carros inseridos: " + Carro.quantidade);
            System.out.println("Valor total de todos os carros: R$" + somaValores);
        } else {
            System.out.print("Quantidade inválida! Quantidade máxima permitida: 50.");
        }
        

        sc.close();

    }

}
