import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Calculadora");
        Calculadora calculadora = new Calculadora();
        System.out.println("Digite o 1º número: ");
        calculadora.numero1 = leitor.nextDouble();
        System.out.println("Digite o 2º número: ");
        calculadora.numero2 = leitor.nextDouble();
        calculadora.somar();
        //calculadora.exibirResultado();
        System.out.println(calculadora.exibir(calculadora.resultado, "Soma"));
        //System.out.println("Subtração = " + calculadora.subtrair());
        double sub = calculadora.subtrair();
        //System.out.println(sub);
        System.out.println(calculadora.exibir(sub, "Subtração"));
        System.out.println(calculadora.dividir());
        calculadora.multiplicacao("Multiplicação");

    }
}
