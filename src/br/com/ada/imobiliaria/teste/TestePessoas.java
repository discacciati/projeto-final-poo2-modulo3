package br.com.ada.imobiliaria.teste;

import br.com.ada.imobiliaria.modelo.endereco.Endereco;
import br.com.ada.imobiliaria.modelo.pessoas.Corretor;
import br.com.ada.imobiliaria.modelo.pessoas.Locatario;
import br.com.ada.imobiliaria.modelo.pessoas.Proprietario;

import java.util.Scanner;

public class TestePessoas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando um Corretor
        criarCorretor();

        // Criando um Proprietário
        criarProprietario();

        //Criando um Locatário
        criarLocatario();



    }

    public static void criarCorretor(){

        int id = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as informações sobre o corretor do imóvel:");
        System.out.println(" Primeiro Nome: ");
        String nomeCorretorApartamento = scanner.next();
        System.out.println(" Sobrenome: ");
        String sobrenomeCorretorApartamento = scanner.next();
        System.out.println(" E-mail: ");
        String emailCorretorApartamento = scanner.next();
        System.out.println(" CPF: ");
        String cpfCorretorApartamento = scanner.next();
        System.out.println(" Telefone: ");
        String telefoneCorretorApartamento = scanner.next();
        System.out.println(" Profissão: ");
        String profissaoCorretorApartamento = scanner.next();
        System.out.println(" Conjuge: ");
        String conjugeCorretorApartamento = scanner.next();

        System.out.println("Digite as informações do endereço do Corretor do imóvel:");
        System.out.println(" CEP: ");
        String cepCorretorApartamento = scanner.next();
        System.out.println(" Estado: ");
        String estadoCorretorApartamento = scanner.next();
        System.out.println(" Cidade: ");
        String cidadeCorretorApartamento = scanner.next();
        System.out.println(" Bairro: ");
        String bairroCorretorApartamento = scanner.next();
        System.out.println(" Rua: ");
        String ruaCorretorApartamento = scanner.next();
        System.out.println(" Número: ");
        String numeroCorretorApartamento = scanner.next();
        System.out.println(" Complemento: ");
        String complementoCorretorApartamento = scanner.next();

        Endereco enderecoCorretor = new Endereco()
                .id(id)
                .cep(cepCorretorApartamento)
                .estado(estadoCorretorApartamento)
                .cidade(cidadeCorretorApartamento)
                .bairro(bairroCorretorApartamento)
                .rua(ruaCorretorApartamento)
                .numero(numeroCorretorApartamento)
                .complemento(complementoCorretorApartamento)
                .build();

        Corretor corretorDadosPessoais = (Corretor) new Corretor()
                .nome(nomeCorretorApartamento)
                .sobrenome(sobrenomeCorretorApartamento)
                .email(emailCorretorApartamento)
                .cpf(cpfCorretorApartamento)
                .telefone(telefoneCorretorApartamento)
                .profissao(profissaoCorretorApartamento)
                .conjuge(conjugeCorretorApartamento)
                .endereco(enderecoCorretor)
                .builder();

        System.out.println(corretorDadosPessoais);

    }

    public static void criarProprietario(){

        int id = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as informações sobre o proprietário do imóvel:");
        System.out.println(" Primeiro Nome: ");
        String nomeProprietarioApartamento = scanner.next();
        System.out.println(" Sobrenome: ");
        String sobrenomeProprietarioApartamento = scanner.next();
        System.out.println(" E-mail: ");
        String emailProprietarioApartamento = scanner.next();
        System.out.println(" CPF: ");
        String cpfProprietarioApartamento = scanner.next();
        System.out.println(" Telefone: ");
        String telefoneProprietarioApartamento = scanner.next();
        System.out.println(" Profissão: ");
        String profissaoProprietarioApartamento = scanner.next();
        System.out.println(" Conjuge: ");
        String conjugeProprietarioApartamento = scanner.next();

        System.out.println("Digite as informações do endereço do Proprietario do imóvel:");
        System.out.println(" CEP: ");
        String cepProprietarioApartamento = scanner.next();
        System.out.println(" Estado: ");
        String estadoProprietarioApartamento = scanner.next();
        System.out.println(" Cidade: ");
        String cidadeProprietarioApartamento = scanner.next();
        System.out.println(" Bairro: ");
        String bairroProprietarioApartamento = scanner.next();
        System.out.println(" Rua: ");
        String ruaProprietarioApartamento = scanner.next();
        System.out.println(" Número: ");
        String numeroProprietarioApartamento = scanner.next();
        System.out.println(" Complemento: ");
        String complementoProprietarioApartamento = scanner.next();

        Endereco enderecoProprietario = new Endereco()
                .id(id)
                .cep(cepProprietarioApartamento)
                .estado(estadoProprietarioApartamento)
                .cidade(cidadeProprietarioApartamento)
                .bairro(bairroProprietarioApartamento)
                .rua(ruaProprietarioApartamento)
                .numero(numeroProprietarioApartamento)
                .complemento(complementoProprietarioApartamento)
                .build();

        Proprietario proprietarioDadosPessoais = (Proprietario) new Proprietario()
                .nome(nomeProprietarioApartamento)
                .sobrenome(sobrenomeProprietarioApartamento)
                .email(emailProprietarioApartamento)
                .cpf(cpfProprietarioApartamento)
                .telefone(telefoneProprietarioApartamento)
                .profissao(profissaoProprietarioApartamento)
                .conjuge(conjugeProprietarioApartamento)
                .endereco(enderecoProprietario)
                .builder();

        System.out.println(proprietarioDadosPessoais);

    }

    public static void criarLocatario(){

        int id = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as informações sobre o locatário do imóvel:");
        System.out.println(" Primeiro Nome: ");
        String nomeLocatarioApartamento = scanner.next();
        System.out.println(" Sobrenome: ");
        String sobrenomeLocatarioApartamento = scanner.next();
        System.out.println(" E-mail: ");
        String emailLocatarioApartamento = scanner.next();
        System.out.println(" CPF: ");
        String cpfLocatarioApartamento = scanner.next();
        System.out.println(" Telefone: ");
        String telefoneLocatarioApartamento = scanner.next();
        System.out.println(" Profissão: ");
        String profissaoLocatarioApartamento = scanner.next();
        System.out.println(" Conjuge: ");
        String conjugeLocatarioApartamento = scanner.next();

        System.out.println("Digite as informações do endereço do Locatario do imóvel:");
        System.out.println(" CEP: ");
        String cepLocatarioApartamento = scanner.next();
        System.out.println(" Estado: ");
        String estadoLocatarioApartamento = scanner.next();
        System.out.println(" Cidade: ");
        String cidadeLocatarioApartamento = scanner.next();
        System.out.println(" Bairro: ");
        String bairroLocatarioApartamento = scanner.next();
        System.out.println(" Rua: ");
        String ruaLocatarioApartamento = scanner.next();
        System.out.println(" Número: ");
        String numeroLocatarioApartamento = scanner.next();
        System.out.println(" Complemento: ");
        String complementoLocatarioApartamento = scanner.next();

        Endereco enderecoLocatario = new Endereco()
                .id(id)
                .cep(cepLocatarioApartamento)
                .estado(estadoLocatarioApartamento)
                .cidade(cidadeLocatarioApartamento)
                .bairro(bairroLocatarioApartamento)
                .rua(ruaLocatarioApartamento)
                .numero(numeroLocatarioApartamento)
                .complemento(complementoLocatarioApartamento)
                .build();

        Locatario locatarioDadosPessoais = (Locatario) new Locatario()
                .nome(nomeLocatarioApartamento)
                .sobrenome(sobrenomeLocatarioApartamento)
                .email(emailLocatarioApartamento)
                .cpf(cpfLocatarioApartamento)
                .telefone(telefoneLocatarioApartamento)
                .profissao(profissaoLocatarioApartamento)
                .conjuge(conjugeLocatarioApartamento)
                .endereco(enderecoLocatario)
                .builder();

        System.out.println(locatarioDadosPessoais);

    }
}
