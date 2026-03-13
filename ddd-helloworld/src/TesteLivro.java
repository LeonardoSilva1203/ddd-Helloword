public class TesteLivro {
    public static void main(String[] args) {
        //Criar objetos - instanciar
        Livro meuLivro = new Livro();
        meuLivro.titulo = "Harry Potter";
        meuLivro.editora = "editora";
        System.out.println(meuLivro.titulo);
        System.out.println(meuLivro);
        Livro favorito = new Livro();
        System.out.println(favorito);
        Livro l2 = meuLivro;
        System.out.println(l2.titulo);
        System.out.println(l2);
    }
}
