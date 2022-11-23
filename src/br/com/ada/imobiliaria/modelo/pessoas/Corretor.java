package br.com.ada.imobiliaria.modelo.pessoas;

import br.com.ada.imobiliaria.modelo.endereco.Endereco;

public class Corretor extends DadosPessoais {

    private String nome;

    private String sobrenome;

    private String email;

    public Corretor(int id, String cpf, String telefone, String profissao, String conjuge, Endereco endereco, String nome, String sobrenome, String email) {
        super(id, cpf, telefone, profissao, conjuge, endereco);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public Corretor nome(String nome){
        this.nome = nome;
        return this;
    }

    public Corretor sobrenome(String sobrenome){
        this.sobrenome = sobrenome;
        return this;
    }

    public Corretor email(String email){
        this.email = email;
        return this;
    }

    public Corretor builder(){
        int id = getId();
        String cpf = getCpf();
        String telefone = getTelefone();
        String profissao = getProfissao();
        String conjuge = getConjuge();
        Endereco endereco = getEndereco();

        Corretor corretorCriado = new Corretor(id, cpf, telefone, profissao, conjuge, endereco, nome, sobrenome, email);
        return  corretorCriado;
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
        return "Corretor{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
