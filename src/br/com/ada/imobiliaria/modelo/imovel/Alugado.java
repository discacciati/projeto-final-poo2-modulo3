package br.com.ada.imobiliaria.modelo.imovel;

public interface Alugado {

    boolean isAlugado();


    default void alugarImovel(){

            System.out.println("Este imóvel foi alugado.");

    };

}
