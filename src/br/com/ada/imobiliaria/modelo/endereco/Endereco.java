package br.com.ada.imobiliaria.modelo.endereco;

public class Endereco {

    private int id;

    private String cep;

    private String estado;

    private String cidade;

    private String bairro;

    private String rua;

    private String numero;

    private String complemento;

    public Endereco() {
    }

    public Endereco(int id, String cep, String estado, String cidade, String bairro, String rua, String numero, String complemento) {
        this.id = id;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Endereco id( int id){
        this.id = id;
        return this;
    }

    public Endereco cep( String cep){
        this.cep = cep;
        return this;
    }

    public Endereco estado( String estado){
        this.estado = estado;
        return this;
    }

    public Endereco cidade( String cidade){
        this.cidade = cidade;
        return this;
    }

    public Endereco bairro( String bairro){
        this.bairro = bairro;
        return this;
    }

    public Endereco rua( String rua){
        this.rua = rua;
        return this;
    }

    public Endereco numero( String numero){
        this.numero = numero;
        return this;
    }

    public Endereco complemento( String complemento){
        this.complemento = complemento;
        return this;
    }

    public Endereco build(){
        Endereco enderecoCriado = new Endereco(id, cep, estado, cidade, bairro, rua, numero, complemento);
        return enderecoCriado;
    }


    public void setId(int id) {
        if (this.id == 0){
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", cep='" + cep + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
