package br.com.ada.imobiliaria.modelo.imovel;

import br.com.ada.imobiliaria.modelo.pessoas.Corretor;
import br.com.ada.imobiliaria.modelo.endereco.Endereco;
import br.com.ada.imobiliaria.modelo.pessoas.Locatario;
import br.com.ada.imobiliaria.modelo.pessoas.Proprietario;
import br.com.ada.imobiliaria.modelo.agenda.Agenda;

public class Imovel {

    private int id;

    private String nome;

    private Endereco endereco;

    private Proprietario proprietario;

    private Locatario locatario;

    private Corretor corretor;

    private Agenda agenda;

    public Imovel(int id, String nome, Endereco endereco, Proprietario proprietario, Locatario locatario, Corretor corretor, Agenda agenda) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.proprietario = proprietario;
        this.locatario = locatario;
        this.corretor = corretor;
        this.agenda = agenda;
    }

    public Imovel id(int id){
        this.id = id;
        return this;
    }

    public Imovel nome(String nome){
        this.nome = nome ;
        return this;
    }

    public Imovel build(){

        Imovel imovelCriado = new Imovel(id, nome, endereco, proprietario, locatario, corretor, agenda);
        return imovelCriado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", proprietario=" + proprietario +
                ", locatario=" + locatario +
                ", corretor=" + corretor +
                ", agenda=" + agenda +
                '}';
    }
}

