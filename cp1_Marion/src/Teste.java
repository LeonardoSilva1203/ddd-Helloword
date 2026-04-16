import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        //Primeira correção
        Anime a = new Anime();
        a.nome = "Naruto";
        a.classificacaoIndicativa = 12;
        a.autor = "Masashi Kishimoto";
        a.genero = "Ação";
        a.qtdEpisodios = 220;
        a.numeroTemporadas = 9;
        //Segunda correção
        a.exibirDadosAnime();
        System.out.println(a.mensagem);
    }
}
