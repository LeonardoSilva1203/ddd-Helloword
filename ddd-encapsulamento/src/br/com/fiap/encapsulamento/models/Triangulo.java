package br.com.fiap.encapsulamento.models;

public class Triangulo {
    private double x;
    private double y;
    private double z;
    //Getters devolve o conteúdo do atributo
    public double getX(){
        return  x;
    }
    public double getY(){return  y;}
    public double getZ(){return  z;}

    //Setters => recebem um valor e guardam no atributo

    public void setX(double x) {
        if(x < 0){
            System.out.println("Não é permitido valores negativos, vamos considerar o mesmo valor positivo");
            x = x * -1;
        }
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }

    public String valida(){
        if(x+y>z && x+z>y && y+z >x){
            if(x == y && x == z){
                return "Triângulo equilátero";
            }
            else if (x != y && x != z && y != z){
                return "Triângulo escaleno";
            }
            else{
                return "Triângulo isosceles";
            }
        }else{
            return "Os valores não formam um triângulo";
        }
    }


}
