package br.com.ada.imobiliaria.repository;

import br.com.ada.imobiliaria.modelo.imovel.Imovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ImovelRepository {

    private static List<Imovel> imoveisCadastrados = new ArrayList<>();

    public static int sequence = 1;

    public void setId(Imovel imovel){
        imovel.setId(sequence);
        imovel.getEndereco().setId(sequence);
        imovel.getAgenda().setId(sequence);
        imovel.getProprietario().setId(sequence);
        imovel.getProprietario().getEndereco().setId(sequence);
        imovel.getLocatario().setId(sequence);
        imovel.getLocatario().getEndereco().setId(sequence);
        imovel.getCorretor().setId(sequence);
        sequence++;
    }

    public void cadastrarImovel(Imovel imovel){
        setId(imovel);

        if(Objects.nonNull(imovel) && Objects.nonNull(imovel.getEndereco()) && Objects.nonNull(imovel.getProprietario())){
            imoveisCadastrados.add(imovel);
            System.out.println("Imóvel cadastrado com sucesso!");
        }else {
            System.out.println("Imóvel não cadastrado! Reveja informações do imóvel para efetuar o cadastro.");
        }

    }

    public void imprimirImoveisCadastrados(){
        System.out.println("_____________IMÓVEIS CADASTRADOS:_____________");
        for (Imovel imovel: imoveisCadastrados) {
            System.out.println(imovel);
        }

        if (imoveisCadastrados.isEmpty()){
            System.out.println("_____________NÃO HÁ IMÓVEIS CADASTRADOS_____________");
        }
    }


    public void limparBancoDeImoveisCadastrados(){

        if(1== 1){
            throw new IllegalArgumentException();
        }

        System.out.println("_____________ LIMPANDO O BANCO DE DADOS DOS IMÓVEIS___________");

        this.imoveisCadastrados.clear();
    }
}
