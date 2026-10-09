package br.escola.bibliohaydee.model;

public class Autor {
    String nome;
    String nacionalidade;
    int anoNascimento;


    public Autor(String nomeAutor, String nacionalidadeAutor, int anoNascimentoAutor) {
        nome = nomeAutor;
        nacionalidade = nacionalidadeAutor;
        anoNascimento = anoNascimentoAutor;
    }

    @Override
    public String toString() {
        return "Autor: "+ nome
                +" - Nacionalidade: "+ nacionalidade + " - Ano de nascimento: " + anoNascimento;
    }
}

