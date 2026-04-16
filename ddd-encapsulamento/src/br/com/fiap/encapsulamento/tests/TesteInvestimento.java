package br.com.fiap.encapsulamento.tests;

import br.com.fiap.encapsulamento.models.Investimento;

import java.util.Scanner;

public class TesteInvestimento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        Investimento investimento = new Investimento();
        System.out.println("Digite o valor do investimento");
        investimento.setValor(leitor.nextDouble());
        System.out.println("Digite o tipo do investimento: Poupança ou Fundo de Renda Fixa");
        investimento.setTipo(leitorTexto.nextLine());
        System.out.println("O valor corrigido do seu investimento é " + investimento.correcao());
    }
}
