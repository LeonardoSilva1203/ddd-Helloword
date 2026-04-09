package br.com.fiap.playLivros.tests;


import br.com.fiap.playLivros.model.Editora;
import br.com.fiap.playLivros.model.Livro;

public class TesteLivro {
    public static void main(String[] args) {

        Editora editora = new Editora();
        editora.nome = "Novatec";

        //Instanciar um objeto
      //Tipo nomeObjeto   Construtor
        Livro livro = new Livro("Java 6.0");
        System.out.println(livro.titulo);
        livro.editora = editora;

        System.out.println("O livro " + livro.titulo + " foi publicado pela editora " + livro.editora.nome);
        Livro livroPreferido = new Livro("UML", 50);
    }
}
