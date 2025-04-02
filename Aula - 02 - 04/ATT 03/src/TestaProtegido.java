public class TestaProtegido {
    public static void main(String[] args) {
        Protegido exemplo = new Protegido(8);
        System.out.println("x: "+ exemplo.getI());
        ProtegidoSub exemplo1 = new ProtegidoSub(4);
        exemplo1.mudar(12);
        System.out.println("x: "+ exemplo1.getI());
    }
}
/*
*A saida foi 8 e 12 por conta do uso dos construtores e metodos de ajuste/mudar
* O atributo I foi declado como privado para aumentar a seguranca
* e o metodo ajustar foi definido como protected poi assim apenas classes dentro da hierarquia podem usa-lo
*
* */