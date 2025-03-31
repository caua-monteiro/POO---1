import java.util.Scanner;

public class Ponto2DMain {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        ObjPonto2D P1 = new ObjPonto2D();
        ObjPonto2D P2 = new ObjPonto2D(cin.nextDouble(), cin.nextDouble());

        System.out.println("Ponto 01");
        P1.ExibeDados();

        System.out.println("Ponto 02");
        P2.ExibeDados();
    }
}