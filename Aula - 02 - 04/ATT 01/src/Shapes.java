public class Shapes {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        t1.setLargura(4.0);
        t1.setAltura(4.0);
        t1.setEstilo("cheio");
        t2.setLargura(8.0);
        t2.setAltura(12.0);
        t2.setEstilo("contorno");
        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.mostraDim();
        System.out.println("Area = " + t1.area());
        System.out.println();
        System.out.println("Info para t2: ");
        t2.mostraEstilo();
        t2.mostraDim();
        System.out.println("Area = " + t2.area());

        Retangulo R1 = new Retangulo();
        Retangulo R2 = new Retangulo();

        R1.setAltura(3.0);
        R1.setLargura(3.0);
        R2.setAltura(6.0);
        R2.setLargura(2.0);

        System.out.println("R1 dados: ");
        System.out.println("AREA: " + R1.area());
        System.out.println("E Quadrado?: " + R1.isQuadrado());

        System.out.println("R2 dados: ");
        System.out.println("AREA: " + R2.area());
        System.out.println("E Quadrado?: " + R2.isQuadrado());
    }
}