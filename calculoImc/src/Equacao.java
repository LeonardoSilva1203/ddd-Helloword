public class Equacao {
    int a;
    int b;
    int c;
    int delta;
    public void calcDelta(){
        delta = b*b - 4 * a * c;
    }
    public String raiz(){
        if(delta < 0){
            return "Não existe raiz real";
        } else if (delta == 0) {
            return "Existe uma raiz real";
        }else {
            return "Existem duas raizes reais";
        }
    }
}
