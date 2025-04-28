package ATT01;

public class exemplo01 {
    public static void main(String[] args) {
        System.out.println("Existem " + args.length + " argumentos de linha de comando.");
        System.out.println("Eles s�o:  ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
