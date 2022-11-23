package br.com.ada.imobiliaria.modelo.contrato;


import br.com.ada.imobiliaria.modelo.imovel.Imovel;

public class AssinadoraContrato<T> implements Contrato, AditivoDeContrato {

    private String assinaturaProprietario;
    private String assinaturaLocatario;

    private Imovel imovel;

    private String valorAluguel;

    public AssinadoraContrato(String assinaturaProprietario, String assinaturaLocatario, Imovel imovel, String valorAluguel) {
        this.assinaturaProprietario = assinaturaProprietario;
        this.assinaturaLocatario = assinaturaLocatario;
        this.imovel = imovel;
        this.valorAluguel = valorAluguel;
    }

    @Override
    public void cabecalho(){
        System.out.println("       Contrato de Locação de Imóvel Residencial     ");
    }

    @Override
    public void proprietario(Object o) {
        System.out.println("De um lado, o proprietário, " + imovel.getProprietario());
    }

    @Override
    public void locatario(Object o) {
        System.out.println("De outro lado, o locatário, " + imovel.getLocatario());

    }

    @Override
    public void firmamAcordo() {

    }

    @Override
    public void clausula1(Object o) {
        System.out.println("CLAUSULA 1 - O objeto de locação é o imóvel residencial, localizado no endereço " + imovel.getEndereco() );
    }

    @Override
    public void clausula2(String valorAluguel) {
        System.out.println("CLAUSULA 2 - O prazo de locação é de 12 (doze) meses, renovável por mais 12 meses. ");
        System.out.println("O valor do aluguel mensal é de R$ " + valorAluguel + ", com reajustes anuais durante a renovação do contrato. ");


    }

    @Override
    public void clausula3() {
        System.out.println("O não cumprimento deste, implicará em multa, despejo e possíveis ações jurídicas. ");

    }

    @Override
    public String getAssinaturaLocatario() {
        return this.assinaturaLocatario ;
    }

    @Override
    public String getAssinaturaProprietario(){
        return this.assinaturaProprietario;
    }


    @Override
    public void novaClausulaDoAditivo() {

    }
}
