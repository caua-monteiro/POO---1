package ATT01;

public class UsaVeiculo {
    public static void main(String[] args){
        Veiculo V1, V2;
        V1 = new Automovel();
        V1.verificar();

        V2 = new Bicicleta();
        V2.verificar();
    }
}
