public class ContaEspecial extends ContaBancaria{
    private double adicional;

    public ContaEspecial(String n, double A){
        super(n);
        this.adicional = A;
    }

    @Override
    public void retira(double V) {
        if(V > (getSaldo() + adicional)){
            System.out.println("Saldo insuficiente para retirada");
        }
        else{
            double aux = getSaldo() - V;
            setSaldo(aux);
        }
    }
}
