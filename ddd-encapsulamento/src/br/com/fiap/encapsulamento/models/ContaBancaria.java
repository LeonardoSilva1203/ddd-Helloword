package br.com.fiap.encapsulamento.models;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void depositar(double valor) {
        //saldo = valor + saldo;
        if (valor > 0){
            saldo += valor;
    }
    else {
        System.out.println("Valor negativo, Não é possível depositar esse valor");


        }
    }

    public void sacar (double valor){
        //saldo = valor - saldo;
        if(saldo > 0 && valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
        else{
            System.out.println("Saque não permitido");

        }

    }
    public double getSaldo() {
        return saldo;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String novoTitular) {
        this.titular = titular;
    }
}
