package map.ordenacao;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.*;

public class AgendaDeEventos {
    private Map<LocalDateTime, Evento> eventosList;
    public AgendaDeEventos() {
        eventosList = new HashMap<LocalDateTime, Evento>();
    }

    private void adicionarEventos(LocalDateTime date ,String eventos, String atracao){
        eventosList.put(date, new Evento(eventos,atracao));
    }
    public void visualizarEventos(){
        Map<LocalDateTime, Evento> eventosTreeMap = new TreeMap<LocalDateTime, Evento>(eventosList);
        TreeMap<LocalDateTime, Evento> EventosTree = new TreeMap<>(eventosList);
        System.out.println("Variavel eventosTreeMap: "+eventosTreeMap);
        System.out.println("Variavel EventosTree: "+EventosTree);
        System.out.println(eventosTreeMap);

    }

    public void obterProximoEventos(){
        Map<LocalDateTime, Evento> eventosMap = new TreeMap<>(eventosList);
        LocalDateTime dataAtual = LocalDateTime.now();
        for(Map.Entry<LocalDateTime, Evento>  Eventos : eventosList.entrySet()){
            if(Eventos.getKey().isEqual(dataAtual) || Eventos.getKey().isAfter(dataAtual)){
                System.out.println("Proximo evento: " +Eventos.getValue()+ " acontecera na data: " + Eventos.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaDeEventos agendaDeEventos = new AgendaDeEventos();
        agendaDeEventos.adicionarEventos(LocalDateTime.now(), "Evento 1" , "Atração 1");
        agendaDeEventos.adicionarEventos(LocalDateTime.now(), "Evento 2" , "Atração 2");
        agendaDeEventos.adicionarEventos(LocalDateTime.now(), "Evento 3" , "Atração 3");
        agendaDeEventos.adicionarEventos(LocalDateTime.now(), "Evento 4" , "Atração 4");
        agendaDeEventos.visualizarEventos();
        agendaDeEventos.obterProximoEventos();
    }
}
