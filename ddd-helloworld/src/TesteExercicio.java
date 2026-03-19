public class TesteExercicio {
    public static void main(String[] args) {
        //Instanciar um objeto => Criar um objeto
        //Classe (Tipo) objeto = cria efetivamente o objeto
        Exercicio exercicio1 = new Exercicio();
        exercicio1.nome = "Supino";
        exercicio1.musculo = "Peitoral";
        exercicio1.descricao = "é um exercício ...";
        exercicio1.serie = 3;
        exercicio1.repeticao = 15;
        exercicio1.carga = 70;
        exercicio1.dificuldade = 3;
        exercicio1.imagem = "imagemSupino.jpg";
        exercicio1.exibir();
        System.out.println("Testando o método com retorno");
        System.out.println(exercicio1.exibirComRetorno());

        Exercicio exercicio2 = new Exercicio();
        exercicio2.nome = "Agachamento";
        exercicio2.musculo = "Quadríceps";
        exercicio2.descricao = "Exercício composto para membros inferiores que trabalha pernas e glúteo";
        exercicio2.serie = 4;
        exercicio2.repeticao = 12;
        exercicio2.carga = 80;
        exercicio2.dificuldade = 4;
        exercicio2.imagem = "imagemAgachamento.jpg";
        exercicio2.exibir();

    }
}
