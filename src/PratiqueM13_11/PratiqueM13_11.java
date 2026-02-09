package PratiqueM13_11;

import java.util.Scanner;

public class PratiqueM13_11 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos que deseja inserir:");
        int quantidadeAlunos = sc.nextInt();
        Aluno[] alunos = new Aluno[quantidadeAlunos];

        System.out.println("Inserindo " + quantidadeAlunos + " alunos");

        sc.nextLine();
        for(int i = 0; i < quantidadeAlunos; i++){
            System.out.println("Restam " + (quantidadeAlunos-i) + " alunos.");
            System.out.print("Nome Aluno: ");
            String nomeAluno = sc.nextLine();

            alunos[i] = new Aluno(nomeAluno);

            System.out.print("\nInforme as 4 notas do Aluno: " + nomeAluno);
            double totalNotas = .0;
            for(int j = 0; j < alunos[i].getNotas().length; j++){
                System.out.print("\nNota " + (j+1) + ": ");
                int nota = sc.nextInt();
                alunos[i].setNotas(nota, j);
                totalNotas += nota;
            }

            alunos[i].setMedia((totalNotas/4));
            sc.nextLine();
        }

        System.out.println("\nAlunos inseridos:");

        for(int i = 0; i < quantidadeAlunos; i ++){
            System.out.println("\nNome: " + alunos[i].getNome());
            System.out.print("Notas: ");
            for(int j = 0; j < alunos[i].getNotas().length; j++){
                System.out.print(alunos[i].getNotas()[j] + " | ");
            }
            System.out.println("\nMédia do Aluno: " + alunos[i].getMedia());
        }

        sc.close();

    }

}
