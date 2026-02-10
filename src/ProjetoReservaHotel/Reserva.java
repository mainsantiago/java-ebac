package ProjetoReservaHotel;

public class Reserva {

    private Hospede hospede;
    private int tipoQuarto;
    private int diasDeEstadia;
    static double valorDiaria = 67.5;
    static int quartosDisponiveis = 10;

    public Reserva(Hospede hospede, int tipoQuarto, int diasDeEstadia){
        if(quartosDisponiveis > 0){
            if (diasDeEstadia > 0){
                this.setHospede(hospede);
                this.setTipoQuarto(tipoQuarto);
                this.setdiasDeEstadia(diasDeEstadia);
                quartosDisponiveis--;
            } else {
                System.out.println("Dias de Reserva Inválido!");
            }
        } else {
            System.out.println("Não há Quartos Disponíveis!");
        }
    }

    @Override
    public String toString(){
        return "Hóspede: " + this.hospede.getNome() + " | Quarto: " + this.getTipoQuarto() + " | Quantidade de Dias de Reserva: " + this.getdiasDeEstadia() + " | Valor da Diária: " + Reserva.valorDiaria + " | Valor Total Hospedagem: R$ " + (this.getdiasDeEstadia() * Reserva.valorDiaria);
    }

    public Hospede getHospede(){
        return this.hospede;
    }

    public void setHospede(Hospede hospede){
        this.hospede = hospede;
    }

    public String getTipoQuarto(){
        String[] tiposQuarto = new String[3];
        tiposQuarto[0] = "Standard";
        tiposQuarto[1] = "Luxo";
        tiposQuarto[2] = "Presidencial";
        return tiposQuarto[this.tipoQuarto];
    }

    public void setTipoQuarto(int tipoQuarto){
        this.tipoQuarto = tipoQuarto;
    }

    public int getdiasDeEstadia(){
        return this.diasDeEstadia;
    }

    public void setdiasDeEstadia(int diasDeEstadia){
        this.diasDeEstadia = diasDeEstadia;
    }

}
