public class TesteReceita {
    public static void main(String[] args) {
        Receita boloMilho = new Receita();
        boloMilho.nome = "Bolo de Milho";
        boloMilho.autor = "Vanessa";
        boloMilho.classificacaoCusto = "Custo baixo";
        boloMilho.classificacaoPreparo = "Muito fácil";
        boloMilho.tempoPreparo = 50;
        boloMilho.porcoes = 10;
        boloMilho.descricao = "O bolo de milho.....";
        boloMilho.avaliacao = 4.8;
        System.out.println(boloMilho.nome);
        System.out.println(boloMilho.autor);
        System.out.println(boloMilho.tempoPreparo + " min" + "\t\t" +
                boloMilho.classificacaoPreparo + "\t\t" +
                boloMilho.classificacaoCusto  + "\t\t" +
                boloMilho.porcoes + " porções");
        System.out.println(boloMilho.descricao);
        System.out.println("Avaliação: " + boloMilho.avaliacao);

    }
}
