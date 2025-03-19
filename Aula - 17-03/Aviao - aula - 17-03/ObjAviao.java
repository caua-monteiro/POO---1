public class ObjAviao{
    String Fabricante, Modelo;
    int NumAssentos;

    public void Ligar(){
        System.out.println("Ligando " + Fabricante + " " + Modelo);
    }
    public void Embarque(){
        System.out.println("Chamando todos os " + NumAssentos + " passageiros do aviao " + Fabricante + " " + Modelo);
    }
}
/*Quando os atributos foram mudados para "private" as definicoes de valor para eles nao foram permitidas
  dentro do arquivo "aviao" por falta de acesso*/