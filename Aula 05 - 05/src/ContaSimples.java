public class ContaSimples extends ContaBancaria {
    public ContaSimples(String n){
        super(n);
    }

    @Override
    public void retira(double V) {
        if(V > getSaldo()){
            System.out.println("Saldo insuficiente para retirada");
        }
        else{
            double aux = getSaldo() - V;
            setSaldo(aux);
        }

    }
}
