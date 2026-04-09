public class Anime {
    String nome;
    int classificacaoIndicativa;
    String genero;
    String autor;
    int qtdEpisodios;
    int numeroTemporadas;
    String mensagem;

    public int mediaEpisodiosPorTemporada(){
        return qtdEpisodios/numeroTemporadas;
    }
    public String exibirClassificacao(){
        if(classificacaoIndicativa == 10){
            return "Não recomendado para menores de 10 anos";
        } else if (classificacaoIndicativa == 12) {
            return "Não recomendado para menores de 12 anos";
        }else if(classificacaoIndicativa == 14){
            return "Não recomendado para menores de 14 anos";
        } else if (classificacaoIndicativa == 16) {
            return "Não recomendado para menores de 16 anos";
        }else if(classificacaoIndicativa == 18){
            return "Não recomendado para menores de 18 anos";
        }else{
            return "Livre para todos os públicos";
        }
    }

    public void exibirDadosAnime(){
        mensagem = "Nome do anime: " + nome +"\n" +
                "De acordo com o ministério da justiça esse anime é "+ exibirClassificacao() +
                " A média de episódios por temporada é "+ mediaEpisodiosPorTemporada() + ".";
    }
}
