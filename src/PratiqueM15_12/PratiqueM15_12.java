package PratiqueM15_12;

import java.util.Scanner;

public class PratiqueM15_12 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos degraus possui a escada?: ");
        int degraus = sc.nextInt();

        int maneiras = contagemDePassosPorDegrau(degraus);

        System.out.println("Há " + maneiras + " maneiras de subir até o topo!");

        sc.close();

    }

    public static int contagemDePassosPorDegrau(int degraus){
        if (degraus < 0) {
            return 0;
        }
        if (degraus == 0 || degraus == 1) {
            return 1;
        }
        return contagemDePassosPorDegrau(degraus - 1) + contagemDePassosPorDegrau(degraus - 2);
    }

}
