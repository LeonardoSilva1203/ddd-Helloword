import java.util.Scanner;

public class TesteEquacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Equacao eq = new Equacao();
        System.out.println("Digite o valor de A:");
        eq.a = leitor.nextInt();
        System.out.println("Digite o valor de B:");
        eq.b = leitor.nextInt();
        System.out.println("Digite o valor de C:");
        eq.c = leitor.nextInt();
        eq.calcDelta();
        System.out.println("Delta = " + eq.delta + " - " + eq.raiz());
    }
}
