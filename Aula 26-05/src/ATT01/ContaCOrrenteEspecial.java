package ATT01;

public class ContaCOrrenteEspecial extends ContaCorrente {
    protected double getTaxaOperacao() {
        return 0.01;
    }
}