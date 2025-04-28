package ATT02;

public class Teste {
    public static void main(String[] args){
        System.out.print("Arg 1 e 2 sao iguais?: ");
        System.out.println(igual(args[0], args[1]));

        System.out.print("Args 1 e 2 sao iguais sem Casasensitive?: ");
        System.out.println(igualSMaiuscula(args[0], args[1]));
    }
    public static boolean igual(String P1, String P2){
        return P1.equals(P2);
    }
    public static boolean igualSMaiuscula(String P1, String P2){
        return P1.equalsIgnoreCase(P2);
    }
}
