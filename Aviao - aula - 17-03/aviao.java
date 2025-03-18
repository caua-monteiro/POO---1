public class aviao{
    public static void main(String[] args){
        ObjAviao Voo01 = new ObjAviao();
        Voo01.Fabricante = "Azul";
        Voo01.Modelo = "777";
        Voo01.NumAssentos = 1032;


        Voo01.Embarque();
        Voo01.Ligar();
    }
}