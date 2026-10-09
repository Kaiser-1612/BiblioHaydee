package br.escola.bibliohaydee.app;

import br.escola.bibliohaydee.model.Autor;
import br.escola.bibliohaydee.model.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o nome do autor");
        String nomeAutor = scanner.nextLine();

        System.out.print("Digite a nacionalidade do autor");
        String nacionalidade = scanner.nextLine();

        System.out.print("Digite o ano de nascimente do autor");
        int anoNascimente = scanner.nextInt();

        Autor autor = new Autor(nomeAutor, nacionalidade, anoNascimente);
        System.out.println("Obrigado pelas informação");

        scanner.close();

        Autor autor1 = new  Autor("Clarice Linspector", "brasileiro", 1980);

        Livro livro = new Livro("Rei das Sombras", 123456789, autor, 2000, "Fantasia");

        System.out.println(livro.toString());

    }



}
