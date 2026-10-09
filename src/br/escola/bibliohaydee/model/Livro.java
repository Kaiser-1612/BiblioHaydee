package br.escola.bibliohaydee.model;

public class Livro {
    String titulo;
    int isbn;
    Autor autor;
    int anoDePublicacao;
    String genero;
    boolean disponibilidade;

    public Livro(String tituloLivro, int isbnId, Autor autorLivro, int anoDePublicacaoLivro, String generoLivro) {
        titulo = tituloLivro;
        isbn = isbnId;
        autor = autorLivro;
        anoDePublicacao = anoDePublicacaoLivro;
        genero = generoLivro;
        disponibilidade = true;
    }

    @Override
    public String toString() {
        return "Nome livro: " + titulo + " - " + autor;
    }
}
