package br.escola.bibliohaydee.model;

public class Livro {
    String titulo;
    long isbn;

    public String getTitulo() {
        return titulo;
    }

    public long getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    Autor autor;
    int anoDePublicacao;
    String genero;
    boolean disponibilidade;

    public Livro(String tituloLivro, long isbnId, Autor autorLivro, int anoDePublicacaoLivro, String generoLivro) {

        titulo = tituloLivro;
        isbn = isbnId;
        autor = autorLivro;
        anoDePublicacao = anoDePublicacaoLivro;
        genero = generoLivro;
        disponibilidade = true;
    }
    public Livro(String tituloLivro, long isbnId, Autor autorLivro, int anoDePublicacaoLivro){
        this(tituloLivro, isbnId, autorLivro, anoDePublicacaoLivro,"Não informado");
    }
    @Override
    public String toString() {
        return "Nome livro: " + titulo + " - " + autor;
    }
}
