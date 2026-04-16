package br.com.fiap.encapsulamento.models;

public class Investimento {
    private double valor;
    private String tipo;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /*
    * condição => variável/atributo OP_REL valor/Var/Atributo
    * == (igual) | != (diferente) | > (maior) |
    * < (menor) | >= (maior ou igual) |
    * <= (menor ou igual)
    *
    * Atributos do tipo String => equals() | equalsIgnoreCase
    * */
    public double correcao(){
        if(tipo.equalsIgnoreCase("Poupança")){
            return valor * 1.03;
        }else{
            return valor * 1.04; //valor + valor * 4/100 ou valor + valor * 0.04
        }
    }
}
