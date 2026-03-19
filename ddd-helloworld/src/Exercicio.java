public class Exercicio {
    //Atributos
    String nome;
    String musculo;
    String descricao;
    String imagem;
    int serie;
    int repeticao;
    double carga;
    double dificuldade;

    //Métodos => Ações
    //Escrevo um trecho de código, esse método pode ser usado várias vezes.
    //public => método público
    //void => é um tipo (vazio) de retorno | É um método SEM RETORNO
    //Nome de método: começa com letra minúscula, usa padrão camelCase, não pode conter carac. especiais;

    public void exibir(){ //Assinatura de um método
        System.out.println("Descrição do exercício");
        System.out.println(nome + "\n" +
                musculo);
        System.out.println(descricao);
        System.out.println("Séries: " + serie);
        System.out.println("Repetições: " + repeticao);
        System.out.println("Carga: "  + carga + " kg");
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("=============================================");
    }

    //MÉTODO COM RETORNO
    //public TIPO_RETORNO nomeMetodo(){}
    //SEMPRE devemos retornar o tipo solicitado e usamos a palavra return valor/variável
    public String exibirComRetorno(){
        String mensagem = "\nDescrição do exercício\n" + nome + "\n" +
                musculo + "\n" +
                descricao + "\n" +
                "Séries: " + serie + "\n" +
                "Repetições: " + repeticao + "\n" +
                "Carga: "  + carga + " kg"  + "\n" +
                "Dificuldade: " + dificuldade +"\n" +
                "=============================================";

        return mensagem;
    }

}
