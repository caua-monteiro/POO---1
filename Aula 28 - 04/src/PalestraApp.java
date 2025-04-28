public class PalestraApp {
    public static void main(String[] args){
        Palestra p1 = new Palestra(Luz.VERDE);
        Palestra p2 = new Palestra(Luz.AMBAR);
        Palestra p3 = new Palestra(Luz.VERMELHO);

        System.out.println(p1.acessa());
        System.out.println();
        System.out.println(p2.acessa());
        System.out.println();
        System.out.println(p3.acessa());
    }

}
