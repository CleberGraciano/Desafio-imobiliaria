package DesafioImobiliaria;

import java.util.List;

public class Imovel {
    private Endereco endereco;
    private double valorAluguel;
    private String nomeFuncionario;
    private List<Morador> moradores;

    public Imovel() {
    }

    public Imovel(Endereco endereco, double valorAluguel, String nomeFuncionario) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.nomeFuncionario = nomeFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Morador> moradores) {
        this.moradores = moradores;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco=" + endereco +
                ", valorAluguel=" + valorAluguel +
                ", nomeFuncionario='" + nomeFuncionario + '\'' +
                ", moradores=" + moradores +
                '}';
    }
}
