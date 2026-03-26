import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome, id;
        int idade;
        System.out.println("Digite seu nome");
        nome = leitor.nextLine();
        System.out.println("Digite sua idade");
        //idade (int) = leitura no console é texto
        idade = Integer.parseInt(leitor.nextLine());
        idade = leitor.nextInt();

    }
}
