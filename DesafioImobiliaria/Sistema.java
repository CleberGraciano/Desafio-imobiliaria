package DesafioImobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public static void cadastrarImovel() throws Exception{


        IO.mostrarTexto("Por favor, digite a rua: \n");
        String rua = IO.criaScanner().next();
        IO.mostrarTexto("Por favor, digite o numero do Imovel: \n");
        int numero = IO.criaScanner().nextInt();
        IO.mostrarTexto("Por favor, digite o bairro do Imovel: ");
        String bairro = IO.criaScanner().next();
        IO.mostrarTexto("Por favor, digite o CEP do Imovel: ");
        String cep = IO.criaScanner().next();
        IO.mostrarTexto("Por favor, digite o complemento do Imovel: ");
        String complemento = IO.criaScanner().next();
        IO.mostrarTexto("Por favor, digite o valor do aluguel do Imovel: ");
        double valorAluguel = IO.criaScanner().nextDouble();
        IO.mostrarTexto("Por favor, digite o nome do funcionario do Imovel: ");
        String nomeFuncionario = IO.criaScanner().next();

        IO.mostrarTexto("Por favor, digite a quantidade de moradores: ");
        int quantidadeMoradores = IO.criaScanner().nextInt();
        Morador morador;

        for(int i=0; i<=quantidadeMoradores; i++){
            IO.mostrarTexto("Por favor, digite o nome do Morador :"+i);
            String nomeMorador = IO.criaScanner().next();
            IO.mostrarTexto("Por favor, digite o cpf do Morador :");
            String cpfMorador = IO.criaScanner().next();
            morador = new Morador(nomeMorador, cpfMorador);
            ListaDeMoradores.adicionarMorador(morador);
        }

        Endereco endereco = new Endereco(rua, numero, bairro, cep, complemento);
        Imovel imovel = new Imovel(endereco, valorAluguel, nomeFuncionario);

    }

    public static void excluirMoradorPorCpf() throws Exception{
        System.out.println("Digite o cpf do morador que você quer exlcuir da lista");
        String cpf = IO.criaScanner().nextLine();
        ListaDeMoradores.excluirMoradores(cpf);
    }

    public static void exibirImoveis() throws Exception{
        List<Imovel> imoveis= new ArrayList<>();
        System.out.println("Mostrar lista de Imoveis: ");
        for (Imovel imovel : imoveis){
            System.out.println(imovel);
        }
        ListaDeMoradores.mostrarListaDeMoradores();
    }

    public static void menu(){
        System.out.println("-------------");
        System.out.println("Digite 1 para cadastrar um Imovel");
        System.out.println("Digite 2 para exibir os Imoveis cadastrados");
        System.out.println("Digite 3 para excluir um morador da lista");
        System.out.println("Digite 4 para sair do programa");
        System.out.println("-------------");
    }



    public static void executarSistema() throws Exception{
        boolean executar = true;

        while (executar == true){
            menu();
            String opcaoEscolhida = IO.criaScanner().next();

            switch (opcaoEscolhida){
                case "1":
                    cadastrarImovel();
                    break;

                case "2":
                    exibirImoveis();
                    break;

                case "3":
                    excluirMoradorPorCpf();
                    break;

                case "4":
                    executar = false;
                    break;
            }

        }
    }
}
