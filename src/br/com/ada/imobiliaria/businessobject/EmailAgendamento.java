package br.com.ada.imobiliaria.businessobject;


import br.com.ada.imobiliaria.modelo.imovel.Imovel;

import java.util.List;

public class EmailAgendamento {

    public void enviarEmailAgendamentoVisita(Imovel imovel){
        System.out.println("EMAIL:");
        System.out.println("Sr(a). "+ imovel.getLocatario().getNome() +",");
        System.out.println("Agendamos sua visita ao imóvel "+ imovel.getNome());
        System.out.println("No endereço: " + imovel.getEndereco());
        System.out.println("O corretor resposável que irá te acompanhar será " + imovel.getCorretor().getNome() + ", contato: " + imovel.getCorretor().getTelefone());
        System.out.println("Qualquer dúvida, estamos à disposição");
        System.out.println("Atenciosamente,");
        System.out.println("Imobiliária POO2");
    }

    public void enviarEmailEmLote(List<Imovel> imoveis){
        System.out.println("Enviando email em lote para todos imóveis com visitas agendadas.");
    }

}
