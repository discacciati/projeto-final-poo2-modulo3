package br.com.ada.imobiliaria.modelo.pessoas;

import br.com.ada.imobiliaria.modelo.endereco.Endereco;

public class Proprietario extends  DadosPessoais {

    private String nome;

    private String sobrenome;

    private String email;

    public Proprietario(int id, String cpf, String telefone, String profissao, String conjuge, Endereco endereco, String nome, String sobrenome, String email) {
        super(id, cpf, telefone, profissao, conjuge, endereco);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public Proprietario nome(String nome){
        this.nome = nome;
        return this;
    }

    public Proprietario sobrenome(String sobrenome){
        this.sobrenome = sobrenome;
        return this;
    }

    public Proprietario email(String email){
        this.email = email;
        return this;
    }

    public Proprietario builder(){
        int id = getId();
        String cpf = getCpf();
        String telefone = getTelefone();
        String profissao = getProfissao();
        String conjuge = getConjuge();
        Endereco endereco = getEndereco();

        Proprietario proprietarioCriado = new Proprietario(id, cpf, telefone, profissao, conjuge, endereco, nome, sobrenome, email);
        return  proprietarioCriado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
