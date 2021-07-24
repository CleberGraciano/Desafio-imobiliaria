package DesafioImobiliaria;

import java.util.ArrayList;
import java.util.List;

public class ListaDeMoradores {
    private static List<Morador> moradores= new ArrayList<>();

    public static void mostrarListaDeMoradores(){
        System.out.println("Mostrar lista de moradores: ");
        for (Morador morador : moradores){
            System.out.println(morador);
        }
    }

    public static void validarMoradorPorCpf(String cpf) throws Exception {
        for (Morador morador : moradores) {
            if (morador.getCpf().equals(cpf)) {
                throw new Exception("Não é possível cadastrar o morador, pois já existe um morador com o mesmo cpf");
            }
        }
    }

    public static void adicionarMorador(Morador morador) throws Exception{
        validarMoradorPorCpf(morador.getCpf());
        moradores.add(morador);
    }

    public static void excluirMoradores(String cpf) throws Exception{
        Morador moradorASerExcluido = null;
        for (Morador morador : moradores){
            if (morador.getCpf().equals(cpf)){
                System.out.println("Morador excluido com sucesso da lista de moradores!");
                moradorASerExcluido = morador;
            }
        }
        moradores.remove(moradorASerExcluido);
        throw new Exception("Não é possível excluir, cpf não cadastrado");
    }

}

