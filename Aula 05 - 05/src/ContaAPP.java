public abstract class ContaAPP {
    public static void main(String[] args){
        // ContaBancaria conta = new ContaBancaria();
        // Nao se pode criar o objeto pois a classe e abstrata
        ContaBancaria conta1 = new ContaSimples("Lucas");
        ContaBancaria conta2 = new ContaEspecial("Jacob", 500.0);
        conta1.setSaldo(700);
        conta2.setSaldo(700);

        conta1.retira(800);
        conta2.retira(800);

        System.out.println("Saldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());

    }
}
