public class Pessoa {
    String nome;
    double altura;
    double peso;

    public double calcularImc(){
        double imc;
        imc = peso / (altura * altura);
        return imc;
        //return peso / (altura * altura);
    }

    public String exibirClassificacao(){
        double imc = calcularImc();
        if(imc < 18.5){
            return "Abaixo do peso";
        }else if (imc < 25){
            return "Peso normal";
        } else if (imc < 30) {
            return "Acima do peso";
        } else if (imc < 35) {
            return "Obesidade I";
        } else if (imc < 40) {
            return "Obesidade II";
        }else{
            return "Obesidade III";
        }
    }
/*
Outra forma de fazer o método exibirClassificacao
    if(calcularImc() < 18.5){
            return "Abaixo do peso";
        }else if (calcularImc() < 25){
            return "Peso normal";
        } else if (calcularImc() < 30) {
            return "Acima do peso";
        } else if (calcularImc() < 35) {
            return "Obesidade I";
        } else if (calcularImc() < 40) {
            return "Obesidade II";
        }else{
            return "Obesidade III";
        }
* */
}
