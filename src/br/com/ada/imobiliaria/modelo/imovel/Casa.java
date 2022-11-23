package br.com.ada.imobiliaria.modelo.imovel;

import br.com.ada.imobiliaria.modelo.agenda.Agenda;
import br.com.ada.imobiliaria.modelo.endereco.Endereco;
import br.com.ada.imobiliaria.modelo.pessoas.Corretor;
import br.com.ada.imobiliaria.modelo.pessoas.Locatario;
import br.com.ada.imobiliaria.modelo.pessoas.Proprietario;

public class Casa extends Imovel implements Alugado {

    private boolean alugado ;

    private int quartos ;

    private int banheiros ;

    private int tamanho;

    private int andar ;

    private boolean piscina ;

    private boolean churrasqueira ;

    private int garagemQuantosCarros ;

    private boolean areaServico;

    private boolean areaLazer;

    public Casa(){
        super();
    }

    public Casa(int id, String nome, Endereco endereco, Proprietario proprietario, Locatario locatario, Corretor corretor, Agenda agenda, int quartos, int banheiros, int tamanho, int andar, boolean piscina, boolean churrasqueira, int garagemQuantosCarros, boolean areaServico, boolean areaLazer) {
        super(id, nome, endereco, proprietario, locatario, corretor, agenda);
        this.alugado = alugado;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.tamanho = tamanho;
        this.andar = andar;
        this.piscina = piscina;
        this.churrasqueira = churrasqueira;
        this.garagemQuantosCarros = garagemQuantosCarros;
        this.areaServico = areaServico;
        this.areaLazer = areaLazer;
    }

    public Casa quartos(int quartos){
        this.quartos = quartos;
        return this;
    }

    public Casa banheiros(int banheiros){
        this.banheiros = banheiros;
        return this;
    }

    public Casa tamanho(int tamanho){
        this.tamanho = tamanho;
        return this;
    }

    public Casa andar(int andar){
        this.andar = andar;
        return this;
    }

    public Casa piscina(boolean piscina){
        this.piscina = piscina;
        return this;
    }

    public Casa churrasqueira(boolean churrasqueira){
        this.churrasqueira = churrasqueira;
        return this;
    }

    public Casa garagemQuantosCarros(int garagemQuantosCarros){
        this.garagemQuantosCarros = garagemQuantosCarros;
        return this;
    }

    public Casa areaServico(boolean areaServico){
        this.areaServico = areaServico;
        return this;
    }

    public Casa areaLazer(boolean areaLazer){
        this.areaLazer = areaLazer;
        return this;
    }

    public Casa build(){

        int id = getId();
        String nome = getNome();
        Endereco endereco = getEndereco();
        Proprietario proprietario = getProprietario();
        Locatario locatario = getLocatario();
        Corretor corretor = getCorretor();
        Agenda agenda = getAgenda();

        Casa casaCriada = new Casa( id, nome, endereco, proprietario, locatario, corretor, agenda, quartos, banheiros, tamanho, andar, piscina, churrasqueira, garagemQuantosCarros, areaServico, areaLazer);
        return casaCriada;
    }




    @Override
    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean isChurrasqueira() {
        return churrasqueira;
    }

    public void setChurrasqueira(boolean churrasqueira) {
        this.churrasqueira = churrasqueira;
    }

    public int getGaragemQuantosCarros() {
        return garagemQuantosCarros;
    }

    public void setGaragemQuantosCarros(int garagemQuantosCarros) {
        this.garagemQuantosCarros = garagemQuantosCarros;
    }

    public boolean isAreaServico() {
        return areaServico;
    }

    public void setAreaServico(boolean areaServico) {
        this.areaServico = areaServico;
    }

    public boolean isAreaLazer() {
        return areaLazer;
    }

    public void setAreaLazer(boolean areaLazer) {
        this.areaLazer = areaLazer;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "alugado=" + alugado +
                ", tamanho=" + tamanho + " m2" +
                ", quartos=" + quartos +
                ", banheiros=" + banheiros +
                ", piscina=" + piscina +
                ", andar=" + andar +
                ", churrasqueira=" + churrasqueira +
                ", garagemQuantosCarros=" + garagemQuantosCarros +
                ", areaServico=" + areaServico +
                ", areaLazer=" + areaLazer +
                '}';
    }
}
