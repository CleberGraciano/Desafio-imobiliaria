package DesafioImobiliaria;

public class Principal {
    public static void main(String[] args) {

        try{
            Sistema.executarSistema();

        } catch (Exception excecao){
            System.out.println(excecao.getMessage());
        }

    }
}

