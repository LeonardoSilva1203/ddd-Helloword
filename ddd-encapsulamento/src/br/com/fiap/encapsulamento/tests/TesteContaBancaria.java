package br.com.fiap.encapsulamento.tests;

import br.com.fiap.encapsulamento.models.ContaBancaria;

import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        ContaBancaria cc= new ContaBancaria("1234", "Leoeo");
        System.out.println("Digite o nome do titular: ");
        System.out.println("Digite o número da conta: ");
        System.out.println("Digite o valor do deposito");
        cc.depositar(leitor.nextDouble());
        System.out.println("Após o depósito você ficou com" + cc.getSaldo() +  "na sua conta");
    }
}
