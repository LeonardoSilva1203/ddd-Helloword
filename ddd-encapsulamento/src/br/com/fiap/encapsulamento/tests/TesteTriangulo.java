package br.com.fiap.encapsulamento.tests;

import br.com.fiap.encapsulamento.models.Triangulo;

public class TesteTriangulo {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.setX(-4);
        t.setY(4);
        t.setZ(4);
        System.out.println(t.valida());
    }
}
