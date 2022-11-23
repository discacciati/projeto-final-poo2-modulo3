package br.com.ada.imobiliaria.modelo.imovel;

import br.com.ada.imobiliaria.modelo.agenda.Agenda;
import br.com.ada.imobiliaria.modelo.endereco.Endereco;
import br.com.ada.imobiliaria.modelo.pessoas.Corretor;
import br.com.ada.imobiliaria.modelo.pessoas.Locatario;
import br.com.ada.imobiliaria.modelo.pessoas.Proprietario;

public class Apartamento extends Imovel implements Alugado{

    private boolean alugado ;

    private int quartos ;

    private int banheiros ;

    private int andar ;

    private int tamanho;

    private boolean nascente;

    private boolean churrasqueira ;

    private boolean piscina ;

    private boolean garagem ;

    private boolean areaServico;

    private boolean areaLazer;

    private boolean academia;

    private boolean salaoFesta;

    private boolean espacoKids;

    public Apartamento(){
        super();
    }
    public Apartamento(int id, String nome, Endereco endereco, Proprietario proprietario, Locatario locatario, Corretor corretor, Agenda agenda, int quartos, int banheiros, int tamanho, int andar, boolean nascente, boolean churrasqueira, boolean piscina, boolean garagem, boolean areaServico, boolean areaLazer, boolean academia, boolean salaoFesta, boolean espacoKids) {
        super(id, nome, endereco, proprietario, locatario, corretor, agenda);
        this.alugado = alugado;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.andar = andar;
        this.tamanho = tamanho;
        this.nascente = nascente;
        this.churrasqueira = churrasqueira;
        this.piscina = piscina;
        this.garagem = garagem;
        this.areaServico = areaServico;
        this.areaLazer = areaLazer;
        this.academia = academia;
        this.salaoFesta = salaoFesta;
        this.espacoKids = espacoKids;
    }

    public Apartamento quartos(int quartos){
        this.quartos = quartos;
        return this;
    }

    public Apartamento banheiros(int banheiros){
        this.banheiros = banheiros;
        return this;
    }

    public Apartamento tamanho(int tamanho){
        this.tamanho = tamanho;
        return this;
    }

    public Apartamento andar(int andar){
        this.andar = andar;
        return this;
    }

    public Apartamento nascente(boolean nascente){
        this.nascente = nascente;
        return this;
    }

    public Apartamento piscina(boolean piscina){
        this.piscina = piscina;
        return this;
    }

    public Apartamento churrasqueira(boolean churrasqueira){
        this.churrasqueira = churrasqueira;
        return this;
    }

    public Apartamento garagem(boolean garagem){
        this.garagem = garagem;
        return this;
    }

    public Apartamento areaServico(boolean areaServico){
        this.areaServico = areaServico;
        return this;
    }

    public Apartamento areaLazer(boolean areaLazer){
        this.areaLazer = areaLazer;
        return this;
    }

    public Apartamento academia(boolean academia){
        this.academia = academia;
        return this;
    }

    public Apartamento salaoFesta(boolean salaoFesta){
        this.salaoFesta = salaoFesta;
        return this;
    }

    public Apartamento espacoKids(boolean espacoKids){
        this.espacoKids = espacoKids;
        return this;
    }

    public Apartamento build(){

        int id = getId();
        String nome = getNome();
        Endereco endereco = getEndereco();
        Corretor corretor = getCorretor();
        Locatario locatario = getLocatario();
        Proprietario proprietario = getProprietario();
        Agenda agenda = getAgenda();

        Apartamento apartamentoCriado = new Apartamento( id, nome, endereco, proprietario, locatario, corretor, agenda, quartos, banheiros, tamanho, andar, nascente, piscina, churrasqueira, garagem, areaServico, areaLazer, academia, salaoFesta, espacoKids);
        return apartamentoCriado;
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

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isNascente() {
        return nascente;
    }

    public void setNascente(boolean nascente) {
        this.nascente = nascente;
    }

    public boolean isChurrasqueira() {
        return churrasqueira;
    }

    public void setChurrasqueira(boolean churrasqueira) {
        this.churrasqueira = churrasqueira;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isGaragem() {
        return garagem;
    }

    public void setGaragem(boolean garagem) {
        this.garagem = garagem;
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

    public boolean isAcademia() {
        return academia;
    }

    public void setAcademia(boolean academia) {
        this.academia = academia;
    }

    public boolean isSalaoFesta() {
        return salaoFesta;
    }

    public void setSalaoFesta(boolean salaoFesta) {
        this.salaoFesta = salaoFesta;
    }

    public boolean isEspacoKids() {
        return espacoKids;
    }

    public void setEspacoKids(boolean espacoKids) {
        this.espacoKids = espacoKids;
    }


    @Override
    public String toString() {
        return "Apartamento{" +
                "alugado=" + alugado +
                ", quartos=" + quartos +
                ", banheiros=" + banheiros +
                ", andar=" + andar +
                ", tamanho=" + tamanho +
                ", nascente=" + nascente +
                ", churrasqueira=" + churrasqueira +
                ", piscina=" + piscina +
                ", garagem=" + garagem +
                ", areaServico=" + areaServico +
                ", areaLazer=" + areaLazer +
                ", academia=" + academia +
                ", salaoFesta=" + salaoFesta +
                ", espacoKids=" + espacoKids +
                '}';
    }
}
