import java.util.Scanner;

public class TesteImc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Instanciar um objeto => Criar o objeto
        Pessoa pessoa = new Pessoa();

        System.out.println("Teste seu IMC");
        System.out.println("Digite seu nome: ");
        pessoa.nome = leitor.nextLine();
        System.out.println("Digite sua altura: ");
        pessoa.altura = leitor.nextDouble();
        System.out.println("Digite seu peso em kg: ");
        pessoa.peso = leitor.nextDouble();
        System.out.println("Seu nome é: " + pessoa.nome);
        System.out.println("IMC: " + pessoa.calcularImc());
        System.out.println("De acordo com seu IMC a classificação é: "
                + pessoa.exibirClassificacao());
    }
}
