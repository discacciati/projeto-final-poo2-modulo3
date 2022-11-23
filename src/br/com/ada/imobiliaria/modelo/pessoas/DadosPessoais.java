package br.com.ada.imobiliaria.modelo.pessoas;

import br.com.ada.imobiliaria.modelo.endereco.Endereco;

public class DadosPessoais {

    private int id;

    private String cpf ;

    private String telefone ;

    private String profissao ;

    private String conjuge ;

    private Endereco endereco ;

    public DadosPessoais(int id, String cpf, String telefone, String profissao, String conjuge, Endereco endereco) {
        this.id = id;
        this.cpf = cpf;
        this.telefone = telefone;
        this.profissao = profissao;
        this.conjuge = conjuge;
        this.endereco = endereco;
    }

    public DadosPessoais() {

    }

    public DadosPessoais id(int id){
        this.id = id;
        return this;
    }

    public DadosPessoais cpf(String cpf){
        this.cpf = cpf;
        return this;
    }

    public DadosPessoais telefone(String telefone){
        this.telefone = telefone;
        return this;
    }

    public DadosPessoais profissao(String profissao){
        this.profissao = profissao;
        return this;
    }

    public DadosPessoais conjuge(String conjuge){
        this.conjuge = conjuge;
        return this;
    }

    public DadosPessoais endereco(Endereco endereco){
        this.endereco = endereco;
        return this;
    }

    public DadosPessoais builder(){
        DadosPessoais dadosCriados = new DadosPessoais(id, cpf, telefone, profissao, conjuge, endereco);
        return dadosCriados;
    }

    public void setId(int id) {
        if (this.id == 0){
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", profissao='" + profissao + '\'' +
                ", conjuge='" + conjuge + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
