package DesafioImobiliaria;

import java.util.Scanner;

public class IO {
    public static void mostrarTexto(String texto){

        System.out.println(texto);
    }

    public static Scanner criaScanner(){

        return new Scanner(System.in);
    }
}
