package br.com.ada.imobiliaria.modelo.agenda;

import br.com.ada.imobiliaria.businessobject.EmailAgendamento;
import br.com.ada.imobiliaria.enumeracao.EnumDiasSemana;
import br.com.ada.imobiliaria.modelo.imovel.Imovel;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private int id;

    private EnumDiasSemana diadaSemana;


    private List<Imovel> agendaImovel = new ArrayList<>(7);

    public Agenda(int id, EnumDiasSemana diadaSemana, List<Imovel> agendaImovel) {
        this.id = id;
        this.diadaSemana = diadaSemana;
        this.agendaImovel = agendaImovel;
    }

    public Agenda id(int id){
        this.id = id;
        return this;
    }

    public Agenda diasdaSemana(EnumDiasSemana diadaSemana){
        this.diadaSemana = diadaSemana;
        return this;
    }

    public Agenda agendaImovel(){
        this.agendaImovel = new ArrayList<>(7);
        return this;
    }

    public Agenda builder(){
        Agenda agendaCriada = new Agenda(id, diadaSemana, agendaImovel);
        return agendaCriada;
    }


    public Agenda(EnumDiasSemana diadaSemana) {
        this.diadaSemana = diadaSemana;
    }

    public int selecionarDia(EnumDiasSemana diadaSemana){

        int retorno = 0 ;

        switch (diadaSemana){
            case DOMINGO:
                retorno = 0 ;
                break;
            case SEGUNDA:
                 retorno = 1 ;
                break;
            case TERCA:
                retorno = 2 ;
                break;
            case QUARTA:
                retorno = 3 ;
                break;
            case QUINTA:
                retorno = 4 ;
                break;
            case SEXTA:
                retorno = 5 ;
                break;
            case SABADO:
                retorno = 6 ;
                break;
            default: break;
        }

        return retorno ;
    }

    public void agendarVisita(Imovel imovel, EnumDiasSemana diadaSemana ){
        int dia = selecionarDia(diadaSemana);
        if(agendaImovel.get(dia).equals(null)){
            agendaImovel.set(dia, imovel);
            EmailAgendamento emailAgendamento = new EmailAgendamento();
            emailAgendamento.enviarEmailAgendamentoVisita(imovel);
            System.out.println("Visita agendada para o imóvel "+ imovel.getNome());
        }else{
            System.out.println("Agenda não disponível para visitas neste dia.");
        }

    }

    public void desmarcarVisita(Imovel imovel, EnumDiasSemana diadaSemana ){
        int dia = selecionarDia(diadaSemana);
        agendaImovel.set(dia, null);
        System.out.println("Visita do imóvel "+ imovel.getNome() + " desmarcada!");

    }

    public void verAgenda(){
        System.out.println("______________ Agenda de Visitas_____________ ");

        for (int i = 0 ; i < 7 ; i++){
            String dia = "Domingo";
            switch (i){
                case 0 :
                    dia = "Domingo";
                    break;
                case 1 :
                    dia = "Segunda-Feira";
                    break;
                case 2 :
                    dia = "Terça-Feira";
                    break;
                case 3 :
                    dia = "Quarta-Feira";
                    break;
                case 4 :
                    dia = "Quinta-Feira";
                    break;
                case 5 :
                    dia = "Sexta-Feira";
                    break;
                case 6 :
                    dia = "Sábado";
                    break;
            }
            System.out.println("Agenda de "+ dia + " " + agendaImovel.get(i));
        }
    }


    public void limparAgenda(){

        System.out.println("_____________LIMPANDO AGENDA DE VISITAS DO IMÓVEL ______________");

        agendaImovel.clear();
    }

    public void setId(int id) {
        if (this.id == 0){
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public EnumDiasSemana getDiadaSemana() {
        return diadaSemana;
    }

    public void setDiadaSemana(EnumDiasSemana diadaSemana) {
        this.diadaSemana = diadaSemana;
    }

    public List<Imovel> getAgendaImovel() {
        return agendaImovel;
    }

    public void setAgendaImovel(List<Imovel> agendaImovel) {
        this.agendaImovel = agendaImovel;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "id=" + id +
                ", diadaSemana=" + diadaSemana +
                ", agendaImovel=" + agendaImovel +
                '}';
    }
}
