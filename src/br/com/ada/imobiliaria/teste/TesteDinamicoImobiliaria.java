package br.com.ada.imobiliaria.teste;

import br.com.ada.imobiliaria.businessobject.Relatorios;
import br.com.ada.imobiliaria.enumeracao.EnumDiasSemana;
import br.com.ada.imobiliaria.modelo.contrato.AssinadoraContrato;
import br.com.ada.imobiliaria.modelo.imovel.Apartamento;
import br.com.ada.imobiliaria.modelo.imovel.Imovel;
import br.com.ada.imobiliaria.repository.ImovelRepository;

import java.util.List;
import java.util.Scanner;

public class TesteDinamicoImobiliaria {

    private static final ImovelRepository imovelRepository = new ImovelRepository();

    public static void main(String[] args) {

        final int SAIR_DO_SISTEMA = 4;
        int opcaoSelecionada = 0;

        int sequence = ImovelRepository.sequence;

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
                    novocadastro(scanner, imovelRepository);
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
        }while (opcaoSelecionada != SAIR_DO_SISTEMA);

        // Testando assinatura do contrato
        String assinaturaProprietario = "Joao da Silva";

        String assinaturaLocatario = "Maria Fernanda";

        String valorAluguel = "1.200,00";

        Apartamento apartamentoAlugado =  imovelRepository[0];

        AssinadoraContrato novoContrato = new AssinadoraContrato(assinaturaProprietario, assinaturaLocatario, valorAluguel, apartamentoAlugado);

        //Testando Agendar visita e enviar email de agendamento

        EnumDiasSemana diaSemana = EnumDiasSemana.SEGUNDA;

        apartamentoAlugado.getAgenda().agendarVisita(apartamentoAlugado, diaSemana);

        // Testando relatórios

        Relatorios<Imovel> relatorioApartamento = new Relatorios<>();

        relatorioApartamento.gerarRelatorioIndividual(apartamentoAlugado);

        List<Imovel> imoveisCadastrados = List.of(apartamentoAlugado, casaAlugada);

        relatorioApartamento.gerarRelatorioEmLote(imoveisCadastrados);


    }

    public static void novocadastro(Scanner scanner, ImovelRepository imovelRepository){

        System.out.println("___________ CADASTRO DE NOVO IMÓVEL ______________");

        int opcaoImovel = 0 ;

        do{
        System.out.println("Digite a opção do imóvel que será cadastrado:");
        System.out.println(" 1 - Apartamento ");
        System.out.println(" 2 - Casa ");

        opcaoImovel= scanner.nextInt();

            switch (opcaoImovel) {

                case 1:
                    int idApartamento = ImovelRepository.sequence ;
                    System.out.println("Digite as informações do imóvel:");
                    System.out.println(" Nome para o imóvel: ");
                    String nomeApartamento = scanner.next();
                    System.out.println(" Quantos quartos: ");
                    String quartosApartamento = scanner.next();
                    System.out.println(" Quantos banheiros: ");
                    String banheiroApartamento = scanner.next();
                    System.out.println(" Qual andar: ");
                    String andarApartamento = scanner.next();
                    System.out.println(" Qual tamanho do imóvel, em m2: ");
                    String tamanhoApartamento = scanner.next();
                    System.out.println(" É nascente ? Responder True ou False ");
                    String nascenteApartamento = scanner.next();
                    System.out.println(" Possui churrasqueira ? Responder True ou False ");
                    String churrasqueiraApartamento = scanner.next();
                    System.out.println(" Possui piscina ? Responder True ou False ");
                    String piscinaApartamento = scanner.next();
                    System.out.println("Possui garagem ? Responder True ou False ");
                    String garagemApartamento = scanner.next();
                    System.out.println(" Possui área de serviço ? Responder True ou False  ");
                    String areaServicoApartamento = scanner.next();
                    System.out.println(" Possui área de lazer ? Responder True ou False ");
                    String areaLazerApartamento = scanner.next();
                    System.out.println("Possui academia ? Responder True ou False ");
                    String academiaApartamento = scanner.next();
                    System.out.println("Possui salão de festas ? Responder True ou False ");
                    String salaoFestaApartamento = scanner.next();
                    System.out.println(" Possui espaço kids ? Responder True ou False  ");
                    String espacoKidsApartamento = scanner.next();

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

                    System.out.println("Digite as informações sobre o corretor do imóvel:");
                    System.out.println(" Primeiro Nome: ");
                    String nomeCorretorApartamento = scanner.next();
                    System.out.println(" Estado do imóvel: ");
                    String sobrenomeCorretorApartamento = scanner.next();
                    System.out.println(" Cidade do imóvel: ");
                    String emailCorretorApartamento = scanner.next();
                    System.out.println(" Bairro do imóvel: ");
                    String cpfCorretorApartamento = scanner.next();
                    System.out.println(" Rua do  imóvel: ");
                    String telefoneCorretorApartamento = scanner.next();
                    System.out.println(" Numero do imóvel: ");
                    String profissaoCorretorApartamento = scanner.next();
                    System.out.println(" Complemento imóvel: ");
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


                    break;
                case 2:
                    int idCasa = ImovelRepository.sequence ;

                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
        } while ( opcaoImovel != 1 || opcaoImovel != 2);








        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("######## Informe os dados do seus endere�o... ########");

        System.out.println("Digite sua rua:");
        String rua = scanner.next();

        System.out.println("Digite o numero da sua casa:");
        String numero = scanner.next();

        System.out.println("Digite o seu cep:");
        String cep = scanner.next();

        System.out.println("Digite seu bairro:");
        String bairro = scanner.next();

        System.out.println("Digite seu estado ende mora:");
        String estado = scanner.next();

        System.out.println("######## Agora � hora de informar os dados do seu C�ozinho... ########");

        System.out.println("Digite o nome do seu C�o:");
        String nomeCachorro = scanner.next();

        System.out.println("Digite a raca:");
        String raca = scanner.next();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();



    }



}
