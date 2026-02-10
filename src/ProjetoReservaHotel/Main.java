package ProjetoReservaHotel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Reserva[] reservas = new Reserva[Reserva.quartosDisponiveis];
        Hospede[] hospedes = new Hospede[20];
        int opcao;

        System.out.println("\nBem vindo(a) ao Sistema de Reservas do Hotel EBAC!");
        while(true){
            opcao = menu(sc);
            sc.nextLine();
            switch (opcao) {
                case 1:
                    exibeQuartosDisponiveis();
                    novaReserva(sc, hospedes, reservas);
                    break;
                case 2:
                    exibeQuartosDisponiveis();
                    listaReservas(reservas);
                    break;
                case 3:
                    buscarReserva(sc, reservas);
                    break;
                case 4:
                    ordernarReservas(reservas);
                    break;
                case 0:
                    System.out.println("Obrigado por usar nosso sistema! Até mais.");
                    return;
                default:
                    System.out.println("\nOpção Inválida!\n");
            }
        }

    }

    public static int menu(Scanner sc){
        System.out.println("\nEscolha abaixo qual opção deseja realizar:");
        System.out.println("1 = Nova Reserva");
        System.out.println("2 = Listar Reservas");
        System.out.println("3 = Buscar Reserva por Nome do Hóspede");
        System.out.println("4 = Ordenar Reservas Por Número de Dias (Decrescente)");
        System.out.println("0 = Sair");
        System.out.println();
        System.out.print("Qual opção deseja utilizar?: ");
        return sc.nextInt();
    }

    public static void exibeQuartosDisponiveis(){
        System.out.println("Quartos Disponíveis: " + Reserva.quartosDisponiveis);
    }

    public static void novaReserva(Scanner sc, Hospede[] hospedes, Reserva[] reservas){
        if(hospedes[0] == null){
            System.out.println("Nenhum Hóspede Cadastrado!");
            hospedes[0] = novoHospede(sc);
        }
        
        String opcao;

        sc.nextLine();
        while(true){
                System.out.println("\nSelecione o Hóspede para Nova Reserva: (Digite o número para selecionar)");
                for(int h = 0; h < hospedes.length; h++){
                    if(hospedes[h] != null)
                        System.out.println(h + " = " + hospedes[h].getNome());
                }
                System.out.print("\nHóspede já cadastrado? Se sim, tecle S para continuar, se não tecle N para cadastrar um novo Hóspede, 0 para Sair: ");
                opcao = sc.nextLine();

                if(opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("0")){
                    break;
                } else if(opcao.equalsIgnoreCase("n")) {
                    if(hospedes[hospedes.length-1] != null){
                        System.out.println("Não há mais espaço para cadastrar um novo Hóspede! Selecione um cadastro existente!");
                    } else {
                        int hPos = 0;
                        for(int h = 0; h < hospedes.length; h++){
                            if(hospedes[h] == null){
                                hPos = h;
                                break;
                            }
                        }
                        hospedes[hPos] = novoHospede(sc);
                    }
                }
        }
        
        if(opcao.equalsIgnoreCase("0"))
            return;

        System.out.print("\nQual Hóspede Deseja Efetuar a Reserva: ");
        int idHospede = sc.nextInt();

        for(int r = 0; r < reservas.length; r++){
            if(reservas[r] == null){
                System.out.print("\nTipo do Quarto: 0=Standard | 1=Luxo | 2=Presidencial: ");
                int tipoQuarto = sc.nextInt();
                System.out.print("\nQuantidade de dias de Estadia: ");
                int diasDeEstadia = sc.nextInt();
                reservas[r] = new Reserva(hospedes[idHospede], tipoQuarto, diasDeEstadia);
                
                if(reservas[r].getHospede() != null){
                    System.out.println("Reserva efetuada com sucesso!");
                    break;
                } else {
                    System.out.println("Dados Inválidos, tente novamente!");
                }
            }
        }
    }

    public static void listaReservas(Reserva[] reservas){
        for(int r = 0; r < reservas.length; r++){
            if(reservas[r] != null)
                System.out.println(reservas[r].toString());
        }
    }

    public static void buscarReserva(Scanner sc, Reserva[] reservas){
        System.out.print("Digite o Nome do Hóspede: ");
        String nomeHospede = sc.nextLine();
        
        for(int r = 0; r < reservas.length; r++){
            if(reservas[r] != null){
                if(reservas[r].getHospede().getNome().equalsIgnoreCase(nomeHospede)){
                    System.out.println(reservas[r].toString());
                }
            }
        }
    }

    public static void ordernarReservas(Reserva[] reservas){
        System.out.println("Reservas ordenadas pelos dias de Estadia (Decrescente)");
        for(int r = 0; r < reservas.length; r++){
            for (int p = r; p < reservas.length; p++){
                if(reservas[r] != null && reservas[p] != null){
                    if(reservas[r].getdiasDeEstadia() > reservas[p].getdiasDeEstadia()){
                        Reserva aux = reservas[r];
                        reservas[r] = reservas[p];
                        reservas[p] = aux;
                    }
                }
            }
        }

        listaReservas(reservas);
    }

    public static Hospede novoHospede(Scanner sc){
        System.out.print("\nNome do Hóspede: ");
        String nomeHospede = sc.nextLine();
        System.out.print("\nIdade do Hóspede: ");
        int idadeHospede = sc.nextInt();
        return new Hospede(nomeHospede, idadeHospede);
    }

}
