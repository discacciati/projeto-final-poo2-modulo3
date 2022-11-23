package br.com.ada.imobiliaria.businessobject;

import java.util.List;

public class Relatorios <T> {

    public void gerarRelatorioIndividual(T t){
        System.out.println("####### GERANDO RELATORIO INDIVIDUAL DO IMÓVEL #######");
        System.out.println(t);

    }

    public void gerarRelatorioEmLote(List<T> lista){
        System.out.println("####### GERANDO RELATORIO DOS IMÓVEIS #######");
        for (T t:lista){
            System.out.println(t);
        }
    }

}
