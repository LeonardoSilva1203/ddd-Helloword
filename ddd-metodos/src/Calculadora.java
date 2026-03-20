public class Calculadora {
   //Atributos
    double numero1;
    double numero2;
    double resultado;

    public void exibirResultado(){
        System.out.println("Resultado = " + resultado);
    }

    public void somar(){
        resultado = numero1 + numero2;
    }
    //Método com retorno
    public double subtrair(){
        return numero1 - numero2;
    }
    //Método com parâmetro
    public String exibir(double valor, String operacao){
        return operacao + " = " + valor;
    }
    //Método multiplicar e dividir
    public String dividir(){
        if(numero2 > 0){
            resultado = numero1 / numero2;
            return "Divisão = " + resultado;
        }
        return "Não é possível dividir";
    }
    public void multiplicacao (String operacao){
        System.out.println(operacao + " = " + numero1 * numero2);
    }
}
