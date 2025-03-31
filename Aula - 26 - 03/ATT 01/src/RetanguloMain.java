import java.sql.SQLOutput;

public class RetanguloMain {
    public static void main(String[] args){
        ObjRetangulo R1 = new ObjRetangulo();
        ObjRetangulo R2 = new ObjRetangulo(5.0,5.0);

        R1.setComprimento(3.0);
        R1.setLargura(5.0);

        System.out.println("Dados 1:");
        System.out.println("DIMENSOES => C: " + R1.getComprimento() + " L: " + R1.getLargura());
        System.out.println("Perimetro: " + R1.calculaPerimetro());
        System.out.println("Area: " + R1.calculaArea());
        System.out.println("Quadrado? " + R1.isQuadrado());

        System.out.println();
        
        System.out.println("Dados 2");
        System.out.println("DIMENSOES => C: " + R2.getComprimento() + " L: " + R2.getLargura());
        System.out.println("Perimetro: " + R2.calculaPerimetro());
        System.out.println("Area: " + R2.calculaArea());
        System.out.println("Quadrado? " + R2.isQuadrado());

    }
}