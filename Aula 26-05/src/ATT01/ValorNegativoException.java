package ATT01;

public class ValorNegativoException extends Exception{
    double quantia;
    public ValorNegativoException(double n){
        super();
        quantia = n;
    }

    @Override
    public String toString() {
        return "voce tentou retirar " + quantia + "que e um valor negativo, tente novamente";
    }
}
