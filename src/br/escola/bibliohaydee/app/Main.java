package br.escola.bibliohaydee.app;

import br.escola.bibliohaydee.model.Autor;
import br.escola.bibliohaydee.model.Livro;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        List<Livro> listaLivros = new ArrayList<>();
        List<Autor> listaAutores = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("**** MENU DE CADASTRO");
            System.out.println("1. Cadastrar autores");
            System.out.println("2. Casdastrar livros");
            System.out.println("3. Listar todos os livros");
            System.out.println("4. Pesquisar livro por titulo");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do autor: ");
                    String nomeAutor = scanner.nextLine();

                    System.out.print("Digite a nacionalidade do autor: ");
                    String nacionalidade = scanner.nextLine();

                    System.out.print("Digite o ano de nascimente do autor: ");
                    int anoNascimente = scanner.nextInt();

                    Autor autor = new Autor(nomeAutor, nacionalidade, anoNascimente);
                    listaAutores.add(autor);
                    System.out.println("Autor cadastrado com sucesso!");
                    break;

                case 2:
                    if(listaAutores.isEmpty()) {
                        System.out.println("Nenhum Autor cadastrado!");
                        break;
                    }

                    System.out.print("Digite o titulo do livro: ");
                    String tituloLivro = scanner.nextLine();

                    System.out.print("Digite o isbn do livro: ");
                    long isbnId = scanner.nextLong();

                    System.out.print("Digite o ano de publicacao do livro: ");
                    int anoDePublicacao = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o genero do livro: ");
                    String generoLivro = scanner.nextLine();

                    System.out.print("\n--- Selecione o Autor --- ");
                    for (int i = 0; i < listaAutores.size(); i++) {
                        System.out.println("[" + i + "]" + listaAutores.get(i).toString());
                    }
                    System.out.println("Digite o numero correspondente ao autor: ");
                    int indiceAutor = scanner.nextInt();
                    scanner.nextLine();

                    if (indiceAutor < 0 || indiceAutor > listaAutores.size()) {
                        System.out.println("Opcao invalida! Operacao cancelada.\n");
                        break;
                    }
                    Autor autorSelecionado = listaAutores.get(indiceAutor);

                    Livro novolivro = new Livro(tituloLivro, isbnId, autorSelecionado,  anoDePublicacao, generoLivro);
                    listaLivros.add(novolivro);

                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- LIVROS CADASTRADOS ---");
                    if (listaLivros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado ainda.");
                    } else {
                        for (Livro livro :listaLivros){
                            System.out.println(livro.toString());
                        }
                    }
                    break;

                case 4:
                     pesquisarPorTitulo(listaLivros);

                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;

            }
        }


        scanner.close();
    }
    private static void pesquisarPorTitulo(List<Livro> livros) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o titulo do livro: ");
        String termoDigitado = scanner.nextLine();

        if (termoDigitado == null || termoDigitado.trim().isEmpty()) {
            System.out.println("Erro: O termp buscado não pode ser vazio. \n");
            return;
        }
        String termoPadronizado = termoDigitado.trim().toLowerCase();
        boolean encontrouAlgum = false;

        System.out.println("\n--- RESULTADOS DA BUSCA ---");
        for (Livro livro : livros) {
            String tituloLivroPadronizado = livro.getTitulo().trim().toLowerCase();


            if (tituloLivroPadronizado.contains(termoPadronizado)) {
                System.out.println(livro.toString());
                encontrouAlgum = true;
            }

        }
        if (!encontrouAlgum) {
            System.out.println("Nenhum livro encontrado com o termo digitado.");
        }
        System.out.println();
    }
}
