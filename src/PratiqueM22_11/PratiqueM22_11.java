package PratiqueM22_11;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PratiqueM22_11 {

    public static void main(String[] args) {

        LocalDateTime dataAtual = LocalDateTime.now();
        DiaDaSemana diaAtual = mapearDiaDaSemana(dataAtual.getDayOfWeek());

        Evento evento = new Evento("Exercício de Datas", dataAtual, diaAtual);

        System.out.println("Evento original:");
        evento.exibirEvento();

        LocalDateTime novaDataHora = evento.getDataHora().plusDays(5);
        evento.setDataHora(novaDataHora);
        evento.setDiaDaSemana(mapearDiaDaSemana(novaDataHora.getDayOfWeek()));

        System.out.println("\nEvento com +5 dias:");
        evento.exibirEvento();

        ZonedDateTime baseSistema = evento.getDataHora().atZone(ZoneId.systemDefault());
        ZonedDateTime dataSaoPaulo = baseSistema.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime dataGmt = baseSistema.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println("\nData/hora em São Paulo (BRT): " + dataSaoPaulo);
        System.out.println("Data/hora em GMT: " + dataGmt);

    }

    private static DiaDaSemana mapearDiaDaSemana(DayOfWeek dayOfWeek) {
        if (dayOfWeek == DayOfWeek.MONDAY) {
            return DiaDaSemana.SEGUNDA;
        }
        if (dayOfWeek == DayOfWeek.TUESDAY) {
            return DiaDaSemana.TERÇA;
        }
        if (dayOfWeek == DayOfWeek.WEDNESDAY) {
            return DiaDaSemana.QUARTA;
        }
        if (dayOfWeek == DayOfWeek.THURSDAY) {
            return DiaDaSemana.QUINTA;
        }
        if (dayOfWeek == DayOfWeek.FRIDAY) {
            return DiaDaSemana.SEXTA;
        }
        if (dayOfWeek == DayOfWeek.SATURDAY) {
            return DiaDaSemana.SÁBADO;
        }
        return DiaDaSemana.DOMINGO;
    }

}
