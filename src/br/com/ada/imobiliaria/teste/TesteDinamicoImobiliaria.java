package br.com.ada.imobiliaria.teste;

import br.com.ada.imobiliaria.businessobject.Relatorios;
import br.com.ada.imobiliaria.enumeracao.EnumDiasSemana;
import br.com.ada.imobiliaria.modelo.agenda.Agenda;
import br.com.ada.imobiliaria.modelo.contrato.AssinadoraContrato;
import br.com.ada.imobiliaria.modelo.endereco.Endereco;
import br.com.ada.imobiliaria.modelo.imovel.Apartamento;
import br.com.ada.imobiliaria.modelo.imovel.Imovel;
import br.com.ada.imobiliaria.modelo.pessoas.Corretor;
import br.com.ada.imobiliaria.modelo.pessoas.Locatario;
import br.com.ada.imobiliaria.modelo.pessoas.Proprietario;
import br.com.ada.imobiliaria.repository.ImovelRepository;

import java.util.List;
import java.util.Scanner;

public class TesteDinamicoImobiliaria {

    private static final ImovelRepository imovelRepository = new ImovelRepository();

    public static void main(String[] args) {

        final int SAIR_DO_SISTEMA = 4;
        int opcaoSelecionada = 0;

        int sequence = ImovelRepository.sequence;

        Imovel novoApartamento = null;

        do {
            System.out.println("  Bem-vindo ao sistema da Imobiliária POO  ");
            System.out.println(" Selecione a opção desejada: ");
            System.out.println(" 1 - Cadastrar imóvel ");
            System.out.println(" 2 - Ver imóveis cadastrados ");
            System.out.println(" 3 - Limpar banco de dados de cadastro");
            System.out.println(" 4 - Sair do sistema ");

            Scanner scanner = new Scanner(System.in);
            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    novoApartamento = novocadastro(scanner, imovelRepository);
                    break;
                case 2:
                    imovelRepository.imprimirImoveisCadastrados();
                    break;
                case 3:
                    imovelRepository.limparBancoDeImoveisCadastrados();
                    break;
                case 4:
                    System.out.println(" O sistema está sendo encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcaoSelecionada != SAIR_DO_SISTEMA);

        // Testando assinatura do contrato
        String assinaturaProprietario = "Joao da Silva";

        String assinaturaLocatario = "Maria Fernanda";

        String valorAluguel = "1.200,00";

        Imovel apartamentoAlugado = novoApartamento;

        AssinadoraContrato novoContrato = new AssinadoraContrato(assinaturaProprietario, assinaturaLocatario, apartamentoAlugado, valorAluguel);

        //Testando Agendar visita e enviar email de agendamento

        EnumDiasSemana diaSemana = EnumDiasSemana.SEGUNDA;

        apartamentoAlugado.getAgenda().agendarVisita(apartamentoAlugado, diaSemana);

        // Testando relatórios

        Relatorios<Imovel> relatorioApartamento = new Relatorios<>();

        relatorioApartamento.gerarRelatorioIndividual(apartamentoAlugado);

        // List<Imovel> imoveisCadastrados = List.of(apartamentoAlugado);

        // relatorioApartamento.gerarRelatorioEmLote(imoveisCadastrados);


    }

    public static Imovel novocadastro(Scanner scanner, ImovelRepository imovelRepository) {

        System.out.println("___________ CADASTRO DE NOVO IMÓVEL ______________");

        int opcaoImovel = 0;

        do {
            System.out.println("Digite a opção do imóvel que será cadastrado:");
            System.out.println(" 1 - Apartamento ");
            System.out.println(" 2 - Casa ");

            opcaoImovel = scanner.nextInt();

            switch (opcaoImovel) {

                case 1:
                    int idApartamento = ImovelRepository.sequence;
                    System.out.println("Digite as informações do imóvel:");
                    System.out.println(" Nome para o imóvel: ");
                    String nomeApartamento = scanner.next();
                    System.out.println(" Quantos quartos: ");
                    int quartosApartamento = scanner.nextInt();
                    System.out.println(" Quantos banheiros: ");
                    int banheiroApartamento = scanner.nextInt();
                    System.out.println(" Qual andar: ");
                    int andarApartamento = scanner.nextInt();
                    System.out.println(" Qual tamanho do imóvel, em m2: ");
                    int tamanhoApartamento = scanner.nextInt();
                    System.out.println(" É nascente ? Responder True ou False ");
                    boolean nascenteApartamento = scanner.nextBoolean();
                    System.out.println(" Possui churrasqueira ? Responder True ou False ");
                    boolean churrasqueiraApartamento = scanner.nextBoolean();
                    System.out.println(" Possui piscina ? Responder True ou False ");
                    boolean piscinaApartamento = scanner.nextBoolean();
                    System.out.println("Possui garagem ? Responder True ou False ");
                    boolean garagemApartamento = scanner.nextBoolean();
                    System.out.println(" Possui área de serviço ? Responder True ou False  ");
                    boolean areaServicoApartamento = scanner.nextBoolean();
                    System.out.println(" Possui área de lazer ? Responder True ou False ");
                    boolean areaLazerApartamento = scanner.nextBoolean();
                    System.out.println("Possui academia ? Responder True ou False ");
                    boolean academiaApartamento = scanner.nextBoolean();
                    System.out.println("Possui salão de festas ? Responder True ou False ");
                    boolean salaoFestaApartamento = scanner.nextBoolean();
                    System.out.println(" Possui espaço kids ? Responder True ou False  ");
                    boolean espacoKidsApartamento = scanner.nextBoolean();

                    System.out.println("Digite as informações do endereço do imóvel:");
                    System.out.println(" CEP do imóvel: ");
                    String cepApartamento = scanner.next();
                    System.out.println(" Estado do imóvel: ");
                    String estadoApartamento = scanner.next();
                    System.out.println(" Cidade do imóvel: ");
                    String cidadeApartamento = scanner.next();
                    System.out.println(" Bairro do imóvel: ");
                    String bairroApartamento = scanner.next();
                    System.out.println(" Rua do  imóvel: ");
                    String ruaApartamento = scanner.next();
                    System.out.println(" Numero do imóvel: ");
                    String numeroApartamento = scanner.next();
                    System.out.println(" Complemento imóvel: ");
                    String complementoApartamento = scanner.next();

                    Endereco enderecoImovel = new Endereco()
                            .id(idApartamento)
                            .cep(cepApartamento)
                            .estado(estadoApartamento)
                            .cidade(cidadeApartamento)
                            .bairro(bairroApartamento)
                            .rua(ruaApartamento)
                            .numero(numeroApartamento)
                            .complemento(complementoApartamento)
                            .build();

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
                            .id(idApartamento)
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
                            .id(idApartamento)
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
                            .id(idApartamento)
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

                    Agenda agendaApartamento = new Agenda();

                    Apartamento novoApartamento = (Apartamento) new Apartamento()
                            .quartos(quartosApartamento)
                            .andar(andarApartamento)
                            .areaLazer(areaLazerApartamento)
                            .academia(academiaApartamento)
                            .areaServico(areaServicoApartamento)
                            .banheiros(banheiroApartamento)
                            .churrasqueira(churrasqueiraApartamento)
                            .espacoKids(espacoKidsApartamento)
                            .garagem(garagemApartamento)
                            .nascente(nascenteApartamento)
                            .salaoFesta(salaoFestaApartamento)
                            .piscina(piscinaApartamento)
                            .tamanho(tamanhoApartamento)
                            .nome(nomeApartamento)
                            .endereco(enderecoImovel)
                            .corretor(corretorDadosPessoais)
                            .proprietario(proprietarioDadosPessoais)
                            .locatario(locatarioDadosPessoais)
                            .agenda(agendaApartamento)
                            .build();

                    System.out.println("Cadastro realizado com sucesso");

                    System.out.println(nomeApartamento);

                    return novoApartamento;

                case 2:
                    int idCasa = ImovelRepository.sequence;

                    return null;
                default:
                    System.out.println("Opção inválida");
                    return null;
            }


        } while (opcaoImovel != 1 | opcaoImovel != 2);

    }
}