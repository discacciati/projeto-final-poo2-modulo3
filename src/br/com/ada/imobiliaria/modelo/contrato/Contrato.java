package br.com.ada.imobiliaria.modelo.contrato;

public interface Contrato<T> {

    void cabecalho();

    void proprietario(T t);

    void locatario(T t);

    void firmamAcordo();

    void clausula1(T t);

    void clausula2(String s);

    void clausula3();

    String getAssinaturaLocatario();

    String getAssinaturaProprietario();



}
